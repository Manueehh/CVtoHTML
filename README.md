# CV Parser

Proyecto de análisis de CVs usando ANTLR y Java.

## Estructura del Proyecto

```
cv-parser/
├── src/              # Código fuente Java (clases de modelo y Main)
├── grammar/          # Archivos de gramática ANTLR (.g4)
├── generated/        # Archivos generados por ANTLR (Parser, Lexer, Listeners, Visitors)
├── lib/              # Librerías externas (antlr-4.13.2-complete.jar)
├── bin/              # Archivos compilados (.class)
├── data/             # Archivos de entrada/salida
└── README.md         # Este archivo
```

## Compilación y Ejecución

### 1. Generar el Parser desde la gramática

```bash
# Generar archivos desde CVParser.g4
java -jar lib/antlr-4.13.2-complete.jar -o generated grammar/CVParser.g4 -visitor

# Generar archivos desde LexerPersona.g4
java -jar lib/antlr-4.13.2-complete.jar -o generated grammar/LexerPersona.g4
```

### 2. Compilar el proyecto

```bash
# Compilar clases generadas
javac -cp lib/antlr-4.13.2-complete.jar -d bin generated/*.java

# Compilar clases del proyecto
javac -cp "lib/antlr-4.13.2-complete.jar:bin" -d bin src/*.java
```

### 3. Ejecutar el programa

```bash
java -cp "lib/antlr-4.13.2-complete.jar:bin" Main
```

## Notas

- Los archivos de entrada se encuentran en `data/cv_entradas.txt`
- La salida se genera en `data/salida.txt`
- Asegúrate de tener Java JDK instalado (versión 8 o superior)
