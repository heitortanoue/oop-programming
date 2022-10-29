#ifndef POLIGONO_H
#define	POLIGONO_H

#include <iostream>
using namespace std;

class Poligono{
    public:
        // funcoes poligono
        Poligono(int num_lados, string sNome);
        virtual ~Poligono();
        virtual void MostraNome();
        virtual float CalculaArea();
        virtual float CalculaPerimetro();
        virtual void MostraArea();
        virtual void MostraPerimetro();
        virtual void MostraLados();
        virtual void MostraPoligono();

    protected:
        // caracteristicas de um poligono
        int num_lados;
        float area;
        float perimetro;
        string sNome;
};

#endif    /* POLIGONO_H */