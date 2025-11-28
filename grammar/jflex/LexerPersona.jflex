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
%ignorecase
%state CADENA_ESTADO, COMENTARIO_LINEA, COMENTARIO_BLOQUE
%{

public Map<String,String> globals = new HashMap<>();
public Map<String, String> palabrasReservadas = new HashMap<>();

// Función helper para normalizar texto (case insensitive)
private String normalizar(String s) {
    return s.toLowerCase();
}

{
    // ======= PALABRAS RESERVADAS =======
    palabrasReservadas.put("global", "GLOBAL_KW");
    palabrasReservadas.put("cv", "CV_KW");
    
    // SECCION PERSONA
    palabrasReservadas.put("seccion", "SECCION_KW");
    palabrasReservadas.put("sección", "SECCION_KW");
    palabrasReservadas.put("persona", "PERSONA_KW");
    palabrasReservadas.put("información_personal", "INFO_PERSONA_KW");
    palabrasReservadas.put("informacion_personal", "INFO_PERSONA_KW");
    palabrasReservadas.put("nombre", "NOMBRE_KW");
    palabrasReservadas.put("puesto", "PUESTO_KW");
    palabrasReservadas.put("ubicación", "UBICACION_KW");
    palabrasReservadas.put("ubicacion", "UBICACION_KW");
    palabrasReservadas.put("email", "EMAIL_KW");
    palabrasReservadas.put("teléfono", "TELEFONO_KW");
    palabrasReservadas.put("telefono", "TELEFONO_KW");
    palabrasReservadas.put("fecha_nacimiento", "FECHA_NACIMIENTO_KW");
    palabrasReservadas.put("edad", "EDAD_KW");
    palabrasReservadas.put("imagen_de_perfil", "IMAGEN_DE_PERFIL_KW");
    palabrasReservadas.put("imagen_de_fondo", "IMAGEN_DE_FONDO_KW");
    
    // SECCION FORMACION
    palabrasReservadas.put("formación", "FORMACION_KW");
    palabrasReservadas.put("formacion", "FORMACION_KW");
    palabrasReservadas.put("oficial", "OFICIAL_KW");
    palabrasReservadas.put("complementaria", "COMPLEMENTARIA_KW");
    palabrasReservadas.put("centro", "CENTRO_KW");
    palabrasReservadas.put("facultad", "FACULTAD_KW");
    palabrasReservadas.put("plan_de_estudios", "PLAN_DE_ESTUDIOS_KW");
    palabrasReservadas.put("título", "TITULO_KW");
    palabrasReservadas.put("titulo", "TITULO_KW");
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
    palabrasReservadas.put("descripcion", "DESCRIPCION_KW");
    palabrasReservadas.put("responsabilidades", "RESPONSABILIDADES_KW");
    palabrasReservadas.put("logros", "LOGROS_KW");
    palabrasReservadas.put("tecnologías", "TECNOLOGIAS_KW");
    palabrasReservadas.put("tecnologias", "TECNOLOGIAS_KW");
    
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
    palabrasReservadas.put("idiomas", "IDIOMA_KW");
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
    palabrasReservadas.put("ingles", "DIALECTO_TIPO");
    palabrasReservadas.put("alemán", "DIALECTO_TIPO");
    palabrasReservadas.put("aleman", "DIALECTO_TIPO");
    palabrasReservadas.put("francés", "DIALECTO_TIPO");
    palabrasReservadas.put("frances", "DIALECTO_TIPO");
    palabrasReservadas.put("portugués", "DIALECTO_TIPO");
    palabrasReservadas.put("portugues", "DIALECTO_TIPO");
    palabrasReservadas.put("italiano", "DIALECTO_TIPO");
    palabrasReservadas.put("árabe", "DIALECTO_TIPO");
    palabrasReservadas.put("arabe", "DIALECTO_TIPO");
    palabrasReservadas.put("ruso", "DIALECTO_TIPO");
    palabrasReservadas.put("japonés", "DIALECTO_TIPO");
    palabrasReservadas.put("japones", "DIALECTO_TIPO");
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
    palabrasReservadas.put("coordinacion", "ROL_TIPO");
    palabrasReservadas.put("desarrollo", "ROL_TIPO");
    palabrasReservadas.put("diseño", "ROL_TIPO");
    palabrasReservadas.put("testing", "ROL_TIPO");

    // SOFT SKILLS (HABILIDAD_TIPO)
    palabrasReservadas.put("comunicación_efectiva", "HABILIDAD_TIPO");
    palabrasReservadas.put("comunicacion_efectiva", "HABILIDAD_TIPO");
    palabrasReservadas.put("trabajo_en_equipo", "HABILIDAD_TIPO");
    palabrasReservadas.put("pensamiento_crítico", "HABILIDAD_TIPO");
    palabrasReservadas.put("pensamiento_critico", "HABILIDAD_TIPO");
    palabrasReservadas.put("inteligencia_emocional", "HABILIDAD_TIPO");
    palabrasReservadas.put("liderazgo", "HABILIDAD_TIPO");
    palabrasReservadas.put("adaptabilidad", "HABILIDAD_TIPO");
    palabrasReservadas.put("resolución_de_problemas", "HABILIDAD_TIPO");
    palabrasReservadas.put("resolucion_de_problemas", "HABILIDAD_TIPO");
    palabrasReservadas.put("gestión_del_tiempo", "HABILIDAD_TIPO");
    palabrasReservadas.put("gestion_del_tiempo", "HABILIDAD_TIPO");
    palabrasReservadas.put("creatividad", "HABILIDAD_TIPO");
    palabrasReservadas.put("empatía", "HABILIDAD_TIPO");
    palabrasReservadas.put("empatia", "HABILIDAD_TIPO");
    palabrasReservadas.put("escucha_activa", "HABILIDAD_TIPO");
    palabrasReservadas.put("resiliencia", "HABILIDAD_TIPO");
    palabrasReservadas.put("negociación", "HABILIDAD_TIPO");
    palabrasReservadas.put("negociacion", "HABILIDAD_TIPO");
    palabrasReservadas.put("proactividad", "HABILIDAD_TIPO");
    palabrasReservadas.put("asertividad", "HABILIDAD_TIPO");
    palabrasReservadas.put("trabajo_bajo_presión", "HABILIDAD_TIPO");
    palabrasReservadas.put("trabajo_bajo_presion", "HABILIDAD_TIPO");
    palabrasReservadas.put("toma_de_decisiones", "HABILIDAD_TIPO");
    palabrasReservadas.put("gestión_de_conflictos", "HABILIDAD_TIPO");
    palabrasReservadas.put("gestion_de_conflictos", "HABILIDAD_TIPO");
    palabrasReservadas.put("orientación_a_resultados", "HABILIDAD_TIPO");
    palabrasReservadas.put("orientacion_de_resultados", "HABILIDAD_TIPO");
    palabrasReservadas.put("flexibilidad", "HABILIDAD_TIPO");
    palabrasReservadas.put("gestión_del_cambio", "HABILIDAD_TIPO");
    palabrasReservadas.put("gestion_del_cambio", "HABILIDAD_TIPO");
    palabrasReservadas.put("motivación", "HABILIDAD_TIPO");
    palabrasReservadas.put("motivacion", "HABILIDAD_TIPO");
    palabrasReservadas.put("autodisciplina", "HABILIDAD_TIPO");
    palabrasReservadas.put("compromiso", "HABILIDAD_TIPO");
    palabrasReservadas.put("pensamiento_estratégico", "HABILIDAD_TIPO");
    palabrasReservadas.put("pensamiento_estrategico", "HABILIDAD_TIPO");
    palabrasReservadas.put("innovación", "HABILIDAD_TIPO");
    palabrasReservadas.put("innovacion", "HABILIDAD_TIPO");
    palabrasReservadas.put("networking", "HABILIDAD_TIPO");
    palabrasReservadas.put("gestión_del_estres", "HABILIDAD_TIPO");
    palabrasReservadas.put("gestion_del_estres", "HABILIDAD_TIPO");
    palabrasReservadas.put("mentoring", "HABILIDAD_TIPO");

    // TIPOS DE TECNOLOGIA
    palabrasReservadas.put("lenguaje_prog", "TEC_TIPO");
    palabrasReservadas.put("desarrollo_web", "TEC_TIPO");
    palabrasReservadas.put("bbdd", "TEC_TIPO");
    palabrasReservadas.put("frameworks", "TEC_TIPO");
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
LETRA_MAYUS = [A-ZÑ]
LETRA_MINUS = [a-zñ]
LETRA = ({LETRA_MAYUS}|{LETRA_MINUS})
DIG = [0-9]
DIG_NO_CERO = [1-9]
DIGITOS = {DIG_NO_CERO}{DIG}*

// TELEFONO
INICIO_TELEFONO = [6-9]
TELEFONO_VALOR = {INICIO_TELEFONO}{DIG}{DIG}{DIG}{DIG}{DIG}{DIG}{DIG}{DIG}

// EDAD
EDAD_VALOR = {DIG_NO_CERO}{DIG}?{DIG}?

// AÑO
AÑO = [12]{DIG}{DIG}{DIG}

// CORREO
LABEL = ({LETRA}|{DIG})({LETRA}|{DIG}|-)*
CORREO = {LETRA}({LETRA}|{DIG}|[.\-_])*@{LABEL}(\.{LABEL})+

// URL
PROTOCOLO = (http|https|git)
HOST = {LABEL}(\.{LABEL})*
RUTA_ONLINE = ({LETRA}|{DIG}|[.,_/?=&%\-#()\:@])*
URL = {PROTOCOLO}"://"{HOST}("/"{RUTA_ONLINE})?

// FECHAS
D2 = {DIG}{DIG}
D4 = {DIG}{DIG}{DIG}{DIG}
FECHA = {D2}-{D2}-{D4}

// TIEMPO DE DESARROLLO
CARACTER = [^\"\r\n]
TEXTO = {CARACTER}+
TDESARROLLO_VALOR = {DIGITOS}_{TEXTO}

// IDENTIFICADORES
IDENTIFICADOR = [A-Z][a-zA-ZñÑ_]*

%%

<YYINITIAL> {
    // Comentarios (deben ir antes de otros tokens)
    "//"    { yybegin(COMENTARIO_LINEA); }
    "/*"    { yybegin(COMENTARIO_BLOQUE); }

    // Símbolos (orden de prioridad: flecha antes que guion)
    "->"    { return new String[]{"FLECHA", yytext()}; }
    "{"     { return new String[]{"LLAVE_ABRE", yytext()}; }
    "}"     { return new String[]{"LLAVE_CIERRA", yytext()}; }
    "("     { return new String[]{"PAREN_ABRE", yytext()}; }
    ")"     { return new String[]{"PAREN_CIERRA", yytext()}; }
    ":"     { return new String[]{"DOS_PUNTOS", yytext()}; }
    ";"     { return new String[]{"PUNTO_Y_COMA", yytext()}; }
    ","     { return new String[]{"COMA", yytext()}; }
    "="     { return new String[]{"IGUAL", yytext()}; }

    // Cadenas (inicio de cadena)
    "\""    { yybegin(CADENA_ESTADO); }

    // Tokens complejos (orden específico para evitar conflictos)
    {CORREO} {
        return new String[]{"CORREO", yytext()};
    }

    {URL} {
        return new String[]{"URL", yytext()};
    }

    {FECHA} {
        return new String[]{"FECHA", yytext()};
    }

    {TDESARROLLO_VALOR} {
        return new String[]{"TDESARROLLO_VALOR", yytext()};
    }

    {TELEFONO_VALOR} {
        return new String[]{"TELEFONO_VALOR", yytext()};
    }

    {AÑO} {
        return new String[]{"AÑO", yytext()};
    }

    {EDAD_VALOR} {
        return new String[]{"EDAD_VALOR", yytext()};
    }

    {DIGITOS} {
        return new String[]{"DIGITOS", yytext()};
    }

    // Identificadores o palabras reservadas
    {IDENTIFICADOR} {
        String lex = yytext();
        String tipo = palabrasReservadas.getOrDefault(normalizar(lex), "IDENTIFICADOR");
        return new String[]{tipo, lex};
    }

    // Ignorar espacios y saltos de línea
    [ \t\n\r]+ { /* skip */ }

    // Capturar cualquier cosa que no coincida
    . { 
        System.err.println("ERROR LÉXICO: '" + yytext() + "' encontrado en línea: " + (yyline+1) + ", columna: " + (yycolumn+1)); 
        return new String[]{"ERROR", yytext()};
    }
}

<CADENA_ESTADO> {
    [^\"\r\n]+ { 
        String contenido = yytext();
        // Guardamos el contenido para devolverlo cuando se cierre la cadena
        return new String[]{"CONTENIDO_CADENA", contenido};
    }
    "\"" {
        yybegin(YYINITIAL);
        return new String[]{"CADENA", "\""};
    }
    [\r\n] {
        System.err.println("ERROR: Cadena no cerrada en línea: " + (yyline+1));
        yybegin(YYINITIAL);
        return new String[]{"ERROR", "Cadena no cerrada"};
    }
}

<COMENTARIO_LINEA> {
    [^\n]* { /* ignorar contenido */ }
    \n { yybegin(YYINITIAL); }
}

<COMENTARIO_BLOQUE> {
    [^*]+ { /* ignorar contenido */ }
    "*"+[^*/]* { /* ignorar asteriscos */ }
    "*/" { yybegin(YYINITIAL); }
    <<EOF>> { 
        System.err.println("ERROR: Comentario de bloque no cerrado");
        yybegin(YYINITIAL); 
    }
}
