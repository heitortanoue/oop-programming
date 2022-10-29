#include "poligono.h"
#include "triangulo.h"
#include "quadrado.h"
#include "retangulo.h"

int main(int argc, char** argv) {
    Triangulo *triangulo = new Triangulo(6, 4);
    Quadrado *quadrado = new Quadrado(5);
    Retangulo *retangulo = new Retangulo(3, 4);

    // calcula as areas
    triangulo->CalculaArea();
    quadrado->CalculaArea();
    retangulo->CalculaArea();

    // calcula os perimetros
    triangulo->CalculaPerimetro();
    quadrado->CalculaPerimetro();
    retangulo->CalculaPerimetro();

    // mostra os lados
    triangulo->MostraLados();
    quadrado->MostraLados();
    retangulo->MostraLados();

    // mostra o nome
    triangulo->MostraNome();
    quadrado->MostraNome();
    retangulo->MostraNome();

    // mostra a area
    triangulo->MostraArea();
    quadrado->MostraArea();
    retangulo->MostraArea();

    // mostra o perimetro
    triangulo->MostraPerimetro();
    quadrado->MostraPerimetro();
    retangulo->MostraPerimetro();

    // mostra informacoes do triangulo
    cout << "Triangulo Base: " << triangulo->getBase() << endl;
    cout << "Triangulo Altura: " << triangulo->getAltura() << endl;

    // mostra informacoes do quadrado
    cout << "Quadrado Lado: " << quadrado->getLado() << endl;

    // mostra informacoes do retangulo
    cout << "Retangulo Lado 1: " << retangulo->getLado1() << endl;
    cout << "Retangulo Lado 2: " << retangulo->getLado2() << endl;
    
    return 0;
}