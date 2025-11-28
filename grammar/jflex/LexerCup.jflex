import java_cup.runtime.*;
import java.util.Map;
import java.util.HashMap;

%%

%class LexerCup
%unicode
%public
%cupsym Sym
%cup
%line
%column
%ignorecase
%state CADENA_ESTADO, COMENTARIO_LINEA, COMENTARIO_BLOQUE

%eofval{
    return new java_cup.runtime.Symbol(Sym.EOF);
%eofval}

%{
    private StringBuilder cadenaBuffer = new StringBuilder();
    private Map<String, Integer> palabrasReservadas = new HashMap<>();
    
    private String normalizar(String s) {
        return s.toLowerCase();
    }
    
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }
    
    {
        palabrasReservadas.put("global", Sym.GLOBAL_KW);
        palabrasReservadas.put("cv", Sym.CV_KW);
        palabrasReservadas.put("persona", Sym.PERSONA_KW);
        palabrasReservadas.put("nombre", Sym.NOMBRE_KW);
        palabrasReservadas.put("puesto", Sym.PUESTO_KW);
        palabrasReservadas.put("ubicación", Sym.UBICACION_KW);
        palabrasReservadas.put("ubicacion", Sym.UBICACION_KW);
        palabrasReservadas.put("email", Sym.EMAIL_KW);
        palabrasReservadas.put("teléfono", Sym.TELEFONO_KW);
        palabrasReservadas.put("telefono", Sym.TELEFONO_KW);
        palabrasReservadas.put("fecha_nacimiento", Sym.FECHA_NACIMIENTO_KW);
        palabrasReservadas.put("edad", Sym.EDAD_KW);
        palabrasReservadas.put("imagen_de_perfil", Sym.IMAGEN_DE_PERFIL_KW);
        palabrasReservadas.put("imagen_de_fondo", Sym.IMAGEN_DE_FONDO_KW);
        palabrasReservadas.put("oficial", Sym.OFICIAL_KW);
        palabrasReservadas.put("complementaria", Sym.COMPLEMENTARIA_KW);
        palabrasReservadas.put("centro", Sym.CENTRO_KW);
        palabrasReservadas.put("facultad", Sym.FACULTAD_KW);
        palabrasReservadas.put("plan_de_estudios", Sym.PLAN_DE_ESTUDIOS_KW);
        palabrasReservadas.put("título", Sym.TITULO_KW);
        palabrasReservadas.put("titulo", Sym.TITULO_KW);
        palabrasReservadas.put("horas", Sym.HORAS_KW);
        palabrasReservadas.put("certificado", Sym.CERTIFICADO_KW);
        palabrasReservadas.put("año", Sym.AÑO_KW);
        palabrasReservadas.put("trabajo", Sym.TRABAJO_KW);
        palabrasReservadas.put("empresa", Sym.EMPRESA_KW);
        palabrasReservadas.put("periodo", Sym.PERIODO_KW);
        palabrasReservadas.put("jornada", Sym.JORNADA_KW);
        palabrasReservadas.put("descripción", Sym.DESCRIPCION_KW);
        palabrasReservadas.put("descripcion", Sym.DESCRIPCION_KW);
        palabrasReservadas.put("responsabilidades", Sym.RESPONSABILIDADES_KW);
        palabrasReservadas.put("logros", Sym.LOGROS_KW);
        palabrasReservadas.put("tecnologías", Sym.TECNOLOGIAS_KW);
        palabrasReservadas.put("tecnologias", Sym.TECNOLOGIAS_KW);
        palabrasReservadas.put("actualidad", Sym.ACTUALIDAD_KW);
        palabrasReservadas.put("hard_skills", Sym.HARD_SKILLS_KW);
        palabrasReservadas.put("soft_skills", Sym.SOFT_SKILLS_KW);
        palabrasReservadas.put("icono", Sym.ICONO_KW);
        palabrasReservadas.put("nivel", Sym.NIVEL_KW);
        palabrasReservadas.put("habilidad", Sym.HABILIDAD_KW);
        palabrasReservadas.put("dialecto", Sym.DIALECTO_KW);
        palabrasReservadas.put("bandera", Sym.BANDERA_KW);
        palabrasReservadas.put("proyecto", Sym.PROYECTO_KW);
        palabrasReservadas.put("tiempo_de_desarrollo", Sym.TIEMPO_DE_DESARROLLO_KW);
        palabrasReservadas.put("rol", Sym.ROL_KW);
        palabrasReservadas.put("estado", Sym.ESTADO_KW);
        palabrasReservadas.put("enlaces", Sym.ENLACES_KW);
    }
    
    private boolean esHabilidadTipo(String s) {
        String lower = normalizar(s);
        return lower.equals("comunicación_efectiva") || lower.equals("comunicacion_efectiva") ||
               lower.equals("trabajo_en_equipo") ||
               lower.equals("pensamiento_crítico") || lower.equals("pensamiento_critico") ||
               lower.equals("inteligencia_emocional") ||
               lower.equals("liderazgo") ||
               lower.equals("adaptabilidad") ||
               lower.equals("resolución_de_problemas") || lower.equals("resolucion_de_problemas") ||
               lower.equals("gestión_del_tiempo") || lower.equals("gestion_del_tiempo") ||
               lower.equals("creatividad") ||
               lower.equals("empatía") || lower.equals("empatia") ||
               lower.equals("escucha_activa") ||
               lower.equals("resiliencia") ||
               lower.equals("negociación") || lower.equals("negociacion") ||
               lower.equals("proactividad") ||
               lower.equals("asertividad") ||
               lower.equals("trabajo_bajo_presión") || lower.equals("trabajo_bajo_presion") ||
               lower.equals("toma_de_decisiones") ||
               lower.equals("gestión_de_conflictos") || lower.equals("gestion_de_conflictos") ||
               lower.equals("orientación_a_resultados") || lower.equals("orientacion_de_resultados") ||
               lower.equals("flexibilidad") ||
               lower.equals("gestión_del_cambio") || lower.equals("gestion_del_cambio") ||
               lower.equals("motivación") || lower.equals("motivacion") ||
               lower.equals("autodisciplina") ||
               lower.equals("compromiso") ||
               lower.equals("pensamiento_estratégico") || lower.equals("pensamiento_estrategico") ||
               lower.equals("innovación") || lower.equals("innovacion") ||
               lower.equals("networking") ||
               lower.equals("gestión_del_estres") || lower.equals("gestion_del_estres") ||
               lower.equals("mentoring");
    }
    
    private boolean esNivelHabilidad(String s) {
        String lower = normalizar(s);
        return lower.equals("bajo") || lower.equals("medio") || lower.equals("avanzado");
    }
    
    private boolean esNivelIdioma(String s) {
        String lower = normalizar(s);
        return lower.equals("a1") || lower.equals("a2") || 
               lower.equals("b1") || lower.equals("b2") || 
               lower.equals("c1") || lower.equals("c2");
    }
    
    private boolean esDialecto(String s) {
        String lower = normalizar(s);
        return lower.equals("inglés") || lower.equals("ingles") ||
               lower.equals("alemán") || lower.equals("aleman") ||
               lower.equals("francés") || lower.equals("frances") ||
               lower.equals("portugués") || lower.equals("portugues") ||
               lower.equals("italiano") ||
               lower.equals("árabe") || lower.equals("arabe") ||
               lower.equals("ruso") ||
               lower.equals("japonés") || lower.equals("japones") ||
               lower.equals("español");
    }
    
    private boolean esEstado(String s) {
        String lower = normalizar(s);
        return lower.equals("planeado") || lower.equals("en_desarrollo") ||
               lower.equals("en_pausa") || lower.equals("finalizado");
    }
    
    private boolean esRol(String s) {
        String lower = normalizar(s);
        return lower.equals("coordinación") || lower.equals("coordinacion") ||
               lower.equals("desarrollo") || lower.equals("diseño") || lower.equals("testing");
    }
    
    private boolean esTecTipo(String s) {
        String lower = normalizar(s);
        return lower.equals("lenguaje_prog") || lower.equals("desarrollo_web") ||
               lower.equals("bbdd") || lower.equals("frameworks") ||
               lower.equals("nube") || lower.equals("control_de_versiones") ||
               lower.equals("ide") || lower.equals("ssoo");
    }
    
    private boolean esCertificado(String s) {
        String lower = normalizar(s);
        return lower.equals("si") || lower.equals("no");
    }
%}

LETRA_MAYUS = [A-ZÑ]
LETRA_MINUS = [a-zñ]
LETRA = ({LETRA_MAYUS}|{LETRA_MINUS})
DIG = [0-9]
DIG_NO_CERO = [1-9]
DIGITOS = {DIG_NO_CERO}{DIG}*

INICIO_TELEFONO = [6-9]
TELEFONO_VALOR = {INICIO_TELEFONO}{DIG}{DIG}{DIG}{DIG}{DIG}{DIG}{DIG}{DIG}

EDAD_VALOR = {DIG_NO_CERO}{DIG}?{DIG}?

AÑO = [12]{DIG}{DIG}{DIG}

LABEL = ({LETRA}|{DIG})({LETRA}|{DIG}|-)*
CORREO = {LETRA}({LETRA}|{DIG}|[.\-_])*@{LABEL}(\.{LABEL})+

PROTOCOLO = (http|https|git)
HOST = {LABEL}(\.{LABEL})*
RUTA_ONLINE = ({LETRA}|{DIG}|[.,_/?=&%\-#()\:@])*
URL = {PROTOCOLO}"://"{HOST}("/"{RUTA_ONLINE})?

D2 = {DIG}{DIG}
D4 = {DIG}{DIG}{DIG}{DIG}
FECHA = {D2}-{D2}-{D4}

CARACTER = [^\"\r\n]
TEXTO = {CARACTER}+
TDESARROLLO_VALOR = {DIGITOS}_{TEXTO}

ESP = [ \t\r\n]*

SECCION_INFO    = "seccion"{ESP}"("{ESP}("información_personal"|"informacion_personal"){ESP}")"
SECCION_FORM    = "seccion"{ESP}"("{ESP}("formación"|"formacion"){ESP}")"
SECCION_EXP     = "seccion"{ESP}"("{ESP}"experiencia"{ESP}")"
SECCION_HABS    = "seccion"{ESP}"("{ESP}"habilidades"{ESP}")"
SECCION_IDIOMAS = "seccion"{ESP}"("{ESP}"idiomas"{ESP}")"
SECCION_PORT    = "seccion"{ESP}"("{ESP}"portfolio"{ESP}")"

IDENTIFICADOR = ({LETRA_MAYUS}|{LETRA_MINUS})({LETRA_MAYUS}|{LETRA_MINUS}|{DIG}|[_áéíóúÁÉÍÓÚ])*

%%

<YYINITIAL> {
    "//"    { yybegin(COMENTARIO_LINEA); }
    "/*"    { yybegin(COMENTARIO_BLOQUE); }

    {SECCION_INFO}    { return symbol(Sym.SECCION_INFO_PERSONA); }
    {SECCION_FORM}    { return symbol(Sym.SECCION_FORMACION); }
    {SECCION_EXP}     { return symbol(Sym.SECCION_EXPERIENCIA); }
    {SECCION_HABS}    { return symbol(Sym.SECCION_HABILIDADES); }
    {SECCION_IDIOMAS} { return symbol(Sym.SECCION_IDIOMAS); }
    {SECCION_PORT}    { return symbol(Sym.SECCION_PORTFOLIO); }

    "->"    { return symbol(Sym.FLECHA); }
    "{"     { return symbol(Sym.LLAVE_ABRE); }
    "}"     { return symbol(Sym.LLAVE_CIERRA); }
    "("     { return symbol(Sym.PAREN_ABRE); }
    ")"     { return symbol(Sym.PAREN_CIERRA); }
    ":"     { return symbol(Sym.DOS_PUNTOS); }
    ";"     { return symbol(Sym.PUNTO_Y_COMA); }
    ","     { return symbol(Sym.COMA); }
    "="     { return symbol(Sym.IGUAL); }

    "\""    { 
        cadenaBuffer.setLength(0);
        yybegin(CADENA_ESTADO); 
    }

    {CORREO}            { return symbol(Sym.CORREO, yytext()); }
    {URL}               { return symbol(Sym.URL, yytext()); }
    {FECHA}             { return symbol(Sym.FECHA, yytext()); }
    {TDESARROLLO_VALOR} { return symbol(Sym.TDESARROLLO_VALOR, yytext()); }
    {TELEFONO_VALOR}    { return symbol(Sym.TELEFONO_VALOR, yytext()); }
    {AÑO}               { return symbol(Sym.AÑO, yytext()); }
    {EDAD_VALOR}        { return symbol(Sym.EDAD_VALOR, yytext()); }
    {DIGITOS}           { return symbol(Sym.DIGITOS, yytext()); }

    {IDENTIFICADOR} {
        String lex = yytext();
        String lower = normalizar(lex);
        
        Integer tipo = palabrasReservadas.get(lower);
        if (tipo != null) {
            return symbol(tipo, lex);
        }
        
        if (esHabilidadTipo(lex)) return symbol(Sym.HABILIDAD_TIPO, lex);
        if (esNivelHabilidad(lex)) return symbol(Sym.NIVEL_HABILIDAD_TIPO, lex);
        if (esNivelIdioma(lex)) return symbol(Sym.NIVEL_IDIOMA_TIPO, lex);
        if (esDialecto(lex)) return symbol(Sym.DIALECTO_TIPO, lex);
        if (esEstado(lex)) return symbol(Sym.ESTADO_TIPO, lex);
        if (esRol(lex)) return symbol(Sym.ROL_TIPO, lex);
        if (esTecTipo(lex)) return symbol(Sym.TEC_TIPO, lex);
        if (esCertificado(lex)) return symbol(Sym.CERTIFICADO_VALOR, lex);
        
        return symbol(Sym.IDENTIFICADOR, lex);
    }

    [ \t\n\r]+ { }

    . { 
        System.err.println("ERROR LÉXICO: '" + yytext() + "' en línea " + (yyline+1) + ", columna " + (yycolumn+1)); 
    }
}

<CADENA_ESTADO> {
    [^\"\r\n]+ { cadenaBuffer.append(yytext()); }
    "\"" {
        yybegin(YYINITIAL);
        return symbol(Sym.CADENA, cadenaBuffer.toString());
    }
    [\r\n] {
        System.err.println("ERROR: Cadena no cerrada en línea " + (yyline+1));
        yybegin(YYINITIAL);
    }
}

<COMENTARIO_LINEA> {
    [^\n]+ { }
    \n { yybegin(YYINITIAL); }
}

<COMENTARIO_BLOQUE> {
    [^*]+ { }
    "*"+[^*/]* { }
    "*/" { yybegin(YYINITIAL); }
    <<EOF>> { 
        System.err.println("ERROR: Comentario de bloque no cerrado");
        yybegin(YYINITIAL); 
    }
}
