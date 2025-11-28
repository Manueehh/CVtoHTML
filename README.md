# CV Parser

Proyecto de análisis de CVs usando ANTLR, JFlex y CUP.

## Estructura del Proyecto

```
cv-parser/
├── src/              # Código fuente Java (clases de modelo y Main)
├── grammar/          # Gramáticas ANTLR (.g4), JFlex (.jflex) y CUP (.cup)
├── generated/        # Archivos generados por ANTLR, JFlex y CUP
├── lib/              # Librerías externas (antlr-4.13.2-complete.jar)
├── bin/              # Archivos compilados (.class)
├── data/             # Archivos de entrada/salida
└── README.md         # Este archivo
```

## Compilación y Ejecución

```bash
make          # Compila todo
make run      # Ejecuta con ANTLR
make run-cup  # Ejecuta con JFlex+CUP
make clean    # Limpia archivos generados
make help     # Muestra ayuda
```

El Makefile realiza compilación incremental: solo regenera lo que ha cambiado.

## Notas

- Los archivos de entrada se encuentran en `data/cv_entradas.txt`.
- La salida se genera en `data/salida.txt`.
- Asegúrate de tener Java JDK instalado (versión 8 o superior)
