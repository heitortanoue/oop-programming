#ifndef TRIANGULO_H
#define	TRIANGULO_H

#include <iostream>
#include <string>
#include <math.h>
#include "poligono.h"

using namespace std;

class Triangulo : public Poligono {
    public:
        Triangulo(float base, float altura) : Poligono(3, "Triangulo"){
            this->base = base;
            this->altura = altura;
        };

        virtual ~Triangulo(){};

        float getBase();
        float getAltura();

        float CalculaArea();
        float CalculaPerimetro();

    private:
        float base;
        float altura;
};

#endif    /* TRIANGULO_H */