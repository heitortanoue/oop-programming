
//criar a classe de exceção com exceção do tipo pilhaCheia  e  exceção pilhaVazia 

//criar a classe de exceção com exceção do tipo pilhaCheia  e  exceção pilhaVazia

// Path: pilhaExcecao.h
// Compare this snippet from Pilha.h:
//
//
#ifndef PILHAEXCECAO_H
#define PILHAEXCECAO_H

class PilhaExcecao{
public:
    PilhaExcecao(int linha);
    PilhaExcecao(const PilhaExcecao& orig);
    virtual ~PilhaExcecao();
    void pilhaCheia();
    void pilhaVazia();
private:
    int linha;
};

#endif /* PILHAEXCECAO_H */
