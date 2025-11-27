#!/bin/bash

# ============================================
# Script de compilación para CVtoHTML
# Soporta: ANTLR, JFlex y CUP
# ============================================

PROJECT_DIR="$(cd "$(dirname "$0")" && pwd)"
LIB_DIR="$PROJECT_DIR/lib"
SRC_DIR="$PROJECT_DIR/src"
BIN_DIR="$PROJECT_DIR/bin"
GRAMMAR_DIR="$PROJECT_DIR/grammar"
GENERATED_DIR="$PROJECT_DIR/generated"

# Librerías
ANTLR_JAR="$LIB_DIR/antlr-4.13.2-complete.jar"
JFLEX_JAR="$LIB_DIR/jflex-1.9.1.jar"
CUP_JAR="$LIB_DIR/java-cup-11b.jar"
CUP_RUNTIME_JAR="$LIB_DIR/java-cup-runtime-11b.jar"
GSON_JAR="$LIB_DIR/gson-2.13.1.jar"

# Crear directorios si no existen
mkdir -p "$BIN_DIR"
mkdir -p "$GENERATED_DIR/antlr"
mkdir -p "$GENERATED_DIR/jflex"
mkdir -p "$GENERATED_DIR/cup"

# ============================================
# 1. Generar código desde gramáticas ANTLR
# ============================================
if ls "$GRAMMAR_DIR/antlr/"*.g4 1> /dev/null 2>&1; then
    echo "=== Generando archivos desde gramáticas ANTLR ==="
    for g4_file in "$GRAMMAR_DIR/antlr/"*.g4; do
        echo "  Procesando: $(basename "$g4_file")"
        java -jar "$ANTLR_JAR" -o "$GENERATED_DIR/antlr" "$g4_file" -visitor
    done
fi

# ============================================
# 2. Generar Lexer desde JFlex
# ============================================
if ls "$GRAMMAR_DIR/jflex/"*.jflex 1> /dev/null 2>&1; then
    echo "=== Generando Lexer desde JFlex ==="
    for jflex_file in "$GRAMMAR_DIR/jflex/"*.jflex; do
        echo "  Procesando: $(basename "$jflex_file")"
        java -jar "$JFLEX_JAR" -d "$GENERATED_DIR/jflex" "$jflex_file"
    done
fi

# ============================================
# 3. Generar Parser desde CUP
# ============================================
if ls "$GRAMMAR_DIR/cup/"*.cup 1> /dev/null 2>&1; then
    echo "=== Generando Parser desde CUP ==="
    for cup_file in "$GRAMMAR_DIR/cup/"*.cup; do
        echo "  Procesando: $(basename "$cup_file")"
        java -jar "$CUP_JAR" -destdir "$GENERATED_DIR/cup" -parser Parser -symbols Sym "$cup_file"
    done
fi

# ============================================
# 4. Compilar archivos generados
# ============================================
echo "=== Compilando archivos generados ==="

# Classpath para compilación
COMPILE_CP="$ANTLR_JAR:$CUP_RUNTIME_JAR:$GSON_JAR:$BIN_DIR"

# Compilar ANTLR generados
if ls "$GENERATED_DIR/antlr/"*.java 1> /dev/null 2>&1; then
    echo "  Compilando generados de ANTLR..."
    javac -cp "$COMPILE_CP" -d "$BIN_DIR" "$GENERATED_DIR/antlr/"*.java
fi

# Compilar JFlex generados
if ls "$GENERATED_DIR/jflex/"*.java 1> /dev/null 2>&1; then
    echo "  Compilando generados de JFlex..."
    javac -cp "$COMPILE_CP" -d "$BIN_DIR" "$GENERATED_DIR/jflex/"*.java
fi

# Compilar CUP generados
if ls "$GENERATED_DIR/cup/"*.java 1> /dev/null 2>&1; then
    echo "  Compilando generados de CUP..."
    javac -cp "$COMPILE_CP" -d "$BIN_DIR" "$GENERATED_DIR/cup/"*.java
fi

# ============================================
# 5. Compilar clases del proyecto
# ============================================
echo "=== Compilando clases del proyecto ==="
javac -cp "$COMPILE_CP" -d "$BIN_DIR" "$SRC_DIR/"*.java

echo ""
echo "✓ Compilación completada!"
