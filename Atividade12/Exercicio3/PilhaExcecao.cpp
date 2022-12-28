#include "PilhaExcecao.h"

PilhaExcecao::PilhaExcecao(int l) {
   linha = l;
}

PilhaExcecao::PilhaExcecao(const PilhaExcecao& orig) {
}

PilhaExcecao::~PilhaExcecao() {
}

void PilhaExcecao::pilhaCheia(){
    //imprimir Pilha cheia
    cout << "Pilha cheia" << endl;
    cout << "Erro na Linha: " << linha << endl;
}

void PilhaExcecao::pilhaVazia(){
    //imprimir Pilha vazia
    cout << "Pilha vazia" << endl;
    cout << "Erro na Linha: " << linha << endl;
}

// Path: pilhaExcecao.cpp