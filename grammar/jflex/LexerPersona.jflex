// Lexer.jflex
import java.util.Map;
import java.util.HashMap;
import java.io.Reader;

%%

%class Lexer
%unicode
%public
%type String[]
%line
%column
%state CADENA_ESTADO, COMENTARIO_LINEA, COMENTARIO_BLOQUE
%{

public Map<String,String> globals = new HashMap<>();
public Map<String, String> palabrasReservadas = new HashMap<>();

{
    // ======= PALABRAS RESERVADAS =======
    palabrasReservadas.put("global", "GLOBAL_KW");
    palabrasReservadas.put("cv", "CV_KW");
    // SECCION PERSONA
    palabrasReservadas.put("seccion", "SECCION_KW");
    palabrasReservadas.put("persona", "PERSONA_KW");
    palabrasReservadas.put("información_personal", "INFO_PERSONA_KW");
    palabrasReservadas.put("nombre", "NOMBRE_KW");
    palabrasReservadas.put("puesto", "PUESTO_KW");
    palabrasReservadas.put("ubicación", "UBICACION_KW");
    palabrasReservadas.put("email", "EMAIL_KW");
    palabrasReservadas.put("teléfono", "TELEFONO_KW");
    palabrasReservadas.put("fecha_nacimiento", "FECHA_NACIMIENTO_KW");
    palabrasReservadas.put("edad", "EDAD_KW");
    palabrasReservadas.put("imagen_de_perfil", "IMAGEN_DE_PERFIL_KW");
    palabrasReservadas.put("imagen_de_fondo", "IMAGEN_DE_FONDO_KW");
    // SECCION FORMACION
    palabrasReservadas.put("formación", "FORMACION_KW");
    palabrasReservadas.put("oficial", "OFICIAL_KW");
    palabrasReservadas.put("complementaria", "COMPLEMENTARIA_KW");
    palabrasReservadas.put("centro", "CENTRO_KW");
    palabrasReservadas.put("fecha_nacimiento", "FACULTAD_KW");
    palabrasReservadas.put("plan_de_estudios", "PLAN_DE_ESTUDIOS_KW");
    palabrasReservadas.put("título", "TITULO_KW");
    palabrasReservadas.put("horas", "HORAS_KW");
    palabrasReservadas.put("certificado", "CERTIFICADO_KW");
    palabrasReservadas.put("año", "AÑO_KW");
    // VALORES DE CERTIFICADO 
    palabrasReservadas.put("si", "CERTIFICADO_VALOR");
    palabrasReservadas.put("no", "CERTIFICADO_VALOR");
    // SECCION EXPERIENCIA
    palabrasReservadas.put("experiencia", "EXPERIENCIA_KW");
    palabrasReservadas.put("trabajo", "TRABAJO_KW");
    palabrasReservadas.put("empresa", "EMPRESA_KW");
    palabrasReservadas.put("periodo", "PERIODO_KW");
    palabrasReservadas.put("jornada", "JORNADA_KW");
    palabrasReservadas.put("descripción", "DESCRIPCION_KW");
    palabrasReservadas.put("responsabilidades", "RESPONSABILIDADES_KW");
    palabrasReservadas.put("logros", "LOGROS_KW");
    palabrasReservadas.put("tecnologías", "TECNOLOGIAS_KW");
    // SECCION HABILIDADES
    palabrasReservadas.put("habilidades", "HABILIDADES_KW");
    palabrasReservadas.put("hard_skills", "HARD_SKILLS_KW");
    palabrasReservadas.put("soft_skills", "SOFT_SKILLS_KW");
    palabrasReservadas.put("lenguaje", "LENGUAJE_KW");
    palabrasReservadas.put("icono", "ICONO_KW");
    palabrasReservadas.put("nivel", "NIVEL_KW");
    palabrasReservadas.put("habilidad", "HABILIDAD_KW");
    // TIPOS DE NIVELES DE HABILIDAD
    palabrasReservadas.put("bajo", "NIVEL_HABILIDAD_TIPO");
    palabrasReservadas.put("medio", "NIVEL_HABILIDAD_TIPO");
    palabrasReservadas.put("avanzado", "NIVEL_HABILIDAD_TIPO");
    // SECCION IDIOMAS
    palabrasReservadas.put("idiomas", "IDIOMAS_KW");
    palabrasReservadas.put("dialecto", "DIALECTO_KW");
    palabrasReservadas.put("bandera", "BANDERA_KW");
    // NIVELES DE IDIOMA 
    palabrasReservadas.put("a1", "NIVEL_IDIOMA_TIPO");
    palabrasReservadas.put("a2", "NIVEL_IDIOMA_TIPO");
    palabrasReservadas.put("b1", "NIVEL_IDIOMA_TIPO");
    palabrasReservadas.put("b2", "NIVEL_IDIOMA_TIPO");
    palabrasReservadas.put("c1", "NIVEL_IDIOMA_TIPO");
    palabrasReservadas.put("c2", "NIVEL_IDIOMA_TIPO");
    // DIALECTOS 
    palabrasReservadas.put("inglés", "DIALECTO_TIPO");
    palabrasReservadas.put("alemán", "DIALECTO_TIPO");
    palabrasReservadas.put("francés", "DIALECTO_TIPO");
    palabrasReservadas.put("portugués", "DIALECTO_TIPO");
    palabrasReservadas.put("italiano", "DIALECTO_TIPO");
    palabrasReservadas.put("árabe", "DIALECTO_TIPO");
    palabrasReservadas.put("ruso", "DIALECTO_TIPO");
    palabrasReservadas.put("japonés", "DIALECTO_TIPO");
    palabrasReservadas.put("español", "DIALECTO_TIPO");
    // SECCION PORTFOLIO
    palabrasReservadas.put("portfolio", "PORTFOLIO_KW");
    palabrasReservadas.put("proyecto", "PROYECTO_KW");
    palabrasReservadas.put("url_de_imagen", "URL_DE_IMAGEN_KW");
    palabrasReservadas.put("tiempo_de_desarrollo", "TIEMPO_DE_DESARROLLO_KW");
    palabrasReservadas.put("rol", "ROL_KW");
    palabrasReservadas.put("estado", "ESTADO_KW");
    palabrasReservadas.put("enlaces", "ENLACES_KW");
    palabrasReservadas.put("actualidad", "ACTUALIDAD_KW");
    // ESTADOS DE PROYECTO 
    palabrasReservadas.put("planeado", "ESTADO_TIPO");
    palabrasReservadas.put("en_desarrollo", "ESTADO_TIPO");
    palabrasReservadas.put("en_pausa", "ESTADO_TIPO");
    palabrasReservadas.put("finalizado", "ESTADO_TIPO");
    // ROLES 
    palabrasReservadas.put("coordinación", "ROL_TIPO");
    palabrasReservadas.put("desarrollo", "ROL_TIPO");
    palabrasReservadas.put("diseño", "ROL_TIPO");
    palabrasReservadas.put("testing", "ROL_TIPO");

    // SOFT SKILLS 
    palabrasReservadas.put("comunicación_efectiva", "HABILIDAD_TIPO");
    palabrasReservadas.put("trabajo_en_equipo", "HABILIDAD_TIPO");
    palabrasReservadas.put("pensamiento_crítico", "HABILIDAD_TIPO");
    palabrasReservadas.put("inteligencia_emocional", "HABILIDAD_TIPO");
    palabrasReservadas.put("liderazgo", "HABILIDAD_TIPO");
    palabrasReservadas.put("adaptabilidad", "HABILIDAD_TIPO");
    palabrasReservadas.put("resolución_de_problemas", "HABILIDAD_TIPO");
    palabrasReservadas.put("gestión_del_tiempo", "HABILIDAD_TIPO");
    palabrasReservadas.put("creatividad", "HABILIDAD_TIPO");
    palabrasReservadas.put("empatía", "HABILIDAD_TIPO");
    palabrasReservadas.put("escucha_activa", "HABILIDAD_TIPO");
    palabrasReservadas.put("resiliencia", "HABILIDAD_TIPO");
    palabrasReservadas.put("negociación", "HABILIDAD_TIPO");
    palabrasReservadas.put("proactividad", "HABILIDAD_TIPO");
    palabrasReservadas.put("asertividad", "HABILIDAD_TIPO");
    palabrasReservadas.put("trabajo_bajo_presión", "HABILIDAD_TIPO");
    palabrasReservadas.put("toma_de_decisiones", "HABILIDAD_TIPO");
    palabrasReservadas.put("gestión_de_conflictos", "HABILIDAD_TIPO");
    palabrasReservadas.put("orientación_a_resultados", "HABILIDAD_TIPO");
    palabrasReservadas.put("flexibilidad", "HABILIDAD_TIPO");
    palabrasReservadas.put("gestión_del_cambio", "HABILIDAD_TIPO");
    palabrasReservadas.put("motivación", "HABILIDAD_TIPO");
    palabrasReservadas.put("autodisciplina", "HABILIDAD_TIPO");
    palabrasReservadas.put("compromiso", "HABILIDAD_TIPO");
    palabrasReservadas.put("pensamiento_estratégico", "HABILIDAD_TIPO");
    palabrasReservadas.put("innovación", "HABILIDAD_TIPO");
    palabrasReservadas.put("networking", "HABILIDAD_TIPO");
    palabrasReservadas.put("gestión_del_estrés", "HABILIDAD_TIPO");
    palabrasReservadas.put("mentoring", "HABILIDAD_TIPO");

    // TIPOS DE TECNOLOGIA
    palabrasReservadas.put("lenguaje_prog", "TEC_TIPO");
    palabrasReservadas.put("desarrollo_web", "TEC_TIPO");
    palabrasReservadas.put("bbdd", "TEC_TIPO");
    palabrasReservadas.put("framework", "TEC_TIPO");
    palabrasReservadas.put("nube", "TEC_TIPO");
    palabrasReservadas.put("control_de_versiones", "TEC_TIPO");
    palabrasReservadas.put("ide", "TEC_TIPO");
    palabrasReservadas.put("ssoo", "TEC_TIPO");


    // SIMBOLOS
    palabrasReservadas.put("{", "LLAVE_ABRE");
    palabrasReservadas.put("}", "LLAVE_CIERRA");
    palabrasReservadas.put("(", "PAREN_ABRE");
    palabrasReservadas.put(")", "PAREN_CIERRA");
    palabrasReservadas.put(":", "DOS_PUNTOS");
    palabrasReservadas.put(";", "PUNTO_Y_COMA");
    palabrasReservadas.put(",", "COMA");
    palabrasReservadas.put("->", "FLECHA");
    palabrasReservadas.put("=", "IGUAL");
}

%}

// ER DE CONSTRUCCION
L = [A-ZÁÉÍÓÚÑ]
l = [a-záéíóúñ]
DIG = [0-9]
DIG_NO_CERO = [1-9]
DIGITOS = {DIG_NO_CERO}{DIG}*

// TELEFONO
TELEFONO_VALOR = {INICIO_TELEFONO}{DIG}{8} // TOKEN
INICIO_TELEFONO = [6-9]

// EDAD
EDAD_VALOR = {DIG_NO_CERO}{DIG}? // TOKEN

// AÑO
AÑO = [1|2]{DIG}{DIG}{DIG} // TOKEN

// VARIABLES
VARIABLE = {IDENT}[ \t]*=[ \t]*\"{CADENA}\"[ \t]*; // TOKEN ?

// CORREO
LABEL = ({L}|{l}|{DIG})({L}|{l}|{DIG}|-)*
CORREO = ({L}|{l})({L}|{l}|{DIG}|[._-])*@{LABEL}(\.{LABEL})+ // TOKEN

// URL
PROTOCOLO = ("http"|"https"|"git")
HOST = {LABEL}("."{LABEL})*
RUTA_ONLINE = ({L}|{l}|{DIG}|[.,_/?=&%-\\#])*
URL = {PROTOCOLO}"://"{HOST}("/"{RUTA_ONLINE})? //TOKEN

// FECHAS
D2 = {DIG}{DIG}
D4 = {DIG}{DIG}{DIG}{DIG}
FECHA = {D2}-{D2}-{D4} // TOKEN

// TIEMPO DE DESARROLLO
TDESARROLLO_VALOR = {DIGITOS}_{CADENA} // TOKEN

// CARACTERES
CARACTER = [^\"\n\r]
CADENA = {CARACTER}+ // TOKEN 

// IDENTIFICADORES
IDENT = ({L}|{l})({l}|[A-ZÁÉÍÓÚÑ0-9_])*

%%

<YYINITIAL> {
    // Identificadores o palabras reservadas
    {IDENT} {
        String lex = yytext().trim();
        String tipo = palabrasReservadas.getOrDefault(lex.toLowerCase(), "IDENTIFICADOR");
        System.out.println("TOKEN: " + lex + " TIPO: " + tipo + " encontrado en línea: " + (yyline+1) + ", columna: " + (yycolumn+1));
    }

    "\""    { yybegin(CADENA_ESTADO); }
    "//"    { yybegin(COMENTARIO_LINEA); }
    "/*"    { yybegin(COMENTARIO_BLOQUE); }

    // Símbolos
    "("|")"|":"|";"|","|"->"|"="|"{"|"}" {
        String lex = yytext().trim();
        String tipo = palabrasReservadas.getOrDefault(lex, "SIMBOLO");
        System.out.println("TOKEN: " + lex + " TIPO: " + tipo + " encontrado en línea: " + (yyline+1) + ", columna: " + (yycolumn+1));
    }

    {VARIABLE} {
        String variable = yytext().split("=")[0].trim();
        String valor = yytext().split("=")[1].replace(";","").trim();
        globals.put(variable, valor);
        System.out.println("Variable GLOBAL encontrada, NOMBRE: " + variable + ", VALOR: " + valor + " en línea: " + (yyline+1));
    }

    {CORREO} {
        System.out.println("TOKEN: " + yytext() + " TIPO: CORREO" + " encontrado en línea: " + (yyline+1) + ", columna: " + (yycolumn+1));
    }

    {TELEFONO_VALOR} {
        System.out.println("TOKEN: " + yytext() + " TIPO: TELEFONO_VALOR" + " encontrado en línea: " + (yyline+1) + ", columna: " + (yycolumn+1));
    }
    
    {EDAD_VALOR} {
        System.out.println("TOKEN: " + yytext() + " TIPO: EDAD_VALOR" + " encontrado en línea: " + (yyline+1) + ", columna: " + (yycolumn+1));
    }

    {URL} {
        System.out.println("TOKEN: " + yytext() + " TIPO: URL" + " encontrado en línea: " + (yyline+1) + ", columna: " + (yycolumn+1));
    }

    {FECHA} {
        System.out.println("TOKEN: " + yytext() + " TIPO: FECHA" + " encontrado en línea: " + (yyline+1) + ", columna: " + (yycolumn+1));
    }

    {TDESARROLLO_VALOR} {
        System.out.println("TOKEN: " + yytext() + " TIPO: TDESARROLLO_VALOR" + " encontrado en línea: " + (yyline+1) + ", columna: " + (yycolumn+1));
    }

    {AÑO} {
        System.out.println("TOKEN: " + yytext() + " TIPO: AÑO" + " encontrado en línea: " + (yyline+1) + ", columna: " + (yycolumn+1));
    }

    // Ignorar espacios y saltos de línea
    [ \t\n\r]+ {}

    // Capturar cualquier cosa que no coincida
    . { System.out.println("ERROR: " + yytext() + " encontrado en línea: " + (yyline+1) + ", columna: " + (yycolumn+1)); }
}

<CADENA_ESTADO> {
    [^\"]+ {System.out.println("TOKEN: " + yytext() + " TIPO: CADENA encontrado en línea: " + (yyline+1) + ", columna: " + (yycolumn+1));}
    "\"" {yybegin(YYINITIAL);} 
}

<COMENTARIO_LINEA> {
    [^\n*]+ {}
    "\n" {yybegin(YYINITIAL);}
}

<COMENTARIO_BLOQUE> {
    [^*]+ {}
    "*"+[^*/]* {}
    "*/" {yybegin(YYINITIAL);}
    <<EOF>> {yybegin(YYINITIAL);}
}
