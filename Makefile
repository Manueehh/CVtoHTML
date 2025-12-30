# Makefile para CVtoHTML

# Directorios
SRC_DIR     := src
BIN_DIR     := bin
LIB_DIR     := lib
GRAMMAR_DIR := grammar
GEN_DIR     := generated

# JARs
ANTLR_JAR   := $(LIB_DIR)/antlr-4.13.2-complete.jar
JFLEX_JAR   := $(LIB_DIR)/jflex-1.9.1.jar
CUP_JAR     := $(LIB_DIR)/java-cup-11b.jar
CUP_RT_JAR  := $(LIB_DIR)/java-cup-runtime-11b.jar
GSON_JAR    := $(LIB_DIR)/gson-2.13.1.jar

# Classpath
CP := $(ANTLR_JAR):$(CUP_RT_JAR):$(GSON_JAR):$(BIN_DIR)

# Gramáticas fuente
ANTLR_G4    := $(wildcard $(GRAMMAR_DIR)/antlr/*.g4)
JFLEX_SPEC  := $(wildcard $(GRAMMAR_DIR)/jflex/*.jflex)
CUP_SPEC    := $(wildcard $(GRAMMAR_DIR)/cup/*.cup)

# Archivos generados
GEN_ANTLR   := $(GEN_DIR)/antlr
GEN_JFLEX   := $(GEN_DIR)/jflex
GEN_CUP     := $(GEN_DIR)/cup

# Marcadores de generación
ANTLR_STAMP := $(GEN_ANTLR)/.generated
JFLEX_STAMP := $(GEN_JFLEX)/.generated
CUP_STAMP   := $(GEN_CUP)/.generated

# Fuentes Java del proyecto (incluyendo subdirectorios)
SRC_JAVA := $(shell find $(SRC_DIR) -name '*.java')

.PHONY: all clean run run-cup dirs

all: dirs $(BIN_DIR)/.compiled

dirs:
	@mkdir -p $(BIN_DIR) $(GEN_ANTLR) $(GEN_JFLEX) $(GEN_CUP)

# === ANTLR (lexer primero para generar .tokens) ===
$(ANTLR_STAMP): $(ANTLR_G4)
	@echo "=== Generando ANTLR ==="
	@cd $(GRAMMAR_DIR)/antlr && java -jar ../../$(ANTLR_JAR) -o ../../$(GEN_ANTLR) LexerPersona.g4
	@cd $(GRAMMAR_DIR)/antlr && java -jar ../../$(ANTLR_JAR) -o ../../$(GEN_ANTLR) -lib ../../$(GEN_ANTLR) CVParser.g4 -visitor
	@touch $@

# === JFlex ===
$(JFLEX_STAMP): $(JFLEX_SPEC) $(CUP_STAMP)
	@echo "=== Generando JFlex ==="
	@for f in $(JFLEX_SPEC); do \
		echo "  $$f"; \
		java -cp $(JFLEX_JAR):$(CUP_RT_JAR) jflex.Main -d $(GEN_JFLEX) $$f; \
	done
	@touch $@

# === CUP ===
$(CUP_STAMP): $(CUP_SPEC)
	@echo "=== Generando CUP ==="
	@for f in $(CUP_SPEC); do \
		echo "  $$f"; \
		java -cp $(CUP_JAR) java_cup.Main -destdir $(GEN_CUP) -parser CupParser -symbols Sym $$f; \
	done
	@touch $@

# === Compilación ===
$(BIN_DIR)/.compiled: $(ANTLR_STAMP) $(JFLEX_STAMP) $(CUP_STAMP) $(SRC_JAVA)
	@echo "=== Compilando ==="
	@javac -cp $(CP) -d $(BIN_DIR) \
		$(GEN_ANTLR)/*.java \
		$(GEN_CUP)/*.java \
		$(GEN_JFLEX)/*.java \
		$(SRC_JAVA) 2>&1 | grep -v "^Note:" || true
	@touch $@
	@echo "✓ Compilación completada"

# === Ejecución ===
run: all
	@echo "=== Ejecutando Main (ANTLR) ==="
	@java -cp $(CP) Main

run-cup: all
	@echo "=== Ejecutando MainCup (JFlex+CUP) ==="
	@java -cp $(CP) MainCup

# === Limpieza ===
clean:
	@echo "=== Limpiando ==="
	@rm -rf $(BIN_DIR)
	@rm -f $(GEN_ANTLR)/*.java $(GEN_ANTLR)/*.tokens $(GEN_ANTLR)/*.interp $(ANTLR_STAMP)
	@rm -f $(GEN_JFLEX)/*.java $(GEN_JFLEX)/*.java~ $(JFLEX_STAMP)
	@rm -f $(GEN_CUP)/*.java $(CUP_STAMP)
	@echo "✓ Limpieza completada"

# === Ayuda ===
help:
	@echo "Targets disponibles:"
	@echo "  make        - Compila todo el proyecto"
	@echo "  make run    - Ejecuta con ANTLR (Main)"
	@echo "  make run-cup - Ejecuta con JFlex+CUP (MainCup)"
	@echo "  make clean  - Limpia archivos generados y compilados"
	@echo "  make help   - Muestra esta ayuda"
