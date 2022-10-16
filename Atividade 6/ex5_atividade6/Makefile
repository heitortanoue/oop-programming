CC          := g++
DEBUG_FLAGS := -g3 -pedantic -Werror=implicit-function-declaration -fsanitize=address,undefined
FLAGS       := -Wall -Werror #$(DEBUG_FLAGS)#

SRC         := ./src
BINNAME	 	:= bin
BIN         := ./$(BINNAME)
HEADERS     := ./headers
EXEC        := prog.exe
ZIP         := exercicio.zip

# List of all expected $(BIN)/*.o
ALL         := $(wildcard $(SRC)/*.cpp)
ALL         := $(ALL:$(SRC)/%.cpp=$(BIN)/%.o)


all: $(EXEC)

compile: clean all

run: all
	./$(EXEC)

clean:
	rm -f $(EXEC) $(BIN)/*.o

zip:
	rm -f $(ZIP)
	zip $(ZIP) Makefile $(HEADERS)/*.h $(SRC)/*.cpp

$(EXEC): $(ALL)
	$(CC) -o $(EXEC) $(BIN)/*.o $(FLAGS)

$(BIN)/%.o: $(SRC)/%.cpp $(BIN)
	$(CC) -o $@ -c $< -I $(HEADERS) $(FLAGS)

$(BIN):
	mkdir -p $(BINNAME)