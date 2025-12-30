import java.util.*;
import org.antlr.v4.runtime.ParserRuleContext;

import model.*;

public class CVBuilderVisitor extends CVParserBaseVisitor<Object> {

    private final Set<String> identificadores = new HashSet<>();
    private final List<String> warnings = new ArrayList<>();
    private final List<String> errors = new ArrayList<>();

    public List<String> getWarnings() {
        return warnings;
    }

    public List<String> getErrors() {
        return errors;
    }

    private void warn(ParserRuleContext ctx, String msg) {
        int l = ctx.start.getLine();
        int c = ctx.start.getCharPositionInLine();
        warnings.add("Warning at line " + l + ", column " + c + ": " + msg);
    }

    private void error(ParserRuleContext ctx, String msg) {
        int l = ctx.start.getLine();
        int c = ctx.start.getCharPositionInLine();
        errors.add("Error at line " + l + ", column " + c + ": " + msg);
    }

    // Variables globales del bloque Global
    private Map<String, String> variablesGlobales = new HashMap<>();

    // Lista de CVs procesados
    private List<CV> cvs = new ArrayList<>();

    public List<CV> getCVs() {
        return cvs;
    }

    public Map<String, String> getVariablesGlobales() {
        return variablesGlobales;
    }

    // ==================== CV GRUPO ====================
    @Override
    public List<CV> visitCv_grupo(CVParser.Cv_grupoContext ctx) {
        // Procesar bloque Global
        if (ctx.global() != null) {
            visitGlobal(ctx.global());
        }

        // Procesar cada CV
        for (CVParser.CvContext cvCtx : ctx.cv()) {
            CV cv = (CV) visitCv(cvCtx);
            if (cv != null) {
                cvs.add(cv);
            }
        }

        return cvs;
    }

    @Override
    public Object visitGlobal(CVParser.GlobalContext ctx) {
        for (CVParser.VariableContext varCtx : ctx.variable()) {
            String nombre = varCtx.IDENTIFICADOR().getText();
            String valor = limpiarCadena(varCtx.CADENA().getText());
            variablesGlobales.put(nombre, valor);
        }
        return null;
    }

    // ==================== CV ====================
    @Override
    public CV visitCv(CVParser.CvContext ctx) {
        String identificador = ctx.IDENTIFICADOR().getText();

        if (!identificadores.add(identificador)) {
            warn(ctx, "Duplicate CV identifier: " + identificador);
        }

        Persona persona = (Persona) visitInformacion_personal(ctx.informacion_personal());

        @SuppressWarnings("unchecked")
        Map<String, List<? extends Formacion>> formacion = (Map<String, List<? extends Formacion>>) visitFormacion(
                ctx.formacion());

        List<ExperienciaItem> experiencia = new ArrayList<>();
        if (ctx.experiencia() != null) {
            @SuppressWarnings("unchecked")
            List<ExperienciaItem> exp = (List<ExperienciaItem>) visitExperiencia(ctx.experiencia());
            experiencia = exp;
        }

        @SuppressWarnings("unchecked")
        Map<String, Object> habilidades = (Map<String, Object>) visitHabilidades(ctx.habilidades());
        @SuppressWarnings("unchecked")
        List<HardSkill> hardSkills = (List<HardSkill>) habilidades.get("hardSkills");
        SoftSkill softSkills = (SoftSkill) habilidades.get("softSkills");

        @SuppressWarnings("unchecked")
        List<Idioma> idiomas = (List<Idioma>) visitIdiomas(ctx.idiomas());

        List<Proyecto> portfolio = new ArrayList<>();
        if (ctx.portfolio() != null) {
            @SuppressWarnings("unchecked")
            List<Proyecto> port = (List<Proyecto>) visitPortfolio(ctx.portfolio());
            portfolio = port;
        }

        return new CV(identificador, persona, formacion, experiencia,
                hardSkills, softSkills, idiomas, portfolio);
    }

    // ==================== INFORMACIÓN PERSONAL ====================
    @Override
    public Persona visitInformacion_personal(CVParser.Informacion_personalContext ctx) {
        CVParser.Persona_declContext personaCtx = ctx.persona_decl();
        CVParser.Campos_personaContext campos = personaCtx.campos_persona();

        String nombre = limpiarCadena(campos.nombre().CADENA().getText());

        String puesto = null;
        if (campos.puesto().CADENA() != null) {
            puesto = limpiarCadena(campos.puesto().CADENA().getText());
        } else if (campos.puesto().IDENTIFICADOR() != null) {
            puesto = resolveVariable(campos.puesto().IDENTIFICADOR().getText());
        }

        String ubicacion = null;
        if (campos.ubicacion().CADENA() != null) {
            ubicacion = limpiarCadena(campos.ubicacion().CADENA().getText());
        } else if (campos.ubicacion().IDENTIFICADOR() != null) {
            ubicacion = resolveVariable(campos.ubicacion().IDENTIFICADOR().getText());
        }
        String email = campos.email().CORREO().getText();
        String telefono = campos.telefono().TELEFONO_VALOR().getText();

        String fechaNacimiento = null;
        Integer edad = null;

        if (campos.fecha_nacimiento() != null) {
            fechaNacimiento = campos.fecha_nacimiento().FECHA().getText();
        }
        if (campos.edad() != null) {
            edad = Integer.parseInt(campos.edad().EDAD_VALOR().getText());
        }
        if (fechaNacimiento != null) {
            Integer fecha_numero = Integer.parseInt(fechaNacimiento.split("-")[2]);
            if (fecha_numero < 1920 || fecha_numero > 2025) {
                warn(ctx, "Fecha de nacimiento no valida: " + fechaNacimiento);
            }
        }

        if (edad != null && (edad > 100 || edad < 0)) {
            warn(ctx, "Edad no valida: " + edad);
        }

        String imagenPerfil = null;
        if (ctx.imagen_perfil() != null) {
            imagenPerfil = ctx.imagen_perfil().URL().getText();
        }

        String imagenFondo = null;
        if (ctx.imagen_fondo() != null) {
            imagenFondo = ctx.imagen_fondo().URL().getText();
        }

        List<String> enlaces = new ArrayList<>();
        if (ctx.enlaces() != null) {
            for (var url : ctx.enlaces().URL()) {
                enlaces.add(url.getText());
            }
        }

        if (enlaces.size() > 10) {
            warn(ctx, "Mas de 10 enlaces: " + enlaces);
        }

        return new Persona(nombre, puesto, ubicacion, email, telefono,
                fechaNacimiento, edad, imagenPerfil, imagenFondo, enlaces);
    }

    // ==================== FORMACIÓN ====================
    @Override
    public Map<String, List<? extends Formacion>> visitFormacion(CVParser.FormacionContext ctx) {
        Map<String, List<? extends Formacion>> formacion = new HashMap<>();

        List<FormacionOficial> oficiales = new ArrayList<>();
        for (CVParser.OficialContext oficialCtx : ctx.oficial()) {
            oficiales.add((FormacionOficial) visitOficial(oficialCtx));
        }
        formacion.put("Oficial", oficiales);

        if (ctx.complementaria() != null) {
            List<FormacionComplementaria> complementarias = new ArrayList<>();
            complementarias.add((FormacionComplementaria) visitComplementaria(ctx.complementaria()));
            formacion.put("Complementaria", complementarias);
        }

        return formacion;
    }

    @Override
    public FormacionOficial visitOficial(CVParser.OficialContext ctx) {
        String titulo = null;
        if (ctx.titulo().CADENA() != null) {
            titulo = limpiarCadena(ctx.titulo().CADENA().getText());
        } else if (ctx.titulo().IDENTIFICADOR() != null) {
            titulo = resolveVariable(ctx.titulo().IDENTIFICADOR().getText());
        }

        String centro = obtenerValorCentro(ctx.centro());

        String facultad = null;
        if (ctx.facultad() != null) {
            if (ctx.facultad().CADENA() != null) {
                facultad = limpiarCadena(ctx.facultad().CADENA().getText());
            } else if (ctx.facultad().URL() != null) {
                facultad = ctx.facultad().URL().getText();
            } else if (ctx.facultad().IDENTIFICADOR() != null) {
                facultad = resolveVariable(ctx.facultad().IDENTIFICADOR().getText());
            }
        }

        Integer anoFinal = Integer.parseInt(ctx.añofinal().AÑO().getText());

        String planEstudios = null;
        if (ctx.planestudio() != null) {
            if (ctx.planestudio().CADENA() != null) {
                planEstudios = limpiarCadena(ctx.planestudio().CADENA().getText());
            } else if (ctx.planestudio().URL() != null) {
                planEstudios = ctx.planestudio().URL().getText();
            }
        }

        return new FormacionOficial(titulo, centro, facultad, anoFinal, planEstudios);
    }

    @Override
    public FormacionComplementaria visitComplementaria(CVParser.ComplementariaContext ctx) {
        String titulo = null;
        if (ctx.titulo().CADENA() != null) {
            titulo = limpiarCadena(ctx.titulo().CADENA().getText());
        } else if (ctx.titulo().IDENTIFICADOR() != null) {
            titulo = resolveVariable(ctx.titulo().IDENTIFICADOR().getText());
        }

        String centro = obtenerValorCentro(ctx.centro());

        Integer horas = null;
        if (ctx.horas() != null) {
            horas = Integer.parseInt(ctx.horas().DIGITOS().getText());
        }

        String descripcion = null;
        if (ctx.descripcion() != null) {
            descripcion = limpiarCadena(ctx.descripcion().CADENA().getText());
        }

        Integer anoFinal = null;
        if (ctx.añofinal() != null) {
            anoFinal = Integer.parseInt(ctx.añofinal().AÑO().getText());
        }

        boolean certificado = false;
        if (ctx.certificado() != null) {
            String certValue = ctx.certificado().CERTIFICADO_VALOR().getText();
            certificado = certValue.equalsIgnoreCase("SI");
        }

        return new FormacionComplementaria(titulo, centro, horas, descripcion, anoFinal, certificado);
    }

    // ==================== EXPERIENCIA ====================
    @Override
    public List<ExperienciaItem> visitExperiencia(CVParser.ExperienciaContext ctx) {
        List<ExperienciaItem> experiencias = new ArrayList<>();

        for (CVParser.Experiencia_itemContext itemCtx : ctx.experiencias().experiencia_item()) {
            experiencias.add((ExperienciaItem) visitExperiencia_item(itemCtx));
        }

        return experiencias;
    }

    @Override
    public ExperienciaItem visitExperiencia_item(CVParser.Experiencia_itemContext ctx) {
        ExperienciaItem item = new ExperienciaItem();

        if (ctx.empresa().CADENA() != null) {
            item.setEmpresa(limpiarCadena(ctx.empresa().CADENA().getText()));
        } else if (ctx.empresa().IDENTIFICADOR() != null) {
            item.setEmpresa(resolveVariable(ctx.empresa().IDENTIFICADOR().getText()));
        }

        if (ctx.puesto().CADENA() != null) {
            item.setPuesto(limpiarCadena(ctx.puesto().CADENA().getText()));
        } else if (ctx.puesto().IDENTIFICADOR() != null) {
            item.setPuesto(resolveVariable(ctx.puesto().IDENTIFICADOR().getText()));
        }

        item.setUbicacion(limpiarCadena(ctx.ubicacion().CADENA().getText()));

        Periodo periodo = (Periodo) visitPeriodo(ctx.periodo());
        item.setPeriodo(periodo);

        if (ctx.jornada() != null) {
            item.setJornada(limpiarCadena(ctx.jornada().CADENA().getText()));
        }

        if (ctx.descripcion() != null) {
            item.setDescripcion(limpiarCadena(ctx.descripcion().CADENA().getText()));
        }

        if (ctx.responsabilidades() != null) {
            item.setResponsabilidades(limpiarCadena(ctx.responsabilidades().CADENA().getText()));
        }

        if (ctx.logros() != null) {
            item.setLogros(limpiarCadena(ctx.logros().CADENA().getText()));
        }

        if (ctx.tecnologias() != null) {
            @SuppressWarnings("unchecked")
            List<Tecnologia> tecs = (List<Tecnologia>) visitTecnologias(ctx.tecnologias());
            item.setTecnologias(tecs);
        } else {
            item.setTecnologias(new ArrayList<>());
        }

        return item;
    }

    @Override
    public Periodo visitPeriodo(CVParser.PeriodoContext ctx) {
        Periodo periodo = new Periodo();
        CVParser.Rango_fechasContext rango = ctx.rango_fechas();

        periodo.setInicio(rango.FECHA(0).getText());

        if (rango.ACTUALIDAD_KW() != null) {
            periodo.setFin("Actualidad");
        } else {
            periodo.setFin(rango.FECHA(1).getText());
        }

        return periodo;
    }

    // ==================== HABILIDADES ====================
    @Override
    public Map<String, Object> visitHabilidades(CVParser.HabilidadesContext ctx) {
        Map<String, Object> resultado = new HashMap<>();

        CVParser.Habilidades_camposContext campos = ctx.habilidades_campos();

        List<HardSkill> hardSkills = new ArrayList<>();
        for (CVParser.Hard_skillContext hardCtx : campos.hard_skill()) {
            hardSkills.add((HardSkill) visitHard_skill(hardCtx));
        }

        List<String> softSkillsList = new ArrayList<>();
        for (CVParser.Soft_skillContext softCtx : campos.soft_skill()) {
            @SuppressWarnings("unchecked")
            List<String> skills = (List<String>) visitSoft_skill(softCtx);
            softSkillsList.addAll(skills);
        }
        SoftSkill softSkills = new SoftSkill(softSkillsList);

        resultado.put("hardSkills", hardSkills);
        resultado.put("softSkills", softSkills);

        return resultado;
    }

    @Override
    public HardSkill visitHard_skill(CVParser.Hard_skillContext ctx) {
        Tecnologia lenguaje = (Tecnologia) visitLenguaje(ctx.lenguaje());

        String icono = null;
        if (ctx.icono() != null) {
            icono = ctx.icono().URL().getText();
        }

        String descripcion = null;
        if (ctx.descripcion() != null) {
            descripcion = limpiarCadena(ctx.descripcion().CADENA().getText());
        }

        String nivel = ctx.nivel_habilidad().NIVEL_HABILIDAD_TIPO().getText();

        return new HardSkill(lenguaje, icono, descripcion, nivel);
    }

    @Override
    public List<String> visitSoft_skill(CVParser.Soft_skillContext ctx) {
        List<String> habilidades = new ArrayList<>();

        for (var hab : ctx.habilidad_lista().habilidad()) {
            habilidades.add(hab.HABILIDAD_TIPO().getText().replace("_", " "));
        }

        return habilidades;
    }

    // ==================== IDIOMAS ====================
    @Override
    public List<Idioma> visitIdiomas(CVParser.IdiomasContext ctx) {
        List<Idioma> idiomas = new ArrayList<>();

        for (CVParser.Idioma_camposContext idiomaCtx : ctx.idioma().idioma_campos()) {
            idiomas.add((Idioma) visitIdioma_campos(idiomaCtx));
        }

        return idiomas;
    }

    @Override
    public Idioma visitIdioma_campos(CVParser.Idioma_camposContext ctx) {
        Idioma idioma = new Idioma();

        idioma.setDialecto(ctx.dialecto().DIALECTO_TIPO().getText());
        idioma.setNivel_idioma(ctx.nivel_idioma().NIVEL_IDIOMA_TIPO().getText());

        if (ctx.certificado() != null) {
            String certValue = ctx.certificado().CERTIFICADO_VALOR().getText();
            idioma.setCertificado(certValue.equalsIgnoreCase("SI"));
        }

        if (ctx.bandera() != null) {
            idioma.setBandera(ctx.bandera().URL().getText());
        }

        return idioma;
    }

    // ==================== PORTFOLIO ====================
    @Override
    public List<Proyecto> visitPortfolio(CVParser.PortfolioContext ctx) {
        List<Proyecto> proyectos = new ArrayList<>();

        for (CVParser.ProyectoContext proyectoCtx : ctx.bportfolio().proyecto()) {
            proyectos.add((Proyecto) visitProyecto(proyectoCtx));
        }

        return proyectos;
    }

    @Override
    public Proyecto visitProyecto(CVParser.ProyectoContext ctx) {
        Proyecto proyecto = new Proyecto();

        proyecto.setNombre(limpiarCadena(ctx.nombre().CADENA().getText()));
        proyecto.setDescripcion(limpiarCadena(ctx.descripcion().CADENA().getText()));
        proyecto.setTdesarrollo(ctx.tdesarrollo().TDESARROLLO_VALOR().getText().replace("_", " "));
        proyecto.setRol(ctx.rol().ROL_TIPO().getText());
        proyecto.setEstado(ctx.estado().ESTADO_TIPO().getText());

        @SuppressWarnings("unchecked")
        List<Tecnologia> tecs = (List<Tecnologia>) visitTecnologias(ctx.tecnologias());
        proyecto.setTecnologias(tecs);

        if (ctx.enlaces() != null) {
            List<String> enlaces = new ArrayList<>();
            for (var url : ctx.enlaces().URL()) {
                enlaces.add(url.getText());
            }
            proyecto.setEnlaces(enlaces);
        }

        return proyecto;
    }

    // ==================== TECNOLOGÍAS ====================
    @Override
    public List<Tecnologia> visitTecnologias(CVParser.TecnologiasContext ctx) {
        List<Tecnologia> tecnologias = new ArrayList<>();

        for (CVParser.TecnologiaContext tecCtx : ctx.tecnologia()) {
            tecnologias.add((Tecnologia) visitTecnologia(tecCtx));
        }

        return tecnologias;
    }

    @Override
    public Tecnologia visitTecnologia(CVParser.TecnologiaContext ctx) {
        String tipo = ctx.TEC_TIPO().getText();
        String valor = limpiarCadena(ctx.CADENA().getText());
        return new Tecnologia(tipo, valor);
    }

    @Override
    public Tecnologia visitLenguaje(CVParser.LenguajeContext ctx) {
        return (Tecnologia) visitTecnologia(ctx.tecnologia());
    }

    // ==================== UTILIDADES ====================
    private String limpiarCadena(String cadena) {
        // Eliminar comillas al inicio y final
        if (cadena.startsWith("\"") && cadena.endsWith("\"")) {
            return cadena.substring(1, cadena.length() - 1);
        }
        return cadena;
    }

    private String resolveVariable(String key) {
        if (variablesGlobales.containsKey(key)) {
            return variablesGlobales.get(key);
        }
        return key; // Si no existe, devolver la clave tal cual (o lanzar error)
    }

    private String obtenerValorCentro(CVParser.CentroContext ctx) {
        if (ctx.CADENA() != null) {
            return limpiarCadena(ctx.CADENA().getText());
        } else if (ctx.URL() != null) {
            return ctx.URL().getText();
        } else if (ctx.IDENTIFICADOR() != null) {
            return resolveVariable(ctx.IDENTIFICADOR().getText());
        }
        return null;
    }
}
