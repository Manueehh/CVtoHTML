@echo off
echo Ejecutando CV Parser...

java -cp lib/antlr-4.13.2-complete.jar;lib/gson-2.13.1.jar;bin Main
if %errorlevel% neq 0 (
    echo Error en la ejecución del programa
    exit /b 1
)

echo Ejecución completada!
