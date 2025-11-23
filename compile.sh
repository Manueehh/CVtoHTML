#!/bin/bash

echo "Generando archivos desde gramáticas ANTLR..."
java -jar lib/antlr-4.13.2-complete.jar -o generated grammar/CVParser.g4 -visitor
java -jar lib/antlr-4.13.2-complete.jar -o generated grammar/LexerPersona.g4

echo "Compilando archivos generados..."
javac -cp lib/antlr-4.13.2-complete.jar -d bin generated/*.java

echo "Compilando clases del proyecto..."
javac -cp "lib/antlr-4.13.2-complete.jar:bin" -d bin src/*.java

echo "Compilación completada!"
