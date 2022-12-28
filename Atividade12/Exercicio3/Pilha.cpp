/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cpplite/CPPTemplate.cpp to edit this template
 */

#include "Pilha.h"

Pilha::Pilha() {
    pilha = new int[10];
    topo = 0;
}

Pilha::Pilha(const Pilha& orig) {
}

Pilha::~Pilha() {
}

//push pilha e lançar execao se estiver cheia
void Pilha::push(int valor){
    pilha[topo] = valor;
    topo++;
}


int Pilha::pop(){
    topo--;
    return pilha[topo];
}

// Path: main.cpp