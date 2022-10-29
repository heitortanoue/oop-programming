// cria classe triangulo

#include "triangulo.h"

// mostra base do triangulo
float Triangulo::getBase(){
    return base;
}

// mostra altura do triangulo
float Triangulo::getAltura(){
    return altura;
}

// calcula area
float Triangulo::CalculaArea(){
    area = (base * altura) / 2;
    return (float) (base * altura / 2);
}

// calcula perimetro
float Triangulo::CalculaPerimetro(){
    perimetro = base + 2*sqrt((base * base)/4 + altura * altura);
    return (float) (base + 2*sqrt((base * base)/4 + altura * altura));
}

