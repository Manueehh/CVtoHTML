// Generated from /home/miguel/Documentos/Carrera/Cuarto/Procesadores/practica/CVtoHTML/grammar/antlr/CVParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CVParser}.
 */
public interface CVParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CVParser#cv_grupo}.
	 * @param ctx the parse tree
	 */
	void enterCv_grupo(CVParser.Cv_grupoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#cv_grupo}.
	 * @param ctx the parse tree
	 */
	void exitCv_grupo(CVParser.Cv_grupoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(CVParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(CVParser.GlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CVParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CVParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#cv}.
	 * @param ctx the parse tree
	 */
	void enterCv(CVParser.CvContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#cv}.
	 * @param ctx the parse tree
	 */
	void exitCv(CVParser.CvContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#informacion_personal}.
	 * @param ctx the parse tree
	 */
	void enterInformacion_personal(CVParser.Informacion_personalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#informacion_personal}.
	 * @param ctx the parse tree
	 */
	void exitInformacion_personal(CVParser.Informacion_personalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#persona_decl}.
	 * @param ctx the parse tree
	 */
	void enterPersona_decl(CVParser.Persona_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#persona_decl}.
	 * @param ctx the parse tree
	 */
	void exitPersona_decl(CVParser.Persona_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#campos_persona}.
	 * @param ctx the parse tree
	 */
	void enterCampos_persona(CVParser.Campos_personaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#campos_persona}.
	 * @param ctx the parse tree
	 */
	void exitCampos_persona(CVParser.Campos_personaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#nombre}.
	 * @param ctx the parse tree
	 */
	void enterNombre(CVParser.NombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#nombre}.
	 * @param ctx the parse tree
	 */
	void exitNombre(CVParser.NombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#puesto}.
	 * @param ctx the parse tree
	 */
	void enterPuesto(CVParser.PuestoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#puesto}.
	 * @param ctx the parse tree
	 */
	void exitPuesto(CVParser.PuestoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#ubicacion}.
	 * @param ctx the parse tree
	 */
	void enterUbicacion(CVParser.UbicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#ubicacion}.
	 * @param ctx the parse tree
	 */
	void exitUbicacion(CVParser.UbicacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#email}.
	 * @param ctx the parse tree
	 */
	void enterEmail(CVParser.EmailContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#email}.
	 * @param ctx the parse tree
	 */
	void exitEmail(CVParser.EmailContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#telefono}.
	 * @param ctx the parse tree
	 */
	void enterTelefono(CVParser.TelefonoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#telefono}.
	 * @param ctx the parse tree
	 */
	void exitTelefono(CVParser.TelefonoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#fecha_nacimiento}.
	 * @param ctx the parse tree
	 */
	void enterFecha_nacimiento(CVParser.Fecha_nacimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#fecha_nacimiento}.
	 * @param ctx the parse tree
	 */
	void exitFecha_nacimiento(CVParser.Fecha_nacimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#edad}.
	 * @param ctx the parse tree
	 */
	void enterEdad(CVParser.EdadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#edad}.
	 * @param ctx the parse tree
	 */
	void exitEdad(CVParser.EdadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#imagen_perfil}.
	 * @param ctx the parse tree
	 */
	void enterImagen_perfil(CVParser.Imagen_perfilContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#imagen_perfil}.
	 * @param ctx the parse tree
	 */
	void exitImagen_perfil(CVParser.Imagen_perfilContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#imagen_fondo}.
	 * @param ctx the parse tree
	 */
	void enterImagen_fondo(CVParser.Imagen_fondoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#imagen_fondo}.
	 * @param ctx the parse tree
	 */
	void exitImagen_fondo(CVParser.Imagen_fondoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#enlaces}.
	 * @param ctx the parse tree
	 */
	void enterEnlaces(CVParser.EnlacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#enlaces}.
	 * @param ctx the parse tree
	 */
	void exitEnlaces(CVParser.EnlacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#formacion}.
	 * @param ctx the parse tree
	 */
	void enterFormacion(CVParser.FormacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#formacion}.
	 * @param ctx the parse tree
	 */
	void exitFormacion(CVParser.FormacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#oficial}.
	 * @param ctx the parse tree
	 */
	void enterOficial(CVParser.OficialContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#oficial}.
	 * @param ctx the parse tree
	 */
	void exitOficial(CVParser.OficialContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#centro}.
	 * @param ctx the parse tree
	 */
	void enterCentro(CVParser.CentroContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#centro}.
	 * @param ctx the parse tree
	 */
	void exitCentro(CVParser.CentroContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#añofinal}.
	 * @param ctx the parse tree
	 */
	void enterAñofinal(CVParser.AñofinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#añofinal}.
	 * @param ctx the parse tree
	 */
	void exitAñofinal(CVParser.AñofinalContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#titulo}.
	 * @param ctx the parse tree
	 */
	void enterTitulo(CVParser.TituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#titulo}.
	 * @param ctx the parse tree
	 */
	void exitTitulo(CVParser.TituloContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#planestudio}.
	 * @param ctx the parse tree
	 */
	void enterPlanestudio(CVParser.PlanestudioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#planestudio}.
	 * @param ctx the parse tree
	 */
	void exitPlanestudio(CVParser.PlanestudioContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#facultad}.
	 * @param ctx the parse tree
	 */
	void enterFacultad(CVParser.FacultadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#facultad}.
	 * @param ctx the parse tree
	 */
	void exitFacultad(CVParser.FacultadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#complementaria}.
	 * @param ctx the parse tree
	 */
	void enterComplementaria(CVParser.ComplementariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#complementaria}.
	 * @param ctx the parse tree
	 */
	void exitComplementaria(CVParser.ComplementariaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#horas}.
	 * @param ctx the parse tree
	 */
	void enterHoras(CVParser.HorasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#horas}.
	 * @param ctx the parse tree
	 */
	void exitHoras(CVParser.HorasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#descripcion}.
	 * @param ctx the parse tree
	 */
	void enterDescripcion(CVParser.DescripcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#descripcion}.
	 * @param ctx the parse tree
	 */
	void exitDescripcion(CVParser.DescripcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#certificado}.
	 * @param ctx the parse tree
	 */
	void enterCertificado(CVParser.CertificadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#certificado}.
	 * @param ctx the parse tree
	 */
	void exitCertificado(CVParser.CertificadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#experiencia}.
	 * @param ctx the parse tree
	 */
	void enterExperiencia(CVParser.ExperienciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#experiencia}.
	 * @param ctx the parse tree
	 */
	void exitExperiencia(CVParser.ExperienciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#experiencias}.
	 * @param ctx the parse tree
	 */
	void enterExperiencias(CVParser.ExperienciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#experiencias}.
	 * @param ctx the parse tree
	 */
	void exitExperiencias(CVParser.ExperienciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#experiencia_item}.
	 * @param ctx the parse tree
	 */
	void enterExperiencia_item(CVParser.Experiencia_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#experiencia_item}.
	 * @param ctx the parse tree
	 */
	void exitExperiencia_item(CVParser.Experiencia_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#empresa}.
	 * @param ctx the parse tree
	 */
	void enterEmpresa(CVParser.EmpresaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#empresa}.
	 * @param ctx the parse tree
	 */
	void exitEmpresa(CVParser.EmpresaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#periodo}.
	 * @param ctx the parse tree
	 */
	void enterPeriodo(CVParser.PeriodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#periodo}.
	 * @param ctx the parse tree
	 */
	void exitPeriodo(CVParser.PeriodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#rango_fechas}.
	 * @param ctx the parse tree
	 */
	void enterRango_fechas(CVParser.Rango_fechasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#rango_fechas}.
	 * @param ctx the parse tree
	 */
	void exitRango_fechas(CVParser.Rango_fechasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#jornada}.
	 * @param ctx the parse tree
	 */
	void enterJornada(CVParser.JornadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#jornada}.
	 * @param ctx the parse tree
	 */
	void exitJornada(CVParser.JornadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#responsabilidades}.
	 * @param ctx the parse tree
	 */
	void enterResponsabilidades(CVParser.ResponsabilidadesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#responsabilidades}.
	 * @param ctx the parse tree
	 */
	void exitResponsabilidades(CVParser.ResponsabilidadesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#logros}.
	 * @param ctx the parse tree
	 */
	void enterLogros(CVParser.LogrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#logros}.
	 * @param ctx the parse tree
	 */
	void exitLogros(CVParser.LogrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#habilidades}.
	 * @param ctx the parse tree
	 */
	void enterHabilidades(CVParser.HabilidadesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#habilidades}.
	 * @param ctx the parse tree
	 */
	void exitHabilidades(CVParser.HabilidadesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#habilidades_campos}.
	 * @param ctx the parse tree
	 */
	void enterHabilidades_campos(CVParser.Habilidades_camposContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#habilidades_campos}.
	 * @param ctx the parse tree
	 */
	void exitHabilidades_campos(CVParser.Habilidades_camposContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#hard_skill}.
	 * @param ctx the parse tree
	 */
	void enterHard_skill(CVParser.Hard_skillContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#hard_skill}.
	 * @param ctx the parse tree
	 */
	void exitHard_skill(CVParser.Hard_skillContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#soft_skill}.
	 * @param ctx the parse tree
	 */
	void enterSoft_skill(CVParser.Soft_skillContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#soft_skill}.
	 * @param ctx the parse tree
	 */
	void exitSoft_skill(CVParser.Soft_skillContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#habilidad_lista}.
	 * @param ctx the parse tree
	 */
	void enterHabilidad_lista(CVParser.Habilidad_listaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#habilidad_lista}.
	 * @param ctx the parse tree
	 */
	void exitHabilidad_lista(CVParser.Habilidad_listaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#lenguaje}.
	 * @param ctx the parse tree
	 */
	void enterLenguaje(CVParser.LenguajeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#lenguaje}.
	 * @param ctx the parse tree
	 */
	void exitLenguaje(CVParser.LenguajeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#icono}.
	 * @param ctx the parse tree
	 */
	void enterIcono(CVParser.IconoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#icono}.
	 * @param ctx the parse tree
	 */
	void exitIcono(CVParser.IconoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#nivel_habilidad}.
	 * @param ctx the parse tree
	 */
	void enterNivel_habilidad(CVParser.Nivel_habilidadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#nivel_habilidad}.
	 * @param ctx the parse tree
	 */
	void exitNivel_habilidad(CVParser.Nivel_habilidadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#habilidad}.
	 * @param ctx the parse tree
	 */
	void enterHabilidad(CVParser.HabilidadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#habilidad}.
	 * @param ctx the parse tree
	 */
	void exitHabilidad(CVParser.HabilidadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#idiomas}.
	 * @param ctx the parse tree
	 */
	void enterIdiomas(CVParser.IdiomasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#idiomas}.
	 * @param ctx the parse tree
	 */
	void exitIdiomas(CVParser.IdiomasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#idioma}.
	 * @param ctx the parse tree
	 */
	void enterIdioma(CVParser.IdiomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#idioma}.
	 * @param ctx the parse tree
	 */
	void exitIdioma(CVParser.IdiomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#idioma_campos}.
	 * @param ctx the parse tree
	 */
	void enterIdioma_campos(CVParser.Idioma_camposContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#idioma_campos}.
	 * @param ctx the parse tree
	 */
	void exitIdioma_campos(CVParser.Idioma_camposContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#dialecto}.
	 * @param ctx the parse tree
	 */
	void enterDialecto(CVParser.DialectoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#dialecto}.
	 * @param ctx the parse tree
	 */
	void exitDialecto(CVParser.DialectoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#nivel_idioma}.
	 * @param ctx the parse tree
	 */
	void enterNivel_idioma(CVParser.Nivel_idiomaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#nivel_idioma}.
	 * @param ctx the parse tree
	 */
	void exitNivel_idioma(CVParser.Nivel_idiomaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#bandera}.
	 * @param ctx the parse tree
	 */
	void enterBandera(CVParser.BanderaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#bandera}.
	 * @param ctx the parse tree
	 */
	void exitBandera(CVParser.BanderaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#portfolio}.
	 * @param ctx the parse tree
	 */
	void enterPortfolio(CVParser.PortfolioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#portfolio}.
	 * @param ctx the parse tree
	 */
	void exitPortfolio(CVParser.PortfolioContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#bportfolio}.
	 * @param ctx the parse tree
	 */
	void enterBportfolio(CVParser.BportfolioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#bportfolio}.
	 * @param ctx the parse tree
	 */
	void exitBportfolio(CVParser.BportfolioContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#proyecto}.
	 * @param ctx the parse tree
	 */
	void enterProyecto(CVParser.ProyectoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#proyecto}.
	 * @param ctx the parse tree
	 */
	void exitProyecto(CVParser.ProyectoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#tdesarrollo}.
	 * @param ctx the parse tree
	 */
	void enterTdesarrollo(CVParser.TdesarrolloContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#tdesarrollo}.
	 * @param ctx the parse tree
	 */
	void exitTdesarrollo(CVParser.TdesarrolloContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#rol}.
	 * @param ctx the parse tree
	 */
	void enterRol(CVParser.RolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#rol}.
	 * @param ctx the parse tree
	 */
	void exitRol(CVParser.RolContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#estado}.
	 * @param ctx the parse tree
	 */
	void enterEstado(CVParser.EstadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#estado}.
	 * @param ctx the parse tree
	 */
	void exitEstado(CVParser.EstadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#tecnologias}.
	 * @param ctx the parse tree
	 */
	void enterTecnologias(CVParser.TecnologiasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#tecnologias}.
	 * @param ctx the parse tree
	 */
	void exitTecnologias(CVParser.TecnologiasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVParser#tecnologia}.
	 * @param ctx the parse tree
	 */
	void enterTecnologia(CVParser.TecnologiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVParser#tecnologia}.
	 * @param ctx the parse tree
	 */
	void exitTecnologia(CVParser.TecnologiaContext ctx);
}