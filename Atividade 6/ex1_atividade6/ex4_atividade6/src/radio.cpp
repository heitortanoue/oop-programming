#include "radio.h"
#include <iostream>
#include <string>

using namespace std;

radio::radio() {
    ligado = false;
    estacao = "Nenhuma";
}

radio::radio(bool l, string e) {
    ligado = l;
    estacao = e;
}

radio::~radio() {
}

bool radio::getLigado() {
    return ligado;
}

string radio::getEstacao() {
    return estacao;
}

void radio::setLigado(bool l) {
    ligado = l;
}

void radio::setEstacao(string e) {
    estacao = e;
}


