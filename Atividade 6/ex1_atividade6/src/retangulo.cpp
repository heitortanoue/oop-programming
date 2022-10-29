// cria classe retangulo

#include "retangulo.h"

// mostra base do retangulo
float Retangulo::getLado1(){
    return lado1;
}

// mostra altura do retangulo
float Retangulo::getLado2(){
    return lado2;
}

// calcula area
float Retangulo::CalculaArea(){
    area = lado1 * lado2;
    return (float) (lado1 * lado2);
}

// calcula perimetro
float Retangulo::CalculaPerimetro(){
    perimetro = (2 * lado1) + (2 * lado2);
    return (float) (2 * lado1 + 2 * lado2);
}
