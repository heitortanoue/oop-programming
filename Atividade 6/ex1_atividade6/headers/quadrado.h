#ifndef QUADRADO_H
#define	QUADRADO_H

#include <iostream>
#include <string>
#include "retangulo.h"

using namespace std;

class Quadrado : public Retangulo {
    public:
        Quadrado(float sLado) : Retangulo(sLado, sLado){
            this->lado = sLado;
        };

        virtual ~Quadrado(){};

        float getLado();

        float CalculaArea();

        float CalculaPerimetro();

    private:
        float lado;
};

#endif    /* QUADRADO_H */