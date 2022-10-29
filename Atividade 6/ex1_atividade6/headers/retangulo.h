#ifndef RETANGULO_H
#define	RETANGULO_H

#include <iostream>
#include <string>
#include "poligono.h"
using namespace std;

class Retangulo : public Poligono {
    public:
        Retangulo(float sLado1, float sLado2) : Poligono(4, "Retangulo"){
            this->lado1 = sLado1;
            this->lado2 = sLado2;
        };

        virtual ~Retangulo(){};

        float getLado1();

        float getLado2();

        float CalculaArea();

        float CalculaPerimetro();

    private:
        float lado1;
        float lado2;
};

#endif    /* RETANGULO_H */