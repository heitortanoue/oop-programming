# Nome do executável
EXEC = program

# Nome dos arquivos de código-fonte
SOURCES = main.cpp 

# Nome dos arquivos de cabeçalho
HEADERS = 

# Compilador
CC = g++

# Flags de compilação
CFLAGS = -std=c++11 -Wall -Wextra -Werror

# Comando "make all" para compilar o programa
all: $(EXEC)

# Compilação do programa
$(EXEC): $(SOURCES) $(HEADERS)
	$(CC) $(SOURCES) $(CFLAGS) -o $(EXEC) 

# Comando "make run" para compilar e executar o programa
run: all
	./$(EXEC)

# Comando "make clean" para remover arquivos gerados durante a compilação
clean:
	rm -f $(EXEC)
