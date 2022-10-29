#include "relogio.h"
#include <iostream>

using namespace std;

relogio::relogio() {
}


relogio::~relogio() {
}

//Adicionar hora no array de horas
void relogio::setHora(string hora){
    for(int i=0; i<24; i++){
        if(horas[i] == ""){
            horas[i] = hora;
            break;
        }
    }
}

//Adicionar alarme
void relogio::setAlarme(string alarme){
    this->alarme = alarme;
}

//Mostrar horas
void relogio::getHora(){
    for(int i=0; i<24; i++){
        if(horas[i] != ""){
            cout << horas[i] << endl;
        }
    }
}

//Mostrar alarme
void relogio::getAlarme(){
    cout << alarme << endl;
}


