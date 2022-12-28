//Criar main que cria uma pilha e empilha 10 valores e evoca as exceções

#include <cstdlib>
#include <iostream>
#include "Pilha.h"
#include "PilhaExcecao.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    Pilha p;
    
    int i;
    for(i=0;i<10;i++){
        p.push(i);
    }
    
    //Adicionar exceção para pilha cheia
    try{
        if(p.topo == 10)
            throw PilhaExcecao(24);
        }else{
            p.push(10);
        }
    }
    catch(PilhaExcecao e){
        e.pilhaCheia();
    }

    

    for(i=0;i<10;i++){
        cout << p.pop() << endl;
    }

    //Adicionar exceção para pilha vazia
    try{
        if(p.topo == 0)
            throw PilhaExcecao(42);
        }else{
             p.pop();
        }
    }catch(PilhaExcecao e){
       e.pilhaVazia();
    }


    return 0;
}