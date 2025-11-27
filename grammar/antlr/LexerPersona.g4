lexer grammar LexerPersona;

options { caseInsensitive=true; }
// SIMBOLOS
LLAVE_ABRE : '{';
LLAVE_CIERRA : '}';
PAREN_ABRE : '(';
PAREN_CIERRA : ')';
DOS_PUNTOS : ':';
PUNTO_Y_COMA : ';';
COMA : ',';
FLECHA : '->';
IGUAL : '=';

GLOBAL_KW : 'Global';
CV_KW : 'CV';
SECCION_KW : ('Seccion' | 'Sección');
PERSONA_KW : 'Persona';
INFO_PERSONA_KW : ('Información_personal' | 'Informacion_personal');
NOMBRE_KW : 'Nombre';
PUESTO_KW : 'Puesto';
UBICACION_KW : ('Ubicación' | 'Ubicacion');
EMAIL_KW : 'Email';
TELEFONO_KW : ('Teléfono' | 'Telefono');
FECHA_NACIMIMENTO_KW : 'Fecha_nacimiento';
EDAD_KW : 'Edad';
IMAGEN_DE_PERFIL_KW : 'Imagen_de_perfil';
IMAGEN_DE_FONDO_KW : 'Imagen_de_fondo';

FORMACION_KW : ('Formación' | 'Formacion');
OFICIAL_KW : 'Oficial';
COMPLEMENTARIA_KW : 'Complementaria';
CENTRO_KW : 'Centro';
FACULTAD_KW : 'Facultad';
PLAN_DE_ESTUDIOS_KW : 'Plan_de_estudios';
TITULO_KW : ('Título' | 'Titulo');
HORAS_KW : 'Horas';
CERTIFICADO_KW : 'Certificado';
AÑO_KW : 'Año';

EXPERIENCIA_KW : 'Experiencia';
TRABAJO_KW : 'Trabajo';
EMPRESA_KW : 'Empresa';
PERIODO_KW : 'Periodo';
JORNADA_KW : 'Jornada';
DESCRIPCION_KW : ('Descripción' | 'Descripcion');
RESPONSABILIDADES_KW : 'Responsabilidades';
LOGROS_KW : 'Logros';
TECNOLOGIAS_KW : ('Tecnologías' | 'Tecnologias');

HABILIDADES_KW : 'Habilidades';
HARD_SKILLS_KW : 'Hard_skills';
SOFT_SKILLS_KW : 'Soft_skills';
LENGUAJE_KW : 'Lenguaje';
ICONO_KW : 'Icono';
NIVEL_KW : 'Nivel';
HABILIDAD_KW : 'Habilidad';

HABILIDAD_TIPO : ('Comunicación_efectiva' | 'Comunicacion_efectiva') | 'Trabajo_en_equipo' | ('Pensamiento_crítico' | 'Pensamiento_critico') | 'Inteligencia_emocional' | 'Liderazgo' | 'Adaptabilidad' | ('Resolución_de_problemas' | 'Resolucion_de_problemas') | ('Gestión_del_tiempo' | 'Gestion_del_tiempo') | 'Creatividad' | ('Empatía' | 'Empatia') | 'Escucha_activa' | 'Resiliencia' | ('Negociación' | 'Negociacion') | 'Proactividad' | 'Asertividad' | ('Trabajo_bajo_presión' | 'Trabajo_bajo_presion') | 'Toma_de_decisiones' | ('Gestión_de_conflictos' | 'Gestion_de_conflictos') | ('Orientación_a_resultados' | 'Orientacion_de_resultados') | 'Flexibilidad' | ('Gestión_del_cambio' | 'Gestion_del_cambio') | ('Motivación' | 'Motivacion') | 'Autodisciplina' | 'Compromiso' | ('Pensamiento_estratégico' | 'Pensamiento_estrategico') | ('Innovación' | 'Innovacion') | 'Networking' | ('Gestión_del_estres' | 'Gestion_del_estres') | 'Mentoring';

NIVEL_HABILIDAD_TIPO : 'Bajo' | 'Medio' | 'Avanzado';

IDIOMA_KW : 'Idiomas';
DIALECTO_KW : 'Dialecto';
BANDERA_KW : 'Bandera';

NIVEL_IDIOMA_TIPO : 'A1' | 'A2' | 'B1' | 'B2' | 'C1' | 'C2';
DIALECTO_TIPO : ('Inglés' | 'Ingles') | ('Alemán' | 'Aleman') | ('Francés' | 'Frances') | ('Portugués' | 'Portugues') | 'Italiano' | ('Árabe' | 'Arabe') | 'Ruso' | ('Japonés' | 'Japones') | 'Español';

PORTFOLIO_KW : 'Portfolio';
PROYECTO_KW : 'Proyecto';
URL_DE_IMAGEN_KW : 'Url_de_imagen';
TIEMPO_DE_DESARROLLO_KW : 'Tiempo_de_desarrollo';
ROL_KW : 'Rol';
ESTADO_KW : 'Estado';
ENLACES_KW : 'Enlaces';
ACTUALIDAD_KW : 'Actualidad';

ESTADO_TIPO : 'Planeado' | 'En_desarrollo' | 'En_pausa' | 'Finalizado';
ROL_TIPO : ('Coordinación' | 'Coordinacion') | 'Desarrollo' | 'Diseño' | 'Testing';
TEC_TIPO : 'Lenguaje_prog' | 'Desarrollo_web' | 'BBDD' | 'Frameworks' | 'Nube' | 'Control_de_versiones' | 'IDE' | 'SSOO';

// LETRAS
fragment LETRA_MAYUS : [A-ZÑ];
fragment LETRA_MINUS :  [a-zñ];

// DIGITO
fragment DIGITO : [0-9];
fragment DIG_NO_CERO : [1-9];

// TELEFONO
INICIO_TELEFONO : [6-9];
TELEFONO_VALOR : INICIO_TELEFONO DIGITO DIGITO DIGITO DIGITO DIGITO DIGITO DIGITO DIGITO;

// EDAD
EDAD_VALOR : DIG_NO_CERO DIGITO? DIGITO?;

// AÑO
AÑO : [12] DIGITO DIGITO DIGITO;

// CERTIFICADO
CERTIFICADO_VALOR : ('SI' | 'NO');

// CORREO
fragment LABEL : (LETRA_MAYUS | LETRA_MINUS | DIGITO) (LETRA_MAYUS | LETRA_MINUS | DIGITO | '-')*;
CORREO : (LETRA_MAYUS | LETRA_MINUS) (LETRA_MAYUS | LETRA_MINUS | DIGITO | '.' | '-' | '_')* '@' LABEL ('.' LABEL)+;

// URL
fragment PROTOCOLO : 'http' | 'https' | 'git';
fragment HOST : LABEL ('.' LABEL)*;
fragment RUTA_ONLINE : (LETRA_MAYUS | LETRA_MINUS | DIGITO | '.' | ',' | '_' | '/' | '?' | '=' | '&' | '%' | '-' | '#' | '(' | ')' | ':' | '@')*;
URL : PROTOCOLO '://' HOST ('/' RUTA_ONLINE)?;

// FECHAS
fragment D2 : DIGITO DIGITO;
fragment D4 : DIGITO DIGITO DIGITO DIGITO;
FECHA : D2 '-' D2 '-' D4;

// TIEMPO DE DESARROLLO
TDESARROLLO_VALOR : DIGITOS '_' TEXTO;

// IDENTIFICADORES
IDENTIFICADOR : [A-Z] [a-zA-ZñÑ_]*;

// DIGITOS
DIGITOS : DIG_NO_CERO DIGITO*;

// CADENAS
fragment CARACTER : ~["\r\n];
fragment TEXTO : CARACTER+;
CADENA_CAMBIO : '"' -> pushMode(CADENA_MODO), more;

// ESPACIOS EN BLANCO
WS : [ \t\r\n]+ -> skip;

// COMENTARIOS
COMENTARIO_LINEA : '//' -> pushMode(COMENTARIO_LINEA_MODO), skip;
COMENTARIO_BLOQUE : '/*' -> pushMode(COMENTARIO_BLOQUE_MODO), skip;

mode COMENTARIO_LINEA_MODO;
CONTENIDO_LINEA : ~[\n]+ -> skip;
FIN_COMENTARIO_LINEA : '\n' -> popMode, skip;

mode COMENTARIO_BLOQUE_MODO;
CONTENIDO_BLOQUE : .+? -> skip;
FIN_COMENTARIO_BLOQUE : '*/' -> popMode, skip;

mode CADENA_MODO;
CONTENIDO_CADENA : ~["\r\n]+ -> more;
CADENA : '"' -> popMode;