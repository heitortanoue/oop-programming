#include "radioRelogio.h"

#include "relogio.h"
#include "radio.h"

#include <iostream>

using namespace std;

radioRelogio::radioRelogio() : relogio(), radio() {  
}

radioRelogio::~radioRelogio() {
}

void radioRelogio::setDespertador(radio despertador){
    this->despertador = despertador;
}

void radioRelogio::getDespertador(){
    cout << "Despertador: " << endl;
    cout << "Estação: " << despertador.getEstacao() << endl;
    cout << "Ligado: " << despertador.getLigado() << endl;
}

void radioRelogio::setAlarme(relogio alarme){
    this->alarme = alarme;
}

void radioRelogio::getAlarme(){
    cout << "Alarme: " << endl;
    cout << "Hora: " << alarme.getHora() << endl;
}



