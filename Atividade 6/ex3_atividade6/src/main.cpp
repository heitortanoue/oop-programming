// Calculadora de números complexos

#include "../headers/complexo.h"

int main () {
    Complexo a(1, 2);
    Complexo b(3, 4);

    Complexo c = a.somar(b);

    c.imprimir();

    Complexo d = a.subtrair(b);

    d.imprimir();

    Complexo e = a.multiplicar(b);

    e.imprimir();

    Complexo f = a.dividir(b);

    f.imprimir();

    return 0;
}

