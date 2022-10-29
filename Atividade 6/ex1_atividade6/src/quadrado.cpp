// cria classe quadrado

#include "quadrado.h"

// mostra lado do quadrado
float Quadrado::getLado(){
    return lado;
}

// calcula area
float Quadrado::CalculaArea(){
    area = lado * lado;
    return (float) (lado * lado);
}

// calcula perimetro
float Quadrado::CalculaPerimetro(){
    perimetro = 4 * lado;
    return (float) (4 * lado);
}