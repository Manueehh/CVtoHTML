// Generated from c:/Users/manue/Desktop/CVtoHTML/grammar/antlr/CVParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CVParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LLAVE_ABRE=1, LLAVE_CIERRA=2, PAREN_ABRE=3, PAREN_CIERRA=4, DOS_PUNTOS=5, 
		PUNTO_Y_COMA=6, COMA=7, FLECHA=8, IGUAL=9, GLOBAL_KW=10, CV_KW=11, SECCION_KW=12, 
		PERSONA_KW=13, INFO_PERSONA_KW=14, NOMBRE_KW=15, PUESTO_KW=16, UBICACION_KW=17, 
		EMAIL_KW=18, TELEFONO_KW=19, FECHA_NACIMIMENTO_KW=20, EDAD_KW=21, IMAGEN_DE_PERFIL_KW=22, 
		IMAGEN_DE_FONDO_KW=23, FORMACION_KW=24, OFICIAL_KW=25, COMPLEMENTARIA_KW=26, 
		CENTRO_KW=27, FACULTAD_KW=28, PLAN_DE_ESTUDIOS_KW=29, TITULO_KW=30, HORAS_KW=31, 
		CERTIFICADO_KW=32, AÑO_KW=33, EXPERIENCIA_KW=34, TRABAJO_KW=35, EMPRESA_KW=36, 
		PERIODO_KW=37, JORNADA_KW=38, DESCRIPCION_KW=39, RESPONSABILIDADES_KW=40, 
		LOGROS_KW=41, TECNOLOGIAS_KW=42, HABILIDADES_KW=43, HARD_SKILLS_KW=44, 
		SOFT_SKILLS_KW=45, LENGUAJE_KW=46, ICONO_KW=47, NIVEL_KW=48, HABILIDAD_KW=49, 
		HABILIDAD_TIPO=50, NIVEL_HABILIDAD_TIPO=51, IDIOMA_KW=52, DIALECTO_KW=53, 
		BANDERA_KW=54, NIVEL_IDIOMA_TIPO=55, DIALECTO_TIPO=56, PORTFOLIO_KW=57, 
		PROYECTO_KW=58, URL_DE_IMAGEN_KW=59, TIEMPO_DE_DESARROLLO_KW=60, ROL_KW=61, 
		ESTADO_KW=62, ENLACES_KW=63, ACTUALIDAD_KW=64, ESTADO_TIPO=65, ROL_TIPO=66, 
		TEC_TIPO=67, INICIO_TELEFONO=68, TELEFONO_VALOR=69, EDAD_VALOR=70, AÑO=71, 
		CERTIFICADO_VALOR=72, CORREO=73, URL=74, FECHA=75, TDESARROLLO_VALOR=76, 
		IDENTIFICADOR=77, DIGITOS=78, WS=79, COMENTARIO_LINEA=80, COMENTARIO_BLOQUE=81, 
		CONTENIDO_LINEA=82, FIN_COMENTARIO_LINEA=83, CONTENIDO_BLOQUE=84, FIN_COMENTARIO_BLOQUE=85, 
		CADENA=86, CADENA_CAMBIO=87;
	public static final int
		RULE_cv_grupo = 0, RULE_global = 1, RULE_variable = 2, RULE_cv = 3, RULE_informacion_personal = 4, 
		RULE_persona_decl = 5, RULE_campos_persona = 6, RULE_nombre = 7, RULE_puesto = 8, 
		RULE_ubicacion = 9, RULE_email = 10, RULE_telefono = 11, RULE_fecha_nacimiento = 12, 
		RULE_edad = 13, RULE_imagen_perfil = 14, RULE_imagen_fondo = 15, RULE_enlaces = 16, 
		RULE_formacion = 17, RULE_oficial = 18, RULE_centro = 19, RULE_añofinal = 20, 
		RULE_titulo = 21, RULE_planestudio = 22, RULE_facultad = 23, RULE_complementaria = 24, 
		RULE_horas = 25, RULE_descripcion = 26, RULE_certificado = 27, RULE_experiencia = 28, 
		RULE_experiencias = 29, RULE_experiencia_item = 30, RULE_empresa = 31, 
		RULE_periodo = 32, RULE_rango_fechas = 33, RULE_jornada = 34, RULE_responsabilidades = 35, 
		RULE_logros = 36, RULE_habilidades = 37, RULE_habilidades_campos = 38, 
		RULE_hard_skill = 39, RULE_soft_skill = 40, RULE_habilidad_lista = 41, 
		RULE_lenguaje = 42, RULE_icono = 43, RULE_nivel_habilidad = 44, RULE_habilidad = 45, 
		RULE_idiomas = 46, RULE_idioma = 47, RULE_idioma_campos = 48, RULE_dialecto = 49, 
		RULE_nivel_idioma = 50, RULE_bandera = 51, RULE_portfolio = 52, RULE_bportfolio = 53, 
		RULE_proyecto = 54, RULE_tdesarrollo = 55, RULE_rol = 56, RULE_estado = 57, 
		RULE_tecnologias = 58, RULE_tecnologia = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"cv_grupo", "global", "variable", "cv", "informacion_personal", "persona_decl", 
			"campos_persona", "nombre", "puesto", "ubicacion", "email", "telefono", 
			"fecha_nacimiento", "edad", "imagen_perfil", "imagen_fondo", "enlaces", 
			"formacion", "oficial", "centro", "añofinal", "titulo", "planestudio", 
			"facultad", "complementaria", "horas", "descripcion", "certificado", 
			"experiencia", "experiencias", "experiencia_item", "empresa", "periodo", 
			"rango_fechas", "jornada", "responsabilidades", "logros", "habilidades", 
			"habilidades_campos", "hard_skill", "soft_skill", "habilidad_lista", 
			"lenguaje", "icono", "nivel_habilidad", "habilidad", "idiomas", "idioma", 
			"idioma_campos", "dialecto", "nivel_idioma", "bandera", "portfolio", 
			"bportfolio", "proyecto", "tdesarrollo", "rol", "estado", "tecnologias", 
			"tecnologia"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "':'", "';'", "','", "'->'", "'='", 
			"'Global'", "'CV'", null, "'Persona'", null, "'Nombre'", "'Puesto'", 
			null, "'Email'", null, "'Fecha_nacimiento'", "'Edad'", "'Imagen_de_perfil'", 
			"'Imagen_de_fondo'", null, "'Oficial'", "'Complementaria'", "'Centro'", 
			"'Facultad'", "'Plan_de_estudios'", null, "'Horas'", "'Certificado'", 
			"'A\\u00F1o'", "'Experiencia'", "'Trabajo'", "'Empresa'", "'Periodo'", 
			"'Jornada'", null, "'Responsabilidades'", "'Logros'", null, "'Habilidades'", 
			"'Hard_skills'", "'Soft_skills'", "'Lenguaje'", "'Icono'", "'Nivel'", 
			"'Habilidad'", null, null, "'Idiomas'", "'Dialecto'", "'Bandera'", null, 
			null, "'Portfolio'", "'Proyecto'", "'Url_de_imagen'", "'Tiempo_de_desarrollo'", 
			"'Rol'", "'Estado'", "'Enlaces'", "'Actualidad'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'//'", 
			"'/*'", null, "'\\n'", null, "'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LLAVE_ABRE", "LLAVE_CIERRA", "PAREN_ABRE", "PAREN_CIERRA", "DOS_PUNTOS", 
			"PUNTO_Y_COMA", "COMA", "FLECHA", "IGUAL", "GLOBAL_KW", "CV_KW", "SECCION_KW", 
			"PERSONA_KW", "INFO_PERSONA_KW", "NOMBRE_KW", "PUESTO_KW", "UBICACION_KW", 
			"EMAIL_KW", "TELEFONO_KW", "FECHA_NACIMIMENTO_KW", "EDAD_KW", "IMAGEN_DE_PERFIL_KW", 
			"IMAGEN_DE_FONDO_KW", "FORMACION_KW", "OFICIAL_KW", "COMPLEMENTARIA_KW", 
			"CENTRO_KW", "FACULTAD_KW", "PLAN_DE_ESTUDIOS_KW", "TITULO_KW", "HORAS_KW", 
			"CERTIFICADO_KW", "A\u0001O_KW", "EXPERIENCIA_KW", "TRABAJO_KW", "EMPRESA_KW", 
			"PERIODO_KW", "JORNADA_KW", "DESCRIPCION_KW", "RESPONSABILIDADES_KW", 
			"LOGROS_KW", "TECNOLOGIAS_KW", "HABILIDADES_KW", "HARD_SKILLS_KW", "SOFT_SKILLS_KW", 
			"LENGUAJE_KW", "ICONO_KW", "NIVEL_KW", "HABILIDAD_KW", "HABILIDAD_TIPO", 
			"NIVEL_HABILIDAD_TIPO", "IDIOMA_KW", "DIALECTO_KW", "BANDERA_KW", "NIVEL_IDIOMA_TIPO", 
			"DIALECTO_TIPO", "PORTFOLIO_KW", "PROYECTO_KW", "URL_DE_IMAGEN_KW", "TIEMPO_DE_DESARROLLO_KW", 
			"ROL_KW", "ESTADO_KW", "ENLACES_KW", "ACTUALIDAD_KW", "ESTADO_TIPO", 
			"ROL_TIPO", "TEC_TIPO", "INICIO_TELEFONO", "TELEFONO_VALOR", "EDAD_VALOR", 
			"A\u0001O", "CERTIFICADO_VALOR", "CORREO", "URL", "FECHA", "TDESARROLLO_VALOR", 
			"IDENTIFICADOR", "DIGITOS", "WS", "COMENTARIO_LINEA", "COMENTARIO_BLOQUE", 
			"CONTENIDO_LINEA", "FIN_COMENTARIO_LINEA", "CONTENIDO_BLOQUE", "FIN_COMENTARIO_BLOQUE", 
			"CADENA", "CADENA_CAMBIO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CVParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CVParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cv_grupoContext extends ParserRuleContext {
		public GlobalContext global() {
			return getRuleContext(GlobalContext.class,0);
		}
		public List<CvContext> cv() {
			return getRuleContexts(CvContext.class);
		}
		public CvContext cv(int i) {
			return getRuleContext(CvContext.class,i);
		}
		public Cv_grupoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cv_grupo; }
	}

	public final Cv_grupoContext cv_grupo() throws RecognitionException {
		Cv_grupoContext _localctx = new Cv_grupoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cv_grupo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			global();
			setState(122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121);
				cv();
				}
				}
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CV_KW );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GlobalContext extends ParserRuleContext {
		public TerminalNode GLOBAL_KW() { return getToken(CVParser.GLOBAL_KW, 0); }
		public TerminalNode LLAVE_ABRE() { return getToken(CVParser.LLAVE_ABRE, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(CVParser.LLAVE_CIERRA, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public GlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global; }
	}

	public final GlobalContext global() throws RecognitionException {
		GlobalContext _localctx = new GlobalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_global);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(GLOBAL_KW);
			setState(127);
			match(LLAVE_ABRE);
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				variable();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFICADOR );
			setState(133);
			match(LLAVE_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(CVParser.IDENTIFICADOR, 0); }
		public TerminalNode IGUAL() { return getToken(CVParser.IGUAL, 0); }
		public TerminalNode CADENA() { return getToken(CVParser.CADENA, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IDENTIFICADOR);
			setState(136);
			match(IGUAL);
			setState(137);
			match(CADENA);
			setState(138);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CvContext extends ParserRuleContext {
		public TerminalNode CV_KW() { return getToken(CVParser.CV_KW, 0); }
		public TerminalNode LLAVE_ABRE() { return getToken(CVParser.LLAVE_ABRE, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(CVParser.IDENTIFICADOR, 0); }
		public Informacion_personalContext informacion_personal() {
			return getRuleContext(Informacion_personalContext.class,0);
		}
		public FormacionContext formacion() {
			return getRuleContext(FormacionContext.class,0);
		}
		public HabilidadesContext habilidades() {
			return getRuleContext(HabilidadesContext.class,0);
		}
		public IdiomasContext idiomas() {
			return getRuleContext(IdiomasContext.class,0);
		}
		public TerminalNode LLAVE_CIERRA() { return getToken(CVParser.LLAVE_CIERRA, 0); }
		public ExperienciaContext experiencia() {
			return getRuleContext(ExperienciaContext.class,0);
		}
		public PortfolioContext portfolio() {
			return getRuleContext(PortfolioContext.class,0);
		}
		public CvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cv; }
	}

	public final CvContext cv() throws RecognitionException {
		CvContext _localctx = new CvContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(CV_KW);
			setState(141);
			match(LLAVE_ABRE);
			setState(142);
			match(IDENTIFICADOR);
			setState(143);
			informacion_personal();
			setState(144);
			formacion();
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(145);
				experiencia();
				}
				break;
			}
			setState(148);
			habilidades();
			setState(149);
			idiomas();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SECCION_KW) {
				{
				setState(150);
				portfolio();
				}
			}

			setState(153);
			match(LLAVE_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Informacion_personalContext extends ParserRuleContext {
		public TerminalNode SECCION_KW() { return getToken(CVParser.SECCION_KW, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(CVParser.PAREN_ABRE, 0); }
		public TerminalNode INFO_PERSONA_KW() { return getToken(CVParser.INFO_PERSONA_KW, 0); }
		public TerminalNode PAREN_CIERRA() { return getToken(CVParser.PAREN_CIERRA, 0); }
		public TerminalNode LLAVE_ABRE() { return getToken(CVParser.LLAVE_ABRE, 0); }
		public Persona_declContext persona_decl() {
			return getRuleContext(Persona_declContext.class,0);
		}
		public TerminalNode LLAVE_CIERRA() { return getToken(CVParser.LLAVE_CIERRA, 0); }
		public EnlacesContext enlaces() {
			return getRuleContext(EnlacesContext.class,0);
		}
		public Imagen_perfilContext imagen_perfil() {
			return getRuleContext(Imagen_perfilContext.class,0);
		}
		public Imagen_fondoContext imagen_fondo() {
			return getRuleContext(Imagen_fondoContext.class,0);
		}
		public Informacion_personalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_informacion_personal; }
	}

	public final Informacion_personalContext informacion_personal() throws RecognitionException {
		Informacion_personalContext _localctx = new Informacion_personalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_informacion_personal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(SECCION_KW);
			setState(156);
			match(PAREN_ABRE);
			setState(157);
			match(INFO_PERSONA_KW);
			setState(158);
			match(PAREN_CIERRA);
			setState(159);
			match(LLAVE_ABRE);
			setState(160);
			persona_decl();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENLACES_KW) {
				{
				setState(161);
				enlaces();
				}
			}

			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMAGEN_DE_PERFIL_KW) {
				{
				setState(164);
				imagen_perfil();
				}
			}

			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMAGEN_DE_FONDO_KW) {
				{
				setState(167);
				imagen_fondo();
				}
			}

			setState(170);
			match(LLAVE_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Persona_declContext extends ParserRuleContext {
		public TerminalNode PERSONA_KW() { return getToken(CVParser.PERSONA_KW, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(CVParser.PAREN_ABRE, 0); }
		public Campos_personaContext campos_persona() {
			return getRuleContext(Campos_personaContext.class,0);
		}
		public TerminalNode PAREN_CIERRA() { return getToken(CVParser.PAREN_CIERRA, 0); }
		public Persona_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_persona_decl; }
	}

	public final Persona_declContext persona_decl() throws RecognitionException {
		Persona_declContext _localctx = new Persona_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_persona_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(PERSONA_KW);
			setState(173);
			match(PAREN_ABRE);
			setState(174);
			campos_persona();
			setState(175);
			match(PAREN_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Campos_personaContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public PuestoContext puesto() {
			return getRuleContext(PuestoContext.class,0);
		}
		public UbicacionContext ubicacion() {
			return getRuleContext(UbicacionContext.class,0);
		}
		public EmailContext email() {
			return getRuleContext(EmailContext.class,0);
		}
		public TelefonoContext telefono() {
			return getRuleContext(TelefonoContext.class,0);
		}
		public Fecha_nacimientoContext fecha_nacimiento() {
			return getRuleContext(Fecha_nacimientoContext.class,0);
		}
		public EdadContext edad() {
			return getRuleContext(EdadContext.class,0);
		}
		public Campos_personaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campos_persona; }
	}

	public final Campos_personaContext campos_persona() throws RecognitionException {
		Campos_personaContext _localctx = new Campos_personaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_campos_persona);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			nombre();
			setState(178);
			puesto();
			setState(179);
			ubicacion();
			setState(180);
			email();
			setState(181);
			telefono();
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FECHA_NACIMIMENTO_KW:
				{
				setState(182);
				fecha_nacimiento();
				}
				break;
			case EDAD_KW:
				{
				setState(183);
				edad();
				}
				break;
			case PAREN_CIERRA:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NombreContext extends ParserRuleContext {
		public TerminalNode NOMBRE_KW() { return getToken(CVParser.NOMBRE_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode CADENA() { return getToken(CVParser.CADENA, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public NombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre; }
	}

	public final NombreContext nombre() throws RecognitionException {
		NombreContext _localctx = new NombreContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(NOMBRE_KW);
			setState(187);
			match(DOS_PUNTOS);
			setState(188);
			match(CADENA);
			setState(189);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PuestoContext extends ParserRuleContext {
		public TerminalNode PUESTO_KW() { return getToken(CVParser.PUESTO_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public TerminalNode CADENA() { return getToken(CVParser.CADENA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(CVParser.IDENTIFICADOR, 0); }
		public PuestoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puesto; }
	}

	public final PuestoContext puesto() throws RecognitionException {
		PuestoContext _localctx = new PuestoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_puesto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(PUESTO_KW);
			setState(192);
			match(DOS_PUNTOS);
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFICADOR || _la==CADENA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(194);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UbicacionContext extends ParserRuleContext {
		public TerminalNode UBICACION_KW() { return getToken(CVParser.UBICACION_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public TerminalNode CADENA() { return getToken(CVParser.CADENA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(CVParser.IDENTIFICADOR, 0); }
		public UbicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ubicacion; }
	}

	public final UbicacionContext ubicacion() throws RecognitionException {
		UbicacionContext _localctx = new UbicacionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ubicacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(UBICACION_KW);
			setState(197);
			match(DOS_PUNTOS);
			setState(198);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFICADOR || _la==CADENA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(199);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmailContext extends ParserRuleContext {
		public TerminalNode EMAIL_KW() { return getToken(CVParser.EMAIL_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode CORREO() { return getToken(CVParser.CORREO, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public EmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_email; }
	}

	public final EmailContext email() throws RecognitionException {
		EmailContext _localctx = new EmailContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_email);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(EMAIL_KW);
			setState(202);
			match(DOS_PUNTOS);
			setState(203);
			match(CORREO);
			setState(204);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TelefonoContext extends ParserRuleContext {
		public TerminalNode TELEFONO_KW() { return getToken(CVParser.TELEFONO_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode TELEFONO_VALOR() { return getToken(CVParser.TELEFONO_VALOR, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public TelefonoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_telefono; }
	}

	public final TelefonoContext telefono() throws RecognitionException {
		TelefonoContext _localctx = new TelefonoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_telefono);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(TELEFONO_KW);
			setState(207);
			match(DOS_PUNTOS);
			setState(208);
			match(TELEFONO_VALOR);
			setState(209);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Fecha_nacimientoContext extends ParserRuleContext {
		public TerminalNode FECHA_NACIMIMENTO_KW() { return getToken(CVParser.FECHA_NACIMIMENTO_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode FECHA() { return getToken(CVParser.FECHA, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public Fecha_nacimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fecha_nacimiento; }
	}

	public final Fecha_nacimientoContext fecha_nacimiento() throws RecognitionException {
		Fecha_nacimientoContext _localctx = new Fecha_nacimientoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fecha_nacimiento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(FECHA_NACIMIMENTO_KW);
			setState(212);
			match(DOS_PUNTOS);
			setState(213);
			match(FECHA);
			setState(214);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EdadContext extends ParserRuleContext {
		public TerminalNode EDAD_KW() { return getToken(CVParser.EDAD_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode EDAD_VALOR() { return getToken(CVParser.EDAD_VALOR, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public EdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edad; }
	}

	public final EdadContext edad() throws RecognitionException {
		EdadContext _localctx = new EdadContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_edad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(EDAD_KW);
			setState(217);
			match(DOS_PUNTOS);
			setState(218);
			match(EDAD_VALOR);
			setState(219);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Imagen_perfilContext extends ParserRuleContext {
		public TerminalNode IMAGEN_DE_PERFIL_KW() { return getToken(CVParser.IMAGEN_DE_PERFIL_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode URL() { return getToken(CVParser.URL, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public Imagen_perfilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imagen_perfil; }
	}

	public final Imagen_perfilContext imagen_perfil() throws RecognitionException {
		Imagen_perfilContext _localctx = new Imagen_perfilContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_imagen_perfil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(IMAGEN_DE_PERFIL_KW);
			setState(222);
			match(DOS_PUNTOS);
			setState(223);
			match(URL);
			setState(224);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Imagen_fondoContext extends ParserRuleContext {
		public TerminalNode IMAGEN_DE_FONDO_KW() { return getToken(CVParser.IMAGEN_DE_FONDO_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode URL() { return getToken(CVParser.URL, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public Imagen_fondoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imagen_fondo; }
	}

	public final Imagen_fondoContext imagen_fondo() throws RecognitionException {
		Imagen_fondoContext _localctx = new Imagen_fondoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_imagen_fondo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(IMAGEN_DE_FONDO_KW);
			setState(227);
			match(DOS_PUNTOS);
			setState(228);
			match(URL);
			setState(229);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EnlacesContext extends ParserRuleContext {
		public TerminalNode ENLACES_KW() { return getToken(CVParser.ENLACES_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public List<TerminalNode> URL() { return getTokens(CVParser.URL); }
		public TerminalNode URL(int i) {
			return getToken(CVParser.URL, i);
		}
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public List<TerminalNode> COMA() { return getTokens(CVParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CVParser.COMA, i);
		}
		public EnlacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enlaces; }
	}

	public final EnlacesContext enlaces() throws RecognitionException {
		EnlacesContext _localctx = new EnlacesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enlaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(ENLACES_KW);
			setState(232);
			match(DOS_PUNTOS);
			setState(233);
			match(URL);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(234);
				match(COMA);
				setState(235);
				match(URL);
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FormacionContext extends ParserRuleContext {
		public TerminalNode SECCION_KW() { return getToken(CVParser.SECCION_KW, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(CVParser.PAREN_ABRE, 0); }
		public TerminalNode FORMACION_KW() { return getToken(CVParser.FORMACION_KW, 0); }
		public TerminalNode PAREN_CIERRA() { return getToken(CVParser.PAREN_CIERRA, 0); }
		public TerminalNode LLAVE_ABRE() { return getToken(CVParser.LLAVE_ABRE, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(CVParser.LLAVE_CIERRA, 0); }
		public List<OficialContext> oficial() {
			return getRuleContexts(OficialContext.class);
		}
		public OficialContext oficial(int i) {
			return getRuleContext(OficialContext.class,i);
		}
		public ComplementariaContext complementaria() {
			return getRuleContext(ComplementariaContext.class,0);
		}
		public FormacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formacion; }
	}

	public final FormacionContext formacion() throws RecognitionException {
		FormacionContext _localctx = new FormacionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_formacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(SECCION_KW);
			setState(244);
			match(PAREN_ABRE);
			setState(245);
			match(FORMACION_KW);
			setState(246);
			match(PAREN_CIERRA);
			setState(247);
			match(LLAVE_ABRE);
			setState(249); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(248);
				oficial();
				}
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OFICIAL_KW );
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMPLEMENTARIA_KW) {
				{
				setState(253);
				complementaria();
				}
			}

			setState(256);
			match(LLAVE_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OficialContext extends ParserRuleContext {
		public TerminalNode OFICIAL_KW() { return getToken(CVParser.OFICIAL_KW, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(CVParser.PAREN_ABRE, 0); }
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public CentroContext centro() {
			return getRuleContext(CentroContext.class,0);
		}
		public AñofinalContext añofinal() {
			return getRuleContext(AñofinalContext.class,0);
		}
		public TerminalNode PAREN_CIERRA() { return getToken(CVParser.PAREN_CIERRA, 0); }
		public FacultadContext facultad() {
			return getRuleContext(FacultadContext.class,0);
		}
		public PlanestudioContext planestudio() {
			return getRuleContext(PlanestudioContext.class,0);
		}
		public OficialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oficial; }
	}

	public final OficialContext oficial() throws RecognitionException {
		OficialContext _localctx = new OficialContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_oficial);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(OFICIAL_KW);
			setState(259);
			match(PAREN_ABRE);
			setState(260);
			titulo();
			setState(261);
			centro();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FACULTAD_KW) {
				{
				setState(262);
				facultad();
				}
			}

			setState(265);
			añofinal();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLAN_DE_ESTUDIOS_KW) {
				{
				setState(266);
				planestudio();
				}
			}

			setState(269);
			match(PAREN_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CentroContext extends ParserRuleContext {
		public TerminalNode CENTRO_KW() { return getToken(CVParser.CENTRO_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public TerminalNode CADENA() { return getToken(CVParser.CADENA, 0); }
		public TerminalNode URL() { return getToken(CVParser.URL, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(CVParser.IDENTIFICADOR, 0); }
		public CentroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_centro; }
	}

	public final CentroContext centro() throws RecognitionException {
		CentroContext _localctx = new CentroContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_centro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(CENTRO_KW);
			setState(272);
			match(DOS_PUNTOS);
			setState(273);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 4105L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(274);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AñofinalContext extends ParserRuleContext {
		public TerminalNode AÑO_KW() { return getToken(CVParser.AÑO_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode AÑO() { return getToken(CVParser.AÑO, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public AñofinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_añofinal; }
	}

	public final AñofinalContext añofinal() throws RecognitionException {
		AñofinalContext _localctx = new AñofinalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_añofinal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(AÑO_KW);
			setState(277);
			match(DOS_PUNTOS);
			setState(278);
			match(AÑO);
			setState(279);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TituloContext extends ParserRuleContext {
		public TerminalNode TITULO_KW() { return getToken(CVParser.TITULO_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public TerminalNode CADENA() { return getToken(CVParser.CADENA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(CVParser.IDENTIFICADOR, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_titulo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(TITULO_KW);
			setState(282);
			match(DOS_PUNTOS);
			setState(283);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFICADOR || _la==CADENA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(284);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlanestudioContext extends ParserRuleContext {
		public TerminalNode PLAN_DE_ESTUDIOS_KW() { return getToken(CVParser.PLAN_DE_ESTUDIOS_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public TerminalNode CADENA() { return getToken(CVParser.CADENA, 0); }
		public TerminalNode URL() { return getToken(CVParser.URL, 0); }
		public PlanestudioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_planestudio; }
	}

	public final PlanestudioContext planestudio() throws RecognitionException {
		PlanestudioContext _localctx = new PlanestudioContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_planestudio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(PLAN_DE_ESTUDIOS_KW);
			setState(287);
			match(DOS_PUNTOS);
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==URL || _la==CADENA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(289);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FacultadContext extends ParserRuleContext {
		public TerminalNode FACULTAD_KW() { return getToken(CVParser.FACULTAD_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public TerminalNode CADENA() { return getToken(CVParser.CADENA, 0); }
		public TerminalNode URL() { return getToken(CVParser.URL, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(CVParser.IDENTIFICADOR, 0); }
		public FacultadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facultad; }
	}

	public final FacultadContext facultad() throws RecognitionException {
		FacultadContext _localctx = new FacultadContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_facultad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(FACULTAD_KW);
			setState(292);
			match(DOS_PUNTOS);
			setState(293);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 4105L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(294);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplementariaContext extends ParserRuleContext {
		public TerminalNode COMPLEMENTARIA_KW() { return getToken(CVParser.COMPLEMENTARIA_KW, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(CVParser.PAREN_ABRE, 0); }
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public CentroContext centro() {
			return getRuleContext(CentroContext.class,0);
		}
		public TerminalNode PAREN_CIERRA() { return getToken(CVParser.PAREN_CIERRA, 0); }
		public HorasContext horas() {
			return getRuleContext(HorasContext.class,0);
		}
		public DescripcionContext descripcion() {
			return getRuleContext(DescripcionContext.class,0);
		}
		public AñofinalContext añofinal() {
			return getRuleContext(AñofinalContext.class,0);
		}
		public CertificadoContext certificado() {
			return getRuleContext(CertificadoContext.class,0);
		}
		public ComplementariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complementaria; }
	}

	public final ComplementariaContext complementaria() throws RecognitionException {
		ComplementariaContext _localctx = new ComplementariaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_complementaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(COMPLEMENTARIA_KW);
			setState(297);
			match(PAREN_ABRE);
			setState(298);
			titulo();
			setState(299);
			centro();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HORAS_KW) {
				{
				setState(300);
				horas();
				}
			}

			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESCRIPCION_KW) {
				{
				setState(303);
				descripcion();
				}
			}

			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AÑO_KW) {
				{
				setState(306);
				añofinal();
				}
			}

			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CERTIFICADO_KW) {
				{
				setState(309);
				certificado();
				}
			}

			setState(312);
			match(PAREN_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HorasContext extends ParserRuleContext {
		public TerminalNode HORAS_KW() { return getToken(CVParser.HORAS_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode DIGITOS() { return getToken(CVParser.DIGITOS, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public HorasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_horas; }
	}

	public final HorasContext horas() throws RecognitionException {
		HorasContext _localctx = new HorasContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_horas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(HORAS_KW);
			setState(315);
			match(DOS_PUNTOS);
			setState(316);
			match(DIGITOS);
			setState(317);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescripcionContext extends ParserRuleContext {
		public TerminalNode DESCRIPCION_KW() { return getToken(CVParser.DESCRIPCION_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode CADENA() { return getToken(CVParser.CADENA, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public DescripcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descripcion; }
	}

	public final DescripcionContext descripcion() throws RecognitionException {
		DescripcionContext _localctx = new DescripcionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_descripcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(DESCRIPCION_KW);
			setState(320);
			match(DOS_PUNTOS);
			setState(321);
			match(CADENA);
			setState(322);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CertificadoContext extends ParserRuleContext {
		public TerminalNode CERTIFICADO_KW() { return getToken(CVParser.CERTIFICADO_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode CERTIFICADO_VALOR() { return getToken(CVParser.CERTIFICADO_VALOR, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public CertificadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_certificado; }
	}

	public final CertificadoContext certificado() throws RecognitionException {
		CertificadoContext _localctx = new CertificadoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_certificado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(CERTIFICADO_KW);
			setState(325);
			match(DOS_PUNTOS);
			setState(326);
			match(CERTIFICADO_VALOR);
			setState(327);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExperienciaContext extends ParserRuleContext {
		public TerminalNode SECCION_KW() { return getToken(CVParser.SECCION_KW, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(CVParser.PAREN_ABRE, 0); }
		public TerminalNode EXPERIENCIA_KW() { return getToken(CVParser.EXPERIENCIA_KW, 0); }
		public TerminalNode PAREN_CIERRA() { return getToken(CVParser.PAREN_CIERRA, 0); }
		public TerminalNode LLAVE_ABRE() { return getToken(CVParser.LLAVE_ABRE, 0); }
		public ExperienciasContext experiencias() {
			return getRuleContext(ExperienciasContext.class,0);
		}
		public TerminalNode LLAVE_CIERRA() { return getToken(CVParser.LLAVE_CIERRA, 0); }
		public ExperienciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experiencia; }
	}

	public final ExperienciaContext experiencia() throws RecognitionException {
		ExperienciaContext _localctx = new ExperienciaContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_experiencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(SECCION_KW);
			setState(330);
			match(PAREN_ABRE);
			setState(331);
			match(EXPERIENCIA_KW);
			setState(332);
			match(PAREN_CIERRA);
			setState(333);
			match(LLAVE_ABRE);
			setState(334);
			experiencias();
			setState(335);
			match(LLAVE_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExperienciasContext extends ParserRuleContext {
		public List<Experiencia_itemContext> experiencia_item() {
			return getRuleContexts(Experiencia_itemContext.class);
		}
		public Experiencia_itemContext experiencia_item(int i) {
			return getRuleContext(Experiencia_itemContext.class,i);
		}
		public ExperienciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experiencias; }
	}

	public final ExperienciasContext experiencias() throws RecognitionException {
		ExperienciasContext _localctx = new ExperienciasContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_experiencias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(337);
				experiencia_item();
				}
				}
				setState(340); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TRABAJO_KW );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Experiencia_itemContext extends ParserRuleContext {
		public TerminalNode TRABAJO_KW() { return getToken(CVParser.TRABAJO_KW, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(CVParser.PAREN_ABRE, 0); }
		public EmpresaContext empresa() {
			return getRuleContext(EmpresaContext.class,0);
		}
		public PuestoContext puesto() {
			return getRuleContext(PuestoContext.class,0);
		}
		public UbicacionContext ubicacion() {
			return getRuleContext(UbicacionContext.class,0);
		}
		public PeriodoContext periodo() {
			return getRuleContext(PeriodoContext.class,0);
		}
		public TerminalNode PAREN_CIERRA() { return getToken(CVParser.PAREN_CIERRA, 0); }
		public JornadaContext jornada() {
			return getRuleContext(JornadaContext.class,0);
		}
		public DescripcionContext descripcion() {
			return getRuleContext(DescripcionContext.class,0);
		}
		public ResponsabilidadesContext responsabilidades() {
			return getRuleContext(ResponsabilidadesContext.class,0);
		}
		public LogrosContext logros() {
			return getRuleContext(LogrosContext.class,0);
		}
		public TecnologiasContext tecnologias() {
			return getRuleContext(TecnologiasContext.class,0);
		}
		public Experiencia_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_experiencia_item; }
	}

	public final Experiencia_itemContext experiencia_item() throws RecognitionException {
		Experiencia_itemContext _localctx = new Experiencia_itemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_experiencia_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(TRABAJO_KW);
			setState(343);
			match(PAREN_ABRE);
			setState(344);
			empresa();
			setState(345);
			puesto();
			setState(346);
			ubicacion();
			setState(347);
			periodo();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JORNADA_KW) {
				{
				setState(348);
				jornada();
				}
			}

			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESCRIPCION_KW) {
				{
				setState(351);
				descripcion();
				}
			}

			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RESPONSABILIDADES_KW) {
				{
				setState(354);
				responsabilidades();
				}
			}

			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOGROS_KW) {
				{
				setState(357);
				logros();
				}
			}

			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TECNOLOGIAS_KW) {
				{
				setState(360);
				tecnologias();
				}
			}

			setState(363);
			match(PAREN_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EmpresaContext extends ParserRuleContext {
		public TerminalNode EMPRESA_KW() { return getToken(CVParser.EMPRESA_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public TerminalNode CADENA() { return getToken(CVParser.CADENA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(CVParser.IDENTIFICADOR, 0); }
		public EmpresaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empresa; }
	}

	public final EmpresaContext empresa() throws RecognitionException {
		EmpresaContext _localctx = new EmpresaContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_empresa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(EMPRESA_KW);
			setState(366);
			match(DOS_PUNTOS);
			setState(367);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFICADOR || _la==CADENA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(368);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PeriodoContext extends ParserRuleContext {
		public TerminalNode PERIODO_KW() { return getToken(CVParser.PERIODO_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public Rango_fechasContext rango_fechas() {
			return getRuleContext(Rango_fechasContext.class,0);
		}
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public PeriodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_periodo; }
	}

	public final PeriodoContext periodo() throws RecognitionException {
		PeriodoContext _localctx = new PeriodoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_periodo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(PERIODO_KW);
			setState(371);
			match(DOS_PUNTOS);
			setState(372);
			rango_fechas();
			setState(373);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Rango_fechasContext extends ParserRuleContext {
		public List<TerminalNode> FECHA() { return getTokens(CVParser.FECHA); }
		public TerminalNode FECHA(int i) {
			return getToken(CVParser.FECHA, i);
		}
		public TerminalNode FLECHA() { return getToken(CVParser.FLECHA, 0); }
		public TerminalNode ACTUALIDAD_KW() { return getToken(CVParser.ACTUALIDAD_KW, 0); }
		public Rango_fechasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rango_fechas; }
	}

	public final Rango_fechasContext rango_fechas() throws RecognitionException {
		Rango_fechasContext _localctx = new Rango_fechasContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_rango_fechas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(FECHA);
			setState(376);
			match(FLECHA);
			setState(377);
			_la = _input.LA(1);
			if ( !(_la==ACTUALIDAD_KW || _la==FECHA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JornadaContext extends ParserRuleContext {
		public TerminalNode JORNADA_KW() { return getToken(CVParser.JORNADA_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode CADENA() { return getToken(CVParser.CADENA, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public JornadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jornada; }
	}

	public final JornadaContext jornada() throws RecognitionException {
		JornadaContext _localctx = new JornadaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_jornada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(JORNADA_KW);
			setState(380);
			match(DOS_PUNTOS);
			setState(381);
			match(CADENA);
			setState(382);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResponsabilidadesContext extends ParserRuleContext {
		public TerminalNode RESPONSABILIDADES_KW() { return getToken(CVParser.RESPONSABILIDADES_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode CADENA() { return getToken(CVParser.CADENA, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public ResponsabilidadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_responsabilidades; }
	}

	public final ResponsabilidadesContext responsabilidades() throws RecognitionException {
		ResponsabilidadesContext _localctx = new ResponsabilidadesContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_responsabilidades);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(RESPONSABILIDADES_KW);
			setState(385);
			match(DOS_PUNTOS);
			setState(386);
			match(CADENA);
			setState(387);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogrosContext extends ParserRuleContext {
		public TerminalNode LOGROS_KW() { return getToken(CVParser.LOGROS_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode CADENA() { return getToken(CVParser.CADENA, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public LogrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logros; }
	}

	public final LogrosContext logros() throws RecognitionException {
		LogrosContext _localctx = new LogrosContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_logros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(LOGROS_KW);
			setState(390);
			match(DOS_PUNTOS);
			setState(391);
			match(CADENA);
			setState(392);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HabilidadesContext extends ParserRuleContext {
		public TerminalNode SECCION_KW() { return getToken(CVParser.SECCION_KW, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(CVParser.PAREN_ABRE, 0); }
		public TerminalNode HABILIDADES_KW() { return getToken(CVParser.HABILIDADES_KW, 0); }
		public TerminalNode PAREN_CIERRA() { return getToken(CVParser.PAREN_CIERRA, 0); }
		public TerminalNode LLAVE_ABRE() { return getToken(CVParser.LLAVE_ABRE, 0); }
		public Habilidades_camposContext habilidades_campos() {
			return getRuleContext(Habilidades_camposContext.class,0);
		}
		public TerminalNode LLAVE_CIERRA() { return getToken(CVParser.LLAVE_CIERRA, 0); }
		public HabilidadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_habilidades; }
	}

	public final HabilidadesContext habilidades() throws RecognitionException {
		HabilidadesContext _localctx = new HabilidadesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_habilidades);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(SECCION_KW);
			setState(395);
			match(PAREN_ABRE);
			setState(396);
			match(HABILIDADES_KW);
			setState(397);
			match(PAREN_CIERRA);
			setState(398);
			match(LLAVE_ABRE);
			setState(399);
			habilidades_campos();
			setState(400);
			match(LLAVE_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Habilidades_camposContext extends ParserRuleContext {
		public TerminalNode HARD_SKILLS_KW() { return getToken(CVParser.HARD_SKILLS_KW, 0); }
		public List<TerminalNode> PAREN_ABRE() { return getTokens(CVParser.PAREN_ABRE); }
		public TerminalNode PAREN_ABRE(int i) {
			return getToken(CVParser.PAREN_ABRE, i);
		}
		public List<TerminalNode> PAREN_CIERRA() { return getTokens(CVParser.PAREN_CIERRA); }
		public TerminalNode PAREN_CIERRA(int i) {
			return getToken(CVParser.PAREN_CIERRA, i);
		}
		public TerminalNode SOFT_SKILLS_KW() { return getToken(CVParser.SOFT_SKILLS_KW, 0); }
		public List<Hard_skillContext> hard_skill() {
			return getRuleContexts(Hard_skillContext.class);
		}
		public Hard_skillContext hard_skill(int i) {
			return getRuleContext(Hard_skillContext.class,i);
		}
		public List<Soft_skillContext> soft_skill() {
			return getRuleContexts(Soft_skillContext.class);
		}
		public Soft_skillContext soft_skill(int i) {
			return getRuleContext(Soft_skillContext.class,i);
		}
		public Habilidades_camposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_habilidades_campos; }
	}

	public final Habilidades_camposContext habilidades_campos() throws RecognitionException {
		Habilidades_camposContext _localctx = new Habilidades_camposContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_habilidades_campos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(HARD_SKILLS_KW);
			setState(403);
			match(PAREN_ABRE);
			setState(405); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(404);
				hard_skill();
				}
				}
				setState(407); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEC_TIPO );
			setState(409);
			match(PAREN_CIERRA);
			setState(410);
			match(SOFT_SKILLS_KW);
			setState(411);
			match(PAREN_ABRE);
			setState(413); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(412);
				soft_skill();
				}
				}
				setState(415); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HABILIDAD_KW );
			setState(417);
			match(PAREN_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Hard_skillContext extends ParserRuleContext {
		public LenguajeContext lenguaje() {
			return getRuleContext(LenguajeContext.class,0);
		}
		public Nivel_habilidadContext nivel_habilidad() {
			return getRuleContext(Nivel_habilidadContext.class,0);
		}
		public IconoContext icono() {
			return getRuleContext(IconoContext.class,0);
		}
		public DescripcionContext descripcion() {
			return getRuleContext(DescripcionContext.class,0);
		}
		public Hard_skillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hard_skill; }
	}

	public final Hard_skillContext hard_skill() throws RecognitionException {
		Hard_skillContext _localctx = new Hard_skillContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hard_skill);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			lenguaje();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ICONO_KW) {
				{
				setState(420);
				icono();
				}
			}

			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DESCRIPCION_KW) {
				{
				setState(423);
				descripcion();
				}
			}

			setState(426);
			nivel_habilidad();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Soft_skillContext extends ParserRuleContext {
		public TerminalNode HABILIDAD_KW() { return getToken(CVParser.HABILIDAD_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public Habilidad_listaContext habilidad_lista() {
			return getRuleContext(Habilidad_listaContext.class,0);
		}
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public Soft_skillContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soft_skill; }
	}

	public final Soft_skillContext soft_skill() throws RecognitionException {
		Soft_skillContext _localctx = new Soft_skillContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_soft_skill);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(HABILIDAD_KW);
			setState(429);
			match(DOS_PUNTOS);
			setState(430);
			habilidad_lista();
			setState(431);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Habilidad_listaContext extends ParserRuleContext {
		public List<HabilidadContext> habilidad() {
			return getRuleContexts(HabilidadContext.class);
		}
		public HabilidadContext habilidad(int i) {
			return getRuleContext(HabilidadContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(CVParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(CVParser.COMA, i);
		}
		public Habilidad_listaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_habilidad_lista; }
	}

	public final Habilidad_listaContext habilidad_lista() throws RecognitionException {
		Habilidad_listaContext _localctx = new Habilidad_listaContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_habilidad_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			habilidad();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(434);
				match(COMA);
				setState(435);
				habilidad();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LenguajeContext extends ParserRuleContext {
		public TecnologiaContext tecnologia() {
			return getRuleContext(TecnologiaContext.class,0);
		}
		public LenguajeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lenguaje; }
	}

	public final LenguajeContext lenguaje() throws RecognitionException {
		LenguajeContext _localctx = new LenguajeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_lenguaje);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			tecnologia();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IconoContext extends ParserRuleContext {
		public TerminalNode ICONO_KW() { return getToken(CVParser.ICONO_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode URL() { return getToken(CVParser.URL, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public IconoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_icono; }
	}

	public final IconoContext icono() throws RecognitionException {
		IconoContext _localctx = new IconoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_icono);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(ICONO_KW);
			setState(444);
			match(DOS_PUNTOS);
			setState(445);
			match(URL);
			setState(446);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nivel_habilidadContext extends ParserRuleContext {
		public TerminalNode NIVEL_KW() { return getToken(CVParser.NIVEL_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode NIVEL_HABILIDAD_TIPO() { return getToken(CVParser.NIVEL_HABILIDAD_TIPO, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public Nivel_habilidadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nivel_habilidad; }
	}

	public final Nivel_habilidadContext nivel_habilidad() throws RecognitionException {
		Nivel_habilidadContext _localctx = new Nivel_habilidadContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_nivel_habilidad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(NIVEL_KW);
			setState(449);
			match(DOS_PUNTOS);
			setState(450);
			match(NIVEL_HABILIDAD_TIPO);
			setState(451);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HabilidadContext extends ParserRuleContext {
		public TerminalNode HABILIDAD_TIPO() { return getToken(CVParser.HABILIDAD_TIPO, 0); }
		public HabilidadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_habilidad; }
	}

	public final HabilidadContext habilidad() throws RecognitionException {
		HabilidadContext _localctx = new HabilidadContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_habilidad);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(HABILIDAD_TIPO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdiomasContext extends ParserRuleContext {
		public TerminalNode SECCION_KW() { return getToken(CVParser.SECCION_KW, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(CVParser.PAREN_ABRE, 0); }
		public TerminalNode IDIOMA_KW() { return getToken(CVParser.IDIOMA_KW, 0); }
		public TerminalNode PAREN_CIERRA() { return getToken(CVParser.PAREN_CIERRA, 0); }
		public TerminalNode LLAVE_ABRE() { return getToken(CVParser.LLAVE_ABRE, 0); }
		public IdiomaContext idioma() {
			return getRuleContext(IdiomaContext.class,0);
		}
		public TerminalNode LLAVE_CIERRA() { return getToken(CVParser.LLAVE_CIERRA, 0); }
		public IdiomasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idiomas; }
	}

	public final IdiomasContext idiomas() throws RecognitionException {
		IdiomasContext _localctx = new IdiomasContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_idiomas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(SECCION_KW);
			setState(456);
			match(PAREN_ABRE);
			setState(457);
			match(IDIOMA_KW);
			setState(458);
			match(PAREN_CIERRA);
			setState(459);
			match(LLAVE_ABRE);
			setState(460);
			idioma();
			setState(461);
			match(LLAVE_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdiomaContext extends ParserRuleContext {
		public List<Idioma_camposContext> idioma_campos() {
			return getRuleContexts(Idioma_camposContext.class);
		}
		public Idioma_camposContext idioma_campos(int i) {
			return getRuleContext(Idioma_camposContext.class,i);
		}
		public IdiomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idioma; }
	}

	public final IdiomaContext idioma() throws RecognitionException {
		IdiomaContext _localctx = new IdiomaContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_idioma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(463);
				idioma_campos();
				}
				}
				setState(466); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIALECTO_KW );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Idioma_camposContext extends ParserRuleContext {
		public DialectoContext dialecto() {
			return getRuleContext(DialectoContext.class,0);
		}
		public Nivel_idiomaContext nivel_idioma() {
			return getRuleContext(Nivel_idiomaContext.class,0);
		}
		public CertificadoContext certificado() {
			return getRuleContext(CertificadoContext.class,0);
		}
		public BanderaContext bandera() {
			return getRuleContext(BanderaContext.class,0);
		}
		public Idioma_camposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idioma_campos; }
	}

	public final Idioma_camposContext idioma_campos() throws RecognitionException {
		Idioma_camposContext _localctx = new Idioma_camposContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_idioma_campos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			dialecto();
			setState(469);
			nivel_idioma();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CERTIFICADO_KW) {
				{
				setState(470);
				certificado();
				}
			}

			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BANDERA_KW) {
				{
				setState(473);
				bandera();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DialectoContext extends ParserRuleContext {
		public TerminalNode DIALECTO_KW() { return getToken(CVParser.DIALECTO_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode DIALECTO_TIPO() { return getToken(CVParser.DIALECTO_TIPO, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public DialectoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dialecto; }
	}

	public final DialectoContext dialecto() throws RecognitionException {
		DialectoContext _localctx = new DialectoContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dialecto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(DIALECTO_KW);
			setState(477);
			match(DOS_PUNTOS);
			setState(478);
			match(DIALECTO_TIPO);
			setState(479);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nivel_idiomaContext extends ParserRuleContext {
		public TerminalNode NIVEL_KW() { return getToken(CVParser.NIVEL_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode NIVEL_IDIOMA_TIPO() { return getToken(CVParser.NIVEL_IDIOMA_TIPO, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public Nivel_idiomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nivel_idioma; }
	}

	public final Nivel_idiomaContext nivel_idioma() throws RecognitionException {
		Nivel_idiomaContext _localctx = new Nivel_idiomaContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_nivel_idioma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(NIVEL_KW);
			setState(482);
			match(DOS_PUNTOS);
			setState(483);
			match(NIVEL_IDIOMA_TIPO);
			setState(484);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BanderaContext extends ParserRuleContext {
		public TerminalNode BANDERA_KW() { return getToken(CVParser.BANDERA_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode URL() { return getToken(CVParser.URL, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public BanderaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bandera; }
	}

	public final BanderaContext bandera() throws RecognitionException {
		BanderaContext _localctx = new BanderaContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_bandera);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(BANDERA_KW);
			setState(487);
			match(DOS_PUNTOS);
			setState(488);
			match(URL);
			setState(489);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PortfolioContext extends ParserRuleContext {
		public TerminalNode SECCION_KW() { return getToken(CVParser.SECCION_KW, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(CVParser.PAREN_ABRE, 0); }
		public TerminalNode PORTFOLIO_KW() { return getToken(CVParser.PORTFOLIO_KW, 0); }
		public TerminalNode PAREN_CIERRA() { return getToken(CVParser.PAREN_CIERRA, 0); }
		public TerminalNode LLAVE_ABRE() { return getToken(CVParser.LLAVE_ABRE, 0); }
		public BportfolioContext bportfolio() {
			return getRuleContext(BportfolioContext.class,0);
		}
		public TerminalNode LLAVE_CIERRA() { return getToken(CVParser.LLAVE_CIERRA, 0); }
		public PortfolioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_portfolio; }
	}

	public final PortfolioContext portfolio() throws RecognitionException {
		PortfolioContext _localctx = new PortfolioContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_portfolio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			match(SECCION_KW);
			setState(492);
			match(PAREN_ABRE);
			setState(493);
			match(PORTFOLIO_KW);
			setState(494);
			match(PAREN_CIERRA);
			setState(495);
			match(LLAVE_ABRE);
			setState(496);
			bportfolio();
			setState(497);
			match(LLAVE_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BportfolioContext extends ParserRuleContext {
		public List<ProyectoContext> proyecto() {
			return getRuleContexts(ProyectoContext.class);
		}
		public ProyectoContext proyecto(int i) {
			return getRuleContext(ProyectoContext.class,i);
		}
		public BportfolioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bportfolio; }
	}

	public final BportfolioContext bportfolio() throws RecognitionException {
		BportfolioContext _localctx = new BportfolioContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_bportfolio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(499);
				proyecto();
				}
				}
				setState(502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PROYECTO_KW );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProyectoContext extends ParserRuleContext {
		public TerminalNode PROYECTO_KW() { return getToken(CVParser.PROYECTO_KW, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(CVParser.PAREN_ABRE, 0); }
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public DescripcionContext descripcion() {
			return getRuleContext(DescripcionContext.class,0);
		}
		public TdesarrolloContext tdesarrollo() {
			return getRuleContext(TdesarrolloContext.class,0);
		}
		public TecnologiasContext tecnologias() {
			return getRuleContext(TecnologiasContext.class,0);
		}
		public RolContext rol() {
			return getRuleContext(RolContext.class,0);
		}
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
		}
		public TerminalNode PAREN_CIERRA() { return getToken(CVParser.PAREN_CIERRA, 0); }
		public EnlacesContext enlaces() {
			return getRuleContext(EnlacesContext.class,0);
		}
		public ProyectoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proyecto; }
	}

	public final ProyectoContext proyecto() throws RecognitionException {
		ProyectoContext _localctx = new ProyectoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_proyecto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(PROYECTO_KW);
			setState(505);
			match(PAREN_ABRE);
			setState(506);
			nombre();
			setState(507);
			descripcion();
			setState(508);
			tdesarrollo();
			setState(509);
			tecnologias();
			setState(510);
			rol();
			setState(511);
			estado();
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENLACES_KW) {
				{
				setState(512);
				enlaces();
				}
			}

			setState(515);
			match(PAREN_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TdesarrolloContext extends ParserRuleContext {
		public TerminalNode TIEMPO_DE_DESARROLLO_KW() { return getToken(CVParser.TIEMPO_DE_DESARROLLO_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode TDESARROLLO_VALOR() { return getToken(CVParser.TDESARROLLO_VALOR, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public TdesarrolloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tdesarrollo; }
	}

	public final TdesarrolloContext tdesarrollo() throws RecognitionException {
		TdesarrolloContext _localctx = new TdesarrolloContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_tdesarrollo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			match(TIEMPO_DE_DESARROLLO_KW);
			setState(518);
			match(DOS_PUNTOS);
			setState(519);
			match(TDESARROLLO_VALOR);
			setState(520);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RolContext extends ParserRuleContext {
		public TerminalNode ROL_KW() { return getToken(CVParser.ROL_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode ROL_TIPO() { return getToken(CVParser.ROL_TIPO, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public RolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rol; }
	}

	public final RolContext rol() throws RecognitionException {
		RolContext _localctx = new RolContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_rol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(ROL_KW);
			setState(523);
			match(DOS_PUNTOS);
			setState(524);
			match(ROL_TIPO);
			setState(525);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EstadoContext extends ParserRuleContext {
		public TerminalNode ESTADO_KW() { return getToken(CVParser.ESTADO_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode ESTADO_TIPO() { return getToken(CVParser.ESTADO_TIPO, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public EstadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado; }
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_estado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(ESTADO_KW);
			setState(528);
			match(DOS_PUNTOS);
			setState(529);
			match(ESTADO_TIPO);
			setState(530);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TecnologiasContext extends ParserRuleContext {
		public TerminalNode TECNOLOGIAS_KW() { return getToken(CVParser.TECNOLOGIAS_KW, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public List<TecnologiaContext> tecnologia() {
			return getRuleContexts(TecnologiaContext.class);
		}
		public TecnologiaContext tecnologia(int i) {
			return getRuleContext(TecnologiaContext.class,i);
		}
		public TecnologiasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tecnologias; }
	}

	public final TecnologiasContext tecnologias() throws RecognitionException {
		TecnologiasContext _localctx = new TecnologiasContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_tecnologias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(TECNOLOGIAS_KW);
			setState(533);
			match(DOS_PUNTOS);
			setState(535); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(534);
				tecnologia();
				}
				}
				setState(537); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEC_TIPO );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TecnologiaContext extends ParserRuleContext {
		public TerminalNode TEC_TIPO() { return getToken(CVParser.TEC_TIPO, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(CVParser.DOS_PUNTOS, 0); }
		public TerminalNode CADENA() { return getToken(CVParser.CADENA, 0); }
		public TerminalNode PUNTO_Y_COMA() { return getToken(CVParser.PUNTO_Y_COMA, 0); }
		public TecnologiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tecnologia; }
	}

	public final TecnologiaContext tecnologia() throws RecognitionException {
		TecnologiaContext _localctx = new TecnologiaContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_tecnologia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(TEC_TIPO);
			setState(540);
			match(DOS_PUNTOS);
			setState(541);
			match(CADENA);
			setState(542);
			match(PUNTO_Y_COMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001W\u0221\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0001"+
		"\u0000\u0001\u0000\u0004\u0000{\b\u0000\u000b\u0000\f\u0000|\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001\u0082\b\u0001\u000b\u0001\f\u0001"+
		"\u0083\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u0093\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u0098\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00a3\b\u0004\u0001\u0004\u0003\u0004\u00a6\b\u0004\u0001\u0004"+
		"\u0003\u0004\u00a9\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b9\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00ed\b\u0010\n\u0010\f\u0010\u00f0\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0004\u0011\u00fa\b\u0011\u000b\u0011\f\u0011\u00fb\u0001\u0011"+
		"\u0003\u0011\u00ff\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0108\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u010c\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u012e\b\u0018\u0001\u0018\u0003\u0018\u0131\b\u0018\u0001\u0018\u0003"+
		"\u0018\u0134\b\u0018\u0001\u0018\u0003\u0018\u0137\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0004\u001d\u0153\b\u001d\u000b\u001d\f\u001d\u0154\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u015e\b\u001e\u0001\u001e\u0003\u001e\u0161\b\u001e"+
		"\u0001\u001e\u0003\u001e\u0164\b\u001e\u0001\u001e\u0003\u001e\u0167\b"+
		"\u001e\u0001\u001e\u0003\u001e\u016a\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001&\u0004&\u0196\b&\u000b&\f&\u0197\u0001&\u0001&\u0001&\u0001"+
		"&\u0004&\u019e\b&\u000b&\f&\u019f\u0001&\u0001&\u0001\'\u0001\'\u0003"+
		"\'\u01a6\b\'\u0001\'\u0003\'\u01a9\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0005)\u01b5\b)\n)\f)\u01b8\t)\u0001"+
		"*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001/\u0004/\u01d1\b/\u000b/\f/\u01d2\u00010\u00010\u00010\u0003"+
		"0\u01d8\b0\u00010\u00030\u01db\b0\u00011\u00011\u00011\u00011\u00011\u0001"+
		"2\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00015\u00045\u01f5"+
		"\b5\u000b5\f5\u01f6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00036\u0202\b6\u00016\u00016\u00017\u00017\u00017\u00017\u0001"+
		"7\u00018\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u0001"+
		"9\u0001:\u0001:\u0001:\u0004:\u0218\b:\u000b:\f:\u0219\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0000\u0000<\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtv\u0000\u0004\u0002\u0000MMVV\u0003\u0000JJMM"+
		"VV\u0002\u0000JJVV\u0002\u0000@@KK\u0207\u0000x\u0001\u0000\u0000\u0000"+
		"\u0002~\u0001\u0000\u0000\u0000\u0004\u0087\u0001\u0000\u0000\u0000\u0006"+
		"\u008c\u0001\u0000\u0000\u0000\b\u009b\u0001\u0000\u0000\u0000\n\u00ac"+
		"\u0001\u0000\u0000\u0000\f\u00b1\u0001\u0000\u0000\u0000\u000e\u00ba\u0001"+
		"\u0000\u0000\u0000\u0010\u00bf\u0001\u0000\u0000\u0000\u0012\u00c4\u0001"+
		"\u0000\u0000\u0000\u0014\u00c9\u0001\u0000\u0000\u0000\u0016\u00ce\u0001"+
		"\u0000\u0000\u0000\u0018\u00d3\u0001\u0000\u0000\u0000\u001a\u00d8\u0001"+
		"\u0000\u0000\u0000\u001c\u00dd\u0001\u0000\u0000\u0000\u001e\u00e2\u0001"+
		"\u0000\u0000\u0000 \u00e7\u0001\u0000\u0000\u0000\"\u00f3\u0001\u0000"+
		"\u0000\u0000$\u0102\u0001\u0000\u0000\u0000&\u010f\u0001\u0000\u0000\u0000"+
		"(\u0114\u0001\u0000\u0000\u0000*\u0119\u0001\u0000\u0000\u0000,\u011e"+
		"\u0001\u0000\u0000\u0000.\u0123\u0001\u0000\u0000\u00000\u0128\u0001\u0000"+
		"\u0000\u00002\u013a\u0001\u0000\u0000\u00004\u013f\u0001\u0000\u0000\u0000"+
		"6\u0144\u0001\u0000\u0000\u00008\u0149\u0001\u0000\u0000\u0000:\u0152"+
		"\u0001\u0000\u0000\u0000<\u0156\u0001\u0000\u0000\u0000>\u016d\u0001\u0000"+
		"\u0000\u0000@\u0172\u0001\u0000\u0000\u0000B\u0177\u0001\u0000\u0000\u0000"+
		"D\u017b\u0001\u0000\u0000\u0000F\u0180\u0001\u0000\u0000\u0000H\u0185"+
		"\u0001\u0000\u0000\u0000J\u018a\u0001\u0000\u0000\u0000L\u0192\u0001\u0000"+
		"\u0000\u0000N\u01a3\u0001\u0000\u0000\u0000P\u01ac\u0001\u0000\u0000\u0000"+
		"R\u01b1\u0001\u0000\u0000\u0000T\u01b9\u0001\u0000\u0000\u0000V\u01bb"+
		"\u0001\u0000\u0000\u0000X\u01c0\u0001\u0000\u0000\u0000Z\u01c5\u0001\u0000"+
		"\u0000\u0000\\\u01c7\u0001\u0000\u0000\u0000^\u01d0\u0001\u0000\u0000"+
		"\u0000`\u01d4\u0001\u0000\u0000\u0000b\u01dc\u0001\u0000\u0000\u0000d"+
		"\u01e1\u0001\u0000\u0000\u0000f\u01e6\u0001\u0000\u0000\u0000h\u01eb\u0001"+
		"\u0000\u0000\u0000j\u01f4\u0001\u0000\u0000\u0000l\u01f8\u0001\u0000\u0000"+
		"\u0000n\u0205\u0001\u0000\u0000\u0000p\u020a\u0001\u0000\u0000\u0000r"+
		"\u020f\u0001\u0000\u0000\u0000t\u0214\u0001\u0000\u0000\u0000v\u021b\u0001"+
		"\u0000\u0000\u0000xz\u0003\u0002\u0001\u0000y{\u0003\u0006\u0003\u0000"+
		"zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}\u0001\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\n\u0000\u0000\u007f\u0081\u0005\u0001\u0000\u0000\u0080\u0082\u0003"+
		"\u0004\u0002\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"\u0002\u0000\u0000\u0086\u0003\u0001\u0000\u0000\u0000\u0087\u0088\u0005"+
		"M\u0000\u0000\u0088\u0089\u0005\t\u0000\u0000\u0089\u008a\u0005V\u0000"+
		"\u0000\u008a\u008b\u0005\u0006\u0000\u0000\u008b\u0005\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005\u000b\u0000\u0000\u008d\u008e\u0005\u0001\u0000"+
		"\u0000\u008e\u008f\u0005M\u0000\u0000\u008f\u0090\u0003\b\u0004\u0000"+
		"\u0090\u0092\u0003\"\u0011\u0000\u0091\u0093\u00038\u001c\u0000\u0092"+
		"\u0091\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0003J%\u0000\u0095\u0097\u0003"+
		"\\.\u0000\u0096\u0098\u0003h4\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0005\u0002\u0000\u0000\u009a\u0007\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005\f\u0000\u0000\u009c\u009d\u0005\u0003\u0000\u0000\u009d"+
		"\u009e\u0005\u000e\u0000\u0000\u009e\u009f\u0005\u0004\u0000\u0000\u009f"+
		"\u00a0\u0005\u0001\u0000\u0000\u00a0\u00a2\u0003\n\u0005\u0000\u00a1\u00a3"+
		"\u0003 \u0010\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a6\u0003"+
		"\u001c\u000e\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000\u00a7\u00a9\u0003"+
		"\u001e\u000f\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005"+
		"\u0002\u0000\u0000\u00ab\t\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\r"+
		"\u0000\u0000\u00ad\u00ae\u0005\u0003\u0000\u0000\u00ae\u00af\u0003\f\u0006"+
		"\u0000\u00af\u00b0\u0005\u0004\u0000\u0000\u00b0\u000b\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b2\u0003\u000e\u0007\u0000\u00b2\u00b3\u0003\u0010\b\u0000"+
		"\u00b3\u00b4\u0003\u0012\t\u0000\u00b4\u00b5\u0003\u0014\n\u0000\u00b5"+
		"\u00b8\u0003\u0016\u000b\u0000\u00b6\u00b9\u0003\u0018\f\u0000\u00b7\u00b9"+
		"\u0003\u001a\r\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\r\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005\u000f\u0000\u0000\u00bb\u00bc\u0005\u0005"+
		"\u0000\u0000\u00bc\u00bd\u0005V\u0000\u0000\u00bd\u00be\u0005\u0006\u0000"+
		"\u0000\u00be\u000f\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0010\u0000"+
		"\u0000\u00c0\u00c1\u0005\u0005\u0000\u0000\u00c1\u00c2\u0007\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0005\u0006\u0000\u0000\u00c3\u0011\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0005\u0011\u0000\u0000\u00c5\u00c6\u0005\u0005\u0000"+
		"\u0000\u00c6\u00c7\u0007\u0000\u0000\u0000\u00c7\u00c8\u0005\u0006\u0000"+
		"\u0000\u00c8\u0013\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0012\u0000"+
		"\u0000\u00ca\u00cb\u0005\u0005\u0000\u0000\u00cb\u00cc\u0005I\u0000\u0000"+
		"\u00cc\u00cd\u0005\u0006\u0000\u0000\u00cd\u0015\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0005\u0013\u0000\u0000\u00cf\u00d0\u0005\u0005\u0000\u0000"+
		"\u00d0\u00d1\u0005E\u0000\u0000\u00d1\u00d2\u0005\u0006\u0000\u0000\u00d2"+
		"\u0017\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005\u0014\u0000\u0000\u00d4"+
		"\u00d5\u0005\u0005\u0000\u0000\u00d5\u00d6\u0005K\u0000\u0000\u00d6\u00d7"+
		"\u0005\u0006\u0000\u0000\u00d7\u0019\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0005\u0015\u0000\u0000\u00d9\u00da\u0005\u0005\u0000\u0000\u00da\u00db"+
		"\u0005F\u0000\u0000\u00db\u00dc\u0005\u0006\u0000\u0000\u00dc\u001b\u0001"+
		"\u0000\u0000\u0000\u00dd\u00de\u0005\u0016\u0000\u0000\u00de\u00df\u0005"+
		"\u0005\u0000\u0000\u00df\u00e0\u0005J\u0000\u0000\u00e0\u00e1\u0005\u0006"+
		"\u0000\u0000\u00e1\u001d\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0017"+
		"\u0000\u0000\u00e3\u00e4\u0005\u0005\u0000\u0000\u00e4\u00e5\u0005J\u0000"+
		"\u0000\u00e5\u00e6\u0005\u0006\u0000\u0000\u00e6\u001f\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0005?\u0000\u0000\u00e8\u00e9\u0005\u0005\u0000\u0000"+
		"\u00e9\u00ee\u0005J\u0000\u0000\u00ea\u00eb\u0005\u0007\u0000\u0000\u00eb"+
		"\u00ed\u0005J\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ed\u00f0"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ee"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u0006\u0000\u0000\u00f2!\u0001"+
		"\u0000\u0000\u0000\u00f3\u00f4\u0005\f\u0000\u0000\u00f4\u00f5\u0005\u0003"+
		"\u0000\u0000\u00f5\u00f6\u0005\u0018\u0000\u0000\u00f6\u00f7\u0005\u0004"+
		"\u0000\u0000\u00f7\u00f9\u0005\u0001\u0000\u0000\u00f8\u00fa\u0003$\u0012"+
		"\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00ff\u00030\u0018\u0000"+
		"\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0002\u0000\u0000"+
		"\u0101#\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0019\u0000\u0000\u0103"+
		"\u0104\u0005\u0003\u0000\u0000\u0104\u0105\u0003*\u0015\u0000\u0105\u0107"+
		"\u0003&\u0013\u0000\u0106\u0108\u0003.\u0017\u0000\u0107\u0106\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000"+
		"\u0000\u0000\u0109\u010b\u0003(\u0014\u0000\u010a\u010c\u0003,\u0016\u0000"+
		"\u010b\u010a\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0005\u0004\u0000\u0000"+
		"\u010e%\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u001b\u0000\u0000\u0110"+
		"\u0111\u0005\u0005\u0000\u0000\u0111\u0112\u0007\u0001\u0000\u0000\u0112"+
		"\u0113\u0005\u0006\u0000\u0000\u0113\'\u0001\u0000\u0000\u0000\u0114\u0115"+
		"\u0005!\u0000\u0000\u0115\u0116\u0005\u0005\u0000\u0000\u0116\u0117\u0005"+
		"G\u0000\u0000\u0117\u0118\u0005\u0006\u0000\u0000\u0118)\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0005\u001e\u0000\u0000\u011a\u011b\u0005\u0005\u0000"+
		"\u0000\u011b\u011c\u0007\u0000\u0000\u0000\u011c\u011d\u0005\u0006\u0000"+
		"\u0000\u011d+\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u001d\u0000\u0000"+
		"\u011f\u0120\u0005\u0005\u0000\u0000\u0120\u0121\u0007\u0002\u0000\u0000"+
		"\u0121\u0122\u0005\u0006\u0000\u0000\u0122-\u0001\u0000\u0000\u0000\u0123"+
		"\u0124\u0005\u001c\u0000\u0000\u0124\u0125\u0005\u0005\u0000\u0000\u0125"+
		"\u0126\u0007\u0001\u0000\u0000\u0126\u0127\u0005\u0006\u0000\u0000\u0127"+
		"/\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u001a\u0000\u0000\u0129\u012a"+
		"\u0005\u0003\u0000\u0000\u012a\u012b\u0003*\u0015\u0000\u012b\u012d\u0003"+
		"&\u0013\u0000\u012c\u012e\u00032\u0019\u0000\u012d\u012c\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u0130\u0001\u0000\u0000"+
		"\u0000\u012f\u0131\u00034\u001a\u0000\u0130\u012f\u0001\u0000\u0000\u0000"+
		"\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0001\u0000\u0000\u0000"+
		"\u0132\u0134\u0003(\u0014\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0001\u0000\u0000\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135"+
		"\u0137\u00036\u001b\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139"+
		"\u0005\u0004\u0000\u0000\u01391\u0001\u0000\u0000\u0000\u013a\u013b\u0005"+
		"\u001f\u0000\u0000\u013b\u013c\u0005\u0005\u0000\u0000\u013c\u013d\u0005"+
		"N\u0000\u0000\u013d\u013e\u0005\u0006\u0000\u0000\u013e3\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0005\'\u0000\u0000\u0140\u0141\u0005\u0005\u0000\u0000"+
		"\u0141\u0142\u0005V\u0000\u0000\u0142\u0143\u0005\u0006\u0000\u0000\u0143"+
		"5\u0001\u0000\u0000\u0000\u0144\u0145\u0005 \u0000\u0000\u0145\u0146\u0005"+
		"\u0005\u0000\u0000\u0146\u0147\u0005H\u0000\u0000\u0147\u0148\u0005\u0006"+
		"\u0000\u0000\u01487\u0001\u0000\u0000\u0000\u0149\u014a\u0005\f\u0000"+
		"\u0000\u014a\u014b\u0005\u0003\u0000\u0000\u014b\u014c\u0005\"\u0000\u0000"+
		"\u014c\u014d\u0005\u0004\u0000\u0000\u014d\u014e\u0005\u0001\u0000\u0000"+
		"\u014e\u014f\u0003:\u001d\u0000\u014f\u0150\u0005\u0002\u0000\u0000\u0150"+
		"9\u0001\u0000\u0000\u0000\u0151\u0153\u0003<\u001e\u0000\u0152\u0151\u0001"+
		"\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0152\u0001"+
		"\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155;\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0005#\u0000\u0000\u0157\u0158\u0005\u0003\u0000"+
		"\u0000\u0158\u0159\u0003>\u001f\u0000\u0159\u015a\u0003\u0010\b\u0000"+
		"\u015a\u015b\u0003\u0012\t\u0000\u015b\u015d\u0003@ \u0000\u015c\u015e"+
		"\u0003D\"\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015d\u015e\u0001"+
		"\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u0161\u0003"+
		"4\u001a\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000"+
		"\u0000\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u0164\u0003F#\u0000"+
		"\u0163\u0162\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000"+
		"\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0167\u0003H$\u0000\u0166\u0165"+
		"\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0169"+
		"\u0001\u0000\u0000\u0000\u0168\u016a\u0003t:\u0000\u0169\u0168\u0001\u0000"+
		"\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0005\u0004\u0000\u0000\u016c=\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\u0005$\u0000\u0000\u016e\u016f\u0005\u0005\u0000\u0000"+
		"\u016f\u0170\u0007\u0000\u0000\u0000\u0170\u0171\u0005\u0006\u0000\u0000"+
		"\u0171?\u0001\u0000\u0000\u0000\u0172\u0173\u0005%\u0000\u0000\u0173\u0174"+
		"\u0005\u0005\u0000\u0000\u0174\u0175\u0003B!\u0000\u0175\u0176\u0005\u0006"+
		"\u0000\u0000\u0176A\u0001\u0000\u0000\u0000\u0177\u0178\u0005K\u0000\u0000"+
		"\u0178\u0179\u0005\b\u0000\u0000\u0179\u017a\u0007\u0003\u0000\u0000\u017a"+
		"C\u0001\u0000\u0000\u0000\u017b\u017c\u0005&\u0000\u0000\u017c\u017d\u0005"+
		"\u0005\u0000\u0000\u017d\u017e\u0005V\u0000\u0000\u017e\u017f\u0005\u0006"+
		"\u0000\u0000\u017fE\u0001\u0000\u0000\u0000\u0180\u0181\u0005(\u0000\u0000"+
		"\u0181\u0182\u0005\u0005\u0000\u0000\u0182\u0183\u0005V\u0000\u0000\u0183"+
		"\u0184\u0005\u0006\u0000\u0000\u0184G\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u0005)\u0000\u0000\u0186\u0187\u0005\u0005\u0000\u0000\u0187\u0188\u0005"+
		"V\u0000\u0000\u0188\u0189\u0005\u0006\u0000\u0000\u0189I\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0005\f\u0000\u0000\u018b\u018c\u0005\u0003\u0000\u0000"+
		"\u018c\u018d\u0005+\u0000\u0000\u018d\u018e\u0005\u0004\u0000\u0000\u018e"+
		"\u018f\u0005\u0001\u0000\u0000\u018f\u0190\u0003L&\u0000\u0190\u0191\u0005"+
		"\u0002\u0000\u0000\u0191K\u0001\u0000\u0000\u0000\u0192\u0193\u0005,\u0000"+
		"\u0000\u0193\u0195\u0005\u0003\u0000\u0000\u0194\u0196\u0003N\'\u0000"+
		"\u0195\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000"+
		"\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u0005\u0004\u0000\u0000"+
		"\u019a\u019b\u0005-\u0000\u0000\u019b\u019d\u0005\u0003\u0000\u0000\u019c"+
		"\u019e\u0003P(\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001"+
		"\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005"+
		"\u0004\u0000\u0000\u01a2M\u0001\u0000\u0000\u0000\u01a3\u01a5\u0003T*"+
		"\u0000\u01a4\u01a6\u0003V+\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a9\u00034\u001a\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab"+
		"\u0003X,\u0000\u01abO\u0001\u0000\u0000\u0000\u01ac\u01ad\u00051\u0000"+
		"\u0000\u01ad\u01ae\u0005\u0005\u0000\u0000\u01ae\u01af\u0003R)\u0000\u01af"+
		"\u01b0\u0005\u0006\u0000\u0000\u01b0Q\u0001\u0000\u0000\u0000\u01b1\u01b6"+
		"\u0003Z-\u0000\u01b2\u01b3\u0005\u0007\u0000\u0000\u01b3\u01b5\u0003Z"+
		"-\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000\u0000"+
		"\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000"+
		"\u0000\u01b7S\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u0003v;\u0000\u01baU\u0001\u0000\u0000\u0000\u01bb\u01bc"+
		"\u0005/\u0000\u0000\u01bc\u01bd\u0005\u0005\u0000\u0000\u01bd\u01be\u0005"+
		"J\u0000\u0000\u01be\u01bf\u0005\u0006\u0000\u0000\u01bfW\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c1\u00050\u0000\u0000\u01c1\u01c2\u0005\u0005\u0000\u0000"+
		"\u01c2\u01c3\u00053\u0000\u0000\u01c3\u01c4\u0005\u0006\u0000\u0000\u01c4"+
		"Y\u0001\u0000\u0000\u0000\u01c5\u01c6\u00052\u0000\u0000\u01c6[\u0001"+
		"\u0000\u0000\u0000\u01c7\u01c8\u0005\f\u0000\u0000\u01c8\u01c9\u0005\u0003"+
		"\u0000\u0000\u01c9\u01ca\u00054\u0000\u0000\u01ca\u01cb\u0005\u0004\u0000"+
		"\u0000\u01cb\u01cc\u0005\u0001\u0000\u0000\u01cc\u01cd\u0003^/\u0000\u01cd"+
		"\u01ce\u0005\u0002\u0000\u0000\u01ce]\u0001\u0000\u0000\u0000\u01cf\u01d1"+
		"\u0003`0\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d3_\u0001\u0000\u0000\u0000\u01d4\u01d5\u0003b1\u0000"+
		"\u01d5\u01d7\u0003d2\u0000\u01d6\u01d8\u00036\u001b\u0000\u01d7\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01da"+
		"\u0001\u0000\u0000\u0000\u01d9\u01db\u0003f3\u0000\u01da\u01d9\u0001\u0000"+
		"\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01dba\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u00055\u0000\u0000\u01dd\u01de\u0005\u0005\u0000\u0000"+
		"\u01de\u01df\u00058\u0000\u0000\u01df\u01e0\u0005\u0006\u0000\u0000\u01e0"+
		"c\u0001\u0000\u0000\u0000\u01e1\u01e2\u00050\u0000\u0000\u01e2\u01e3\u0005"+
		"\u0005\u0000\u0000\u01e3\u01e4\u00057\u0000\u0000\u01e4\u01e5\u0005\u0006"+
		"\u0000\u0000\u01e5e\u0001\u0000\u0000\u0000\u01e6\u01e7\u00056\u0000\u0000"+
		"\u01e7\u01e8\u0005\u0005\u0000\u0000\u01e8\u01e9\u0005J\u0000\u0000\u01e9"+
		"\u01ea\u0005\u0006\u0000\u0000\u01eag\u0001\u0000\u0000\u0000\u01eb\u01ec"+
		"\u0005\f\u0000\u0000\u01ec\u01ed\u0005\u0003\u0000\u0000\u01ed\u01ee\u0005"+
		"9\u0000\u0000\u01ee\u01ef\u0005\u0004\u0000\u0000\u01ef\u01f0\u0005\u0001"+
		"\u0000\u0000\u01f0\u01f1\u0003j5\u0000\u01f1\u01f2\u0005\u0002\u0000\u0000"+
		"\u01f2i\u0001\u0000\u0000\u0000\u01f3\u01f5\u0003l6\u0000\u01f4\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7k\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f9\u0005:\u0000\u0000\u01f9\u01fa\u0005\u0003"+
		"\u0000\u0000\u01fa\u01fb\u0003\u000e\u0007\u0000\u01fb\u01fc\u00034\u001a"+
		"\u0000\u01fc\u01fd\u0003n7\u0000\u01fd\u01fe\u0003t:\u0000\u01fe\u01ff"+
		"\u0003p8\u0000\u01ff\u0201\u0003r9\u0000\u0200\u0202\u0003 \u0010\u0000"+
		"\u0201\u0200\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000"+
		"\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204\u0005\u0004\u0000\u0000"+
		"\u0204m\u0001\u0000\u0000\u0000\u0205\u0206\u0005<\u0000\u0000\u0206\u0207"+
		"\u0005\u0005\u0000\u0000\u0207\u0208\u0005L\u0000\u0000\u0208\u0209\u0005"+
		"\u0006\u0000\u0000\u0209o\u0001\u0000\u0000\u0000\u020a\u020b\u0005=\u0000"+
		"\u0000\u020b\u020c\u0005\u0005\u0000\u0000\u020c\u020d\u0005B\u0000\u0000"+
		"\u020d\u020e\u0005\u0006\u0000\u0000\u020eq\u0001\u0000\u0000\u0000\u020f"+
		"\u0210\u0005>\u0000\u0000\u0210\u0211\u0005\u0005\u0000\u0000\u0211\u0212"+
		"\u0005A\u0000\u0000\u0212\u0213\u0005\u0006\u0000\u0000\u0213s\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0005*\u0000\u0000\u0215\u0217\u0005\u0005\u0000"+
		"\u0000\u0216\u0218\u0003v;\u0000\u0217\u0216\u0001\u0000\u0000\u0000\u0218"+
		"\u0219\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219"+
		"\u021a\u0001\u0000\u0000\u0000\u021au\u0001\u0000\u0000\u0000\u021b\u021c"+
		"\u0005C\u0000\u0000\u021c\u021d\u0005\u0005\u0000\u0000\u021d\u021e\u0005"+
		"V\u0000\u0000\u021e\u021f\u0005\u0006\u0000\u0000\u021fw\u0001\u0000\u0000"+
		"\u0000\"|\u0083\u0092\u0097\u00a2\u00a5\u00a8\u00b8\u00ee\u00fb\u00fe"+
		"\u0107\u010b\u012d\u0130\u0133\u0136\u0154\u015d\u0160\u0163\u0166\u0169"+
		"\u0197\u019f\u01a5\u01a8\u01b6\u01d2\u01d7\u01da\u01f6\u0201\u0219";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}