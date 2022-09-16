#include <iostream>

using namespace std;

class Celular {
private:
    char modelo;
    int ano;
public: 
    Celular(char pModelo, int pAno);
    char consultaModelo();
    int consultaAno();
};

class Comunicacao: public Celular {
private:
    char protocolo;
    int conexoes;
    
    Comunicacao(char pModelo, char pProt, int pConex);
    void alteraProt(char nProt);
    void alteraConex(int nConex, boolean op);
};


class Processador: public Celular {
private: 
    int frequencia;
    int qtdCore;
    
    Processador(char pModelo, int pFreq, int pCore);
    void alteraFreq(int nFreq, boolean op);
    void alteraCore(int nCore, boolean op);
};

class Som: public Celular {
private:
    int volume;
    Som(char pModelo, int pVol);

public: 
   void alteraVol(int nVol, boolean op);
};

class Tela: public Celular {
private: 
    char tipo;
    int tamanho;
    
    Tela(char pModelo, char pTipo, int pTam);
    void alteraTam(int nTam, boolean op);
    char consultaTipo();
};