

#ifndef PILHA_H
#define PILHA_H

class Pilha{
public:
    Pilha();
    Pilha(const Pilha& orig);
    virtual ~Pilha();
    void push(int valor);
    int pop();
private:
    int *pilha;
    int topo;
};

#endif /* PILHA_H */

// Path: Pilha.cpp