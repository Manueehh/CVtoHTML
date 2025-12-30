package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import model.*;

public class LectorTxt {

    private String rutaArchivo;
    private String contenido;

    public LectorTxt(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
        this.contenido = "";
    }

    public String leerArchivo() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                sb.append(linea).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        contenido = sb.toString();
        return contenido;
    }

    public static String extraerIdentificadorCV(String contenido) {
        String regex = "cv\\s+CV\\s*\\{\\s*(\\w+)";
        Matcher m = Pattern.compile(regex, Pattern.DOTALL).matcher(contenido);
        if (m.find())
            return m.group(1);
        return null;
    }

    public static Map<String, String> extraerVariablesGlobales(String contenido) {

        Map<String, String> vars = new HashMap<>();
        String regexGlobal = "\\(global\\s+Global\\s*\\{([^}]*)\\}\\)";
        Matcher mGlobal = Pattern.compile(regexGlobal, Pattern.DOTALL).matcher(contenido);

        if (!mGlobal.find())
            return vars;

        String cuerpoGlobal = mGlobal.group(1);

        String regexVar = "\\(variable\\s+(\\w+)\\s*=\\s*\"([^\"]+)\"\\s*;\\)";
        Matcher mVar = Pattern.compile(regexVar).matcher(cuerpoGlobal);

        while (mVar.find()) {
            String nombre = mVar.group(1);
            String valor = mVar.group(2);
            vars.put(nombre, valor);
        }

        return vars;
    }

    public static Persona parsearInformacionPersonal(String seccion, Map<String, String> variablesGlobales) {
        String regexCampo = "\\(([\\p{L}\\p{N}_]+)\\s+[\\p{L}\\p{N}_]+\\s*:\\s*([^;]+)\\s*;\\)";
        Matcher m = Pattern.compile(regexCampo).matcher(seccion);

        Map<String, Object> campos = new HashMap<>();

        while (m.find()) {
            String campo = m.group(1).toLowerCase();
            String valor = m.group(2).trim();

            boolean esCadenaConComillas = valor.startsWith("\"") && valor.endsWith("\"");

            if (!esCadenaConComillas && valor.contains(",")) {
                List<String> lista = Arrays.stream(valor.split(",")).map(String::trim).collect(Collectors.toList());
                campos.put(campo, lista);
            } else {
                if (valor.startsWith("\"") && valor.endsWith("\"")) {
                    valor = valor.substring(1, valor.length() - 1).trim();
                }

                if (variablesGlobales.containsKey(valor)) {
                    valor = variablesGlobales.get(valor);
                }
                campos.put(campo, valor);
            }
        }

        String nombre = (String) campos.get("nombre");
        String puesto = (String) campos.get("puesto");
        String ubicacion = (String) campos.get("ubicacion");
        String email = (String) campos.get("email");
        String telefono = (String) campos.get("telefono");

        Integer edad = null;
        if (campos.containsKey("edad")) {
            edad = Integer.parseInt(((String) campos.get("edad")).trim());
        }
        String fechaNacimiento = (String) campos.getOrDefault("fecha", null);
        String imagenPerfil = (String) campos.getOrDefault("imagen_de_perfil", null);
        String imagenFondo = (String) campos.getOrDefault("imagen_de_fondo", null);

        List<String> enlaces = null;

        if (campos.containsKey("enlaces")) {
            Object v = campos.get("enlaces");

            if (v instanceof List<?>) {
                enlaces = ((List<?>) v).stream().map(Object::toString).collect(Collectors.toList());
            } else if (v instanceof String) {
                enlaces = Arrays.asList(((String) v).trim());
            }
        }

        Persona persona = new Persona(nombre, puesto, ubicacion, email, telefono, fechaNacimiento, edad, imagenPerfil,
                imagenFondo, enlaces);
        return persona;
    }

    public static Map<String, List<? extends Formacion>> parsearFormacion(String seccion,
            Map<String, String> variablesGlobales) {
        List<FormacionOficial> oficiales = new ArrayList<>();
        List<FormacionComplementaria> complementarias = new ArrayList<>();

        List<String> bloquesOficial = extraerBloques(seccion, "oficial");
        List<String> bloquesComplementaria = extraerBloques(seccion, "complementaria");

        for (String bloque : bloquesOficial) {
            String contenido = bloque.replaceFirst("^\\(oficial\\s+\\w+\\s*\\(", "").replaceAll("\\)\\)$", "");
            Map<String, Object> campos = parsearCamposGenerico(contenido, variablesGlobales);
            campos.forEach((k, v) -> System.out.println("KEY=" + k + " VALUE=" + v));
            FormacionOficial fOf = new FormacionOficial(
                    (String) campos.get("titulo"),
                    (String) campos.get("centro"),
                    (String) campos.getOrDefault("facultad", null),
                    Integer.parseInt(((String) campos.get("añofinal")).trim()),
                    (String) campos.getOrDefault("planestudio", null));
            oficiales.add(fOf);
        }

        for (String bloque : bloquesComplementaria) {
            String contenido = bloque.replaceFirst("^\\(complementaria\\s+\\w+\\s*\\(", "").replaceAll("\\)\\)$", "");
            Map<String, Object> campos = parsearCamposGenerico(contenido, variablesGlobales);

            FormacionComplementaria fCom = new FormacionComplementaria(
                    (String) campos.get("titulo"),
                    (String) campos.get("centro"),
                    campos.get("horas") != null ? Integer.parseInt(((String) campos.get("horas")).trim()) : null,
                    (String) campos.getOrDefault("descripcion", null),
                    campos.get("añofinal") != null ? Integer.parseInt(((String) campos.get("añofinal")).trim()) : null,
                    "si".equalsIgnoreCase((String) campos.get("certificado")));
            complementarias.add(fCom);
        }

        Map<String, List<? extends Formacion>> resultado = new HashMap<>();
        resultado.put("oficial", oficiales);
        resultado.put("complementaria", complementarias);

        return resultado;
    }

    public static Map<String, Object> parsearCamposGenerico(String contenido, Map<String, String> variablesGlobales) {
        Map<String, Object> campos = new HashMap<>();

        String regexCampo = "\\(([\\p{L}\\p{N}_]+)\\s+[\\p{L}\\p{N}_]+\\s*:\\s*([^;]+)\\s*;\\s*\\)";
        Matcher m = Pattern.compile(regexCampo).matcher(contenido);

        while (m.find()) {
            String campo = m.group(1);
            String valor = m.group(2).trim();

            boolean esCadenaConComillas = valor.startsWith("\"") && valor.endsWith("\"");
            boolean esListaEstructural = valor.matches(".*\\([^\\)]*\\).*\\([^\\)]*\\).*");

            if (esListaEstructural) {
                List<String> elementos = new ArrayList<>();
                Matcher sub = Pattern.compile("\\([^\\)]*\\)").matcher(valor);
                while (sub.find())
                    elementos.add(sub.group());
                campos.put(campo, elementos);
                continue;
            }

            if (esCadenaConComillas) {
                valor = valor.substring(1, valor.length() - 1).trim();
            }

            if (variablesGlobales.containsKey(valor)) {
                valor = variablesGlobales.get(valor);
            }

            campos.put(campo, valor);
        }

        return campos;
    }

    private static List<String> extraerBloques(String seccion, String tipo) {

        List<String> bloques = new ArrayList<>();
        String regexInicio = "\\(" + tipo + "\\s+\\w+\\s*\\(";
        Matcher m = Pattern.compile(regexInicio, Pattern.DOTALL).matcher(seccion);

        while (m.find()) {
            int start = m.start();
            int open = 0;
            boolean started = false;

            for (int i = start; i < seccion.length(); i++) {
                char c = seccion.charAt(i);

                if (c == '(') {
                    open++;
                    started = true;
                } else if (c == ')') {
                    open--;
                }

                if (started && open == 0) {
                    bloques.add(seccion.substring(start, i + 1));
                    break;
                }
            }
        }
        return bloques;
    }

    private static List<String> extraerExperienciaItems(String seccion) {

        List<String> bloques = new ArrayList<>();
        String regex = "\\(experiencia_item\\s+[\\p{L}\\p{N}_]+\\s*\\(";
        Matcher m = Pattern.compile(regex).matcher(seccion);

        while (m.find()) {
            int start = m.start();
            int open = 0;
            boolean started = false;

            for (int i = start; i < seccion.length(); i++) {
                char c = seccion.charAt(i);

                if (c == '(') {
                    open++;
                    started = true;
                } else if (c == ')') {
                    open--;
                }

                if (started && open == 0) {
                    bloques.add(seccion.substring(start, i + 1));
                    break;
                }
            }
        }
        return bloques;
    }

    private static List<ExperienciaItem> parsearExperienciaItems(String seccion,
            Map<String, String> variablesGlobales) {
        List<ExperienciaItem> trabajos = new ArrayList<>();

        List<String> items = extraerExperienciaItems(seccion);

        for (String item : items) {
            String contenido = item.replaceFirst("^\\(experiencia_item\\s+\\w+\\s*\\(", "").replaceAll("\\)\\)$", "");

            Map<String, Object> campos = parsearCamposGenerico(contenido, variablesGlobales);

            ExperienciaItem trabajo = new ExperienciaItem();

            trabajo.setEmpresa((String) campos.get("empresa"));
            trabajo.setPuesto((String) campos.get("puesto"));
            trabajo.setUbicacion((String) campos.get("ubicacion"));
            trabajo.setJornada((String) campos.getOrDefault("jornada", null));
            trabajo.setDescripcion((String) campos.getOrDefault("descripcion", null));
            trabajo.setResponsabilidades((String) campos.getOrDefault("responsabilidades", null));
            trabajo.setLogros((String) campos.getOrDefault("logros", null));

            List<Tecnologia> tecnologias = extraerTecnologias(contenido);
            trabajo.setTecnologias(tecnologias);

            if (campos.containsKey("periodo")) {
                String rawPeriodo = (String) campos.get("periodo");

                Matcher mmm = Pattern.compile("(\\d{2}-\\d{2}-\\d{4}|Actualidad)").matcher(rawPeriodo);

                List<String> fechas = new ArrayList<>();
                while (mmm.find()) {
                    fechas.add(mmm.group());
                }

                Periodo periodo = new Periodo();

                periodo.setInicio(fechas.size() > 0 ? fechas.get(0) : null);
                periodo.setFin(fechas.size() > 1 ? fechas.get(1) : null);

                trabajo.setPeriodo(periodo);
            }

            trabajos.add(trabajo);
        }
        return trabajos;
    }

    private static List<Tecnologia> extraerTecnologias(String contenido) {

        List<Tecnologia> lista = new ArrayList<>();

        Pattern inicioPat = Pattern.compile("\\(tecnologias\\s+[\\p{L}\\p{N}_]+\\s*:");
        Matcher mi = inicioPat.matcher(contenido);

        if (!mi.find())
            return lista;

        int start = mi.start();

        int open = 0;
        int end = -1;

        for (int i = start; i < contenido.length(); i++) {
            char c = contenido.charAt(i);

            if (c == '(')
                open++;
            else if (c == ')')
                open--;

            if (open == 0) {
                end = i;
                break;
            }
        }

        if (end == -1)
            return lista;

        String bloque = contenido.substring(start, end + 1);

        Matcher mTec = Pattern
                .compile("\\(tecnologia\\s+([\\p{L}\\p{N}_]+)\\s*:\\s*\"?([^\";]+)\"?\\s*;\\)", Pattern.DOTALL)
                .matcher(bloque);

        while (mTec.find()) {
            String tipo = mTec.group(1).trim();
            String valor = mTec.group(2).trim();

            lista.add(new Tecnologia(tipo, valor));
        }

        return lista;
    }

    private static String extraerBloqueHardSkills(String seccion) {

        String regexInicio = "\\(habilidades_campos\\s+Hard_skills\\s*\\(";
        Matcher m = Pattern.compile(regexInicio).matcher(seccion);

        if (!m.find())
            return null;

        int start = m.start();
        int open = 0;
        boolean started = false;

        for (int i = start; i < seccion.length(); i++) {
            char c = seccion.charAt(i);

            if (seccion.startsWith(" Soft_skills", i)) {
                return seccion.substring(start, i).trim();
            }

            if (c == '(') {
                open++;
                started = true;
            } else if (c == ')') {
                open--;
            }

            if (started && open == 0) {
                return seccion.substring(start, i + 1);
            }
        }

        return null;
    }

    private static List<HardSkill> parsearHardSkills(String hard, Map<String, String> variablesGlobales) {
        List<String> bloques = new ArrayList<>();

        List<HardSkill> hardSkills = new ArrayList<>();

        String regex = "\\(hard_skill\\s*\\(";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(hard);

        while (m.find()) {
            int start = m.start();
            int open = 0;
            boolean started = false;

            for (int i = start; i < hard.length(); i++) {
                char c = hard.charAt(i);

                if (c == '(') {
                    open++;
                    started = true;
                } else if (c == ')') {
                    open--;
                }

                if (started && open == 0) {
                    String bloqueCompleto = hard.substring(start, i + 1);
                    bloques.add(bloqueCompleto);
                    break;
                }
            }
        }

        for (String bloque : bloques) {

            String contenido = bloque.replaceFirst("^\\(hard_skill\\s*\\(", "").replaceAll("\\)\\$", "");
            String regexTec = "\\(tecnologia\\s+([\\p{L}\\p{N}_]+)\\s*:\\s*\"?([^\";]+)\"?\\s*;\\)";
            Pattern pTec = Pattern.compile(regexTec);
            Matcher mTec = pTec.matcher(contenido);

            Map<String, Object> campos = parsearCamposGenerico(contenido, variablesGlobales);

            while (mTec.find()) {
                Tecnologia tec = new Tecnologia(mTec.group(1), mTec.group(2));
                String icono = (String) campos.get("icono");
                String descripcion = (String) campos.get("descripcion");
                String nivel_habilidad = (String) campos.get("nivel_habilidad");

                HardSkill skill = new HardSkill(tec, icono, descripcion, nivel_habilidad);

                hardSkills.add(skill);
            }

        }
        return hardSkills;
    }

    public static String extraerBloqueSoftSkills(String seccion) {
        String regexInicio = "Soft_skills\\s*\\(";
        Matcher m = Pattern.compile(regexInicio).matcher(seccion);

        if (!m.find())
            return null;

        int start = m.start();
        int open = 0;
        boolean started = false;

        for (int i = start; i < seccion.length(); i++) {
            char c = seccion.charAt(i);

            if (seccion.startsWith(" Soft_skills", i)) {
                return seccion.substring(start, i).trim();
            }

            if (c == '(') {
                open++;
                started = true;
            } else if (c == ')') {
                open--;
            }

            if (started && open == 0) {
                return seccion.substring(start, i + 1);
            }
        }

        return null;
    }

    public static SoftSkill parsearSoftSkills(String soft, Map<String, String> variablesGlobales) {
        List<String> bloques = new ArrayList<>();
        List<String> listaSkills = new ArrayList<>();

        SoftSkill softSkills = new SoftSkill();

        String regex = "\\(soft_skill\\s*";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(soft);

        while (m.find()) {
            int start = m.start();
            int open = 0;
            boolean started = false;

            for (int i = start; i < soft.length(); i++) {
                char c = soft.charAt(i);

                if (c == '(') {
                    open++;
                    started = true;
                } else if (c == ')') {
                    open--;
                }

                if (started && open == 0) {
                    String bloqueCompleto = soft.substring(start, i + 1);
                    bloques.add(bloqueCompleto);
                    break;
                }
            }
        }
        String contenido = bloques.get(0).replaceFirst("^\\(soft_skill\\s+Habilidad\\s*:\\s*", "")
                .replaceAll("\\)\\s*\\)$", ")").replace("habilidad_lista ", "habilidad_lista ");

        String listaStringSkills = contenido.replace("(habilidad_lista ", "").replace(") ;)", "").trim();

        Matcher mHab = Pattern.compile("\\(habilidad\\s+([^)]+)\\)").matcher(listaStringSkills);

        while (mHab.find()) {
            listaSkills.add(mHab.group(1).trim());
        }
        softSkills.setHabilidades(listaSkills);

        return softSkills;

    }

    public static String extraerBloquesIdiomas(String seccion) {
        List<String> bloques = new ArrayList<>();

        String regex = "\\(idioma(?=\\s*\\()";
        Matcher m = Pattern.compile(regex).matcher(seccion);

        while (m.find()) {
            int start = m.start();
            int open = 0;
            boolean started = false;

            for (int i = start; i < seccion.length(); i++) {
                char c = seccion.charAt(i);

                if (c == '(') {
                    open++;
                    started = true;
                } else if (c == ')') {
                    open--;
                }

                if (started && open == 0) {
                    bloques.add(seccion.substring(start, i + 1));
                    break;
                }
            }
        }
        return bloques.get(0);
    }

    public static List<Idioma> parsearIdiomas(String bloque, Map<String, String> variablesGlobales) {
        List<String> bloques = new ArrayList<>();
        List<Idioma> idiomas = new ArrayList<>();
        String regexIdioma = "\\(idioma_campos\\s*\\(";
        Matcher mIdi = Pattern.compile(regexIdioma).matcher(bloque);

        while (mIdi.find()) {
            int start = mIdi.start();
            int open = 0;
            boolean started = false;

            for (int i = start; i < bloque.length(); i++) {
                char c = bloque.charAt(i);

                if (c == '(') {
                    open++;
                    started = true;
                } else if (c == ')') {
                    open--;
                }

                if (started && open == 0) {
                    bloques.add(bloque.substring(start, i + 1));
                    break;
                }
            }
        }

        for (String bloqueIdi : bloques) {

            String contenido = bloqueIdi.replaceFirst("^\\(idioma_campos\\s*", "").replaceAll("\\)$", "");

            Map<String, Object> campos = parsearCamposGenerico(contenido, variablesGlobales);

            Idioma idioma = new Idioma();

            idioma.setDialecto((String) campos.get("dialecto"));
            idioma.setNivel_idioma((String) campos.get("nivel_idioma"));
            idioma.setCertificado("si".equalsIgnoreCase((String) campos.getOrDefault("certificado", "no")));
            idioma.setBandera((String) campos.getOrDefault("bandera", null));

            idiomas.add(idioma);
        }

        return idiomas;
    }

    public static List<String> extraerProyectos(String seccion) {
        List<String> bloques = new ArrayList<>();

        String regex = "\\(proyecto\\s+Proyecto\\s*\\(";
        Matcher m = Pattern.compile(regex).matcher(seccion);

        while (m.find()) {
            int start = m.start();
            int open = 0;
            boolean started = false;

            for (int i = start; i < seccion.length(); i++) {
                char c = seccion.charAt(i);

                if (c == '(') {
                    open++;
                    started = true;
                } else if (c == ')') {
                    open--;
                }

                if (started && open == 0) {
                    bloques.add(seccion.substring(start, i + 1));
                    break;
                }
            }
        }
        return bloques;
    }

    public static List<Proyecto> parsearProyectos(List<String> bloques, Map<String, String> variablesGlobales) {
        List<Proyecto> proyectos = new ArrayList<>();

        for (String bloque : bloques) {
            String contenido = bloque.replaceFirst("^\\(proyecto\\s+Proyecto\\s*\\(", "").replaceAll("\\)\\)$", "")
                    .replaceAll("<missing [^>]+>", "");

            Map<String, Object> campos = parsearCamposGenerico(contenido, variablesGlobales);

            Proyecto p = new Proyecto();

            p.setNombre((String) campos.get("nombre"));
            p.setDescripcion((String) campos.get("descripcion"));
            p.setTdesarrollo((String) campos.get("tdesarrollo"));

            List<Tecnologia> tecnologias = extraerTecnologias(contenido);
            p.setTecnologias(tecnologias);
            p.setRol((String) campos.get("rol"));
            p.setEstado((String) campos.get("estado"));
            List<String> enlaces = null;

            if (campos.containsKey("enlaces")) {
                Object v = campos.get("enlaces");

                if (v instanceof List<?>) {
                    enlaces = ((List<?>) v).stream().map(Object::toString).collect(Collectors.toList());
                } else if (v instanceof String) {
                    enlaces = Arrays.asList(((String) v).trim());
                }
            }

            p.setEnlaces(enlaces);

            proyectos.add(p);
        }
        return proyectos;
    }

    public static List<String> extraerCVs(String contenido) {

        List<String> lista = new ArrayList<>();

        String regex = "\\(cv\\s+CV\\b";
        Matcher matcher = Pattern.compile(regex).matcher(contenido);

        while (matcher.find()) {

            int start = matcher.start();
            int open = 0;
            boolean started = false;
            int end = -1;

            for (int i = start; i < contenido.length(); i++) {
                char c = contenido.charAt(i);

                if (c == '(') {
                    open++;
                    started = true;
                } else if (c == ')') {
                    open--;
                }

                if (started && open == 0) {
                    end = i;
                    break;
                }
            }

            if (end != -1) {
                lista.add(contenido.substring(start, end + 1));
            }
        }

        return lista;
    }

    public static Map<String, Integer> detectarIndicesSecciones(String cvOriginal) {
        String cv = cvOriginal.replaceAll("\\p{M}", "").toLowerCase();

        Map<String, Integer> indices = new LinkedHashMap<>();

        String[] nombres = {
                "informacion_personal",
                "formacion",
                "experiencia",
                "habilidades",
                "idiomas",
                "portfolio"
        };

        for (String nombre : nombres) {
            String patron = nombre + " seccion";
            int indice = cv.indexOf(patron);

            if (indice != -1) {
                indices.put(nombre, indice);
            }
        }

        return indices;
    }

    public static Map<String, String> extraerBloques(String cv, Map<String, Integer> indices) {

        List<Map.Entry<String, Integer>> lista = indices.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        Map<String, String> bloques = new LinkedHashMap<>();

        for (int i = 0; i < lista.size(); i++) {

            String nombre = lista.get(i).getKey();
            int inicio = lista.get(i).getValue();

            int fin = (i + 1 < lista.size()) ? lista.get(i + 1).getValue() : cv.length();

            bloques.put(nombre, cv.substring(inicio, fin));
        }

        return bloques;
    }

    public static void main(String[] args) {

        String contenido;
        LectorTxt lector = new LectorTxt("salida.txt");
        contenido = lector.leerArchivo();

        List<String> cvs = extraerCVs(contenido);
        Map<String, String> variablesGlobales = extraerVariablesGlobales(contenido);

        for (String cvBruto : cvs) {

            // DETECTAR SECCIONES POR ÍNDICES
            Map<String, Integer> indices = detectarIndicesSecciones(cvBruto);

            // EXTRAER EL TEXTO DE CADA BLOQUE
            Map<String, String> bloques = extraerBloques(cvBruto, indices);

            // IDENTIFICADOR DEL CV
            String identificador = extraerIdentificadorCV(cvBruto);

            // INFORMACIÓN PERSONAL
            Persona persona = parsearInformacionPersonal(bloques.getOrDefault("informacion_personal", ""),
                    variablesGlobales);

            // FORMACIÓN
            Map<String, List<? extends Formacion>> formaciones = bloques.containsKey("formacion")
                    ? parsearFormacion(bloques.get("formacion"), variablesGlobales)
                    : new HashMap<>();

            // EXPERIENCIA (opcional)
            List<ExperienciaItem> trabajos = bloques.containsKey("experiencia")
                    ? parsearExperienciaItems(bloques.get("experiencia"), variablesGlobales)
                    : new ArrayList<>();

            // HABILIDADES (Hard y Soft)
            List<HardSkill> hSkills = new ArrayList<>();
            SoftSkill sSkills = new SoftSkill();

            if (bloques.containsKey("habilidades")) {
                String hard = extraerBloqueHardSkills(bloques.get("habilidades"));
                hSkills = parsearHardSkills(hard, variablesGlobales);

                String soft = extraerBloqueSoftSkills(bloques.get("habilidades"));
                sSkills = parsearSoftSkills(soft, variablesGlobales);
            }

            // IDIOMAS
            List<Idioma> idiomas = bloques.containsKey("idiomas")
                    ? parsearIdiomas(extraerBloquesIdiomas(bloques.get("idiomas")), variablesGlobales)
                    : new ArrayList<>();

            // PORTFOLIO (opcional)
            List<Proyecto> proyectos = bloques.containsKey("portfolio")
                    ? parsearProyectos(extraerProyectos(bloques.get("portfolio")), variablesGlobales)
                    : new ArrayList<>();

            // GENERAR OBJETO FINAL
            CV cv = new CV(identificador, persona, formaciones, trabajos, hSkills, sSkills, idiomas, proyectos);

            System.out.println(cv);
        }
    }
}
