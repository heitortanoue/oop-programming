// Calculadora de números complexos

#include "../headers/complexo.h"

int main () {
    Complexo a(1, 2);
    Complexo b(3, 4);

    Complexo c = a + b;

    c.imprimir();

    Complexo d = a - b;

    d.imprimir();

    Complexo e = a * b;

    e.imprimir();

    Complexo f = a / b;

    f.imprimir();

    return 0;
}

