@echo off
echo Generando archivos desde gramáticas ANTLR...

java -jar lib/antlr-4.13.2-complete.jar -o generated grammar/CVParser.g4 -visitor
if %errorlevel% neq 0 (
    echo Error al generar CVParser.g4
    exit /b 1
)

java -jar lib/antlr-4.13.2-complete.jar -o generated grammar/LexerPersona.g4
if %errorlevel% neq 0 (
    echo Error al generar LexerPersona.g4
    exit /b 1
)

echo Compilando archivos generados...
javac -cp lib/antlr-4.13.2-complete.jar -d bin generated\*.java
if %errorlevel% neq 0 (
    echo Error al compilar archivos generados
    exit /b 1
)

echo Compilando clases del proyecto...
javac -cp "lib/antlr-4.13.2-complete.jar;bin" -d bin src\*.java
if %errorlevel% neq 0 (
    echo Error al compilar las clases del proyecto
    exit /b 1
)

echo Compilación completada!
