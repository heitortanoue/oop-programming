// cria uma classe abstrata de poligono

#include "poligono.h"

// construir poligono
Poligono::Poligono(int num_lados, string sNome){
    this->num_lados = num_lados;
    this->sNome = sNome;
}

// destruir poligono
Poligono::~Poligono(){
}

// mostra nome do poligono
void Poligono::MostraNome(){
    cout << "Nome do poligono: " << sNome << endl;
}

// calcula area do poligono
float Poligono::CalculaArea(){
    return area;
}

// calcula perimetro do poligono
float Poligono::CalculaPerimetro(){
    return perimetro;
}

// mostra area do poligono
void Poligono::MostraArea(){
    cout << "Area do poligono: " << area << endl;
}

// mostra perimetro do poligono
void Poligono::MostraPerimetro(){
    cout << "Perimetro do poligono: " << perimetro << endl;
}

// mostra numero de lados do poligono
void Poligono::MostraLados(){
    cout << "Numero de lados do poligono: " << num_lados << endl;
}

// mostra poligono
void Poligono::MostraPoligono(){
    MostraNome();
    MostraLados();
    MostraArea();
    MostraPerimetro();
}
