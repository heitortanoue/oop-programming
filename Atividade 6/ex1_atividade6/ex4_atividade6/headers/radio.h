#ifndef RADIO_H
#define	RADIO_H
#include <string>
#include <iostream>



using namespace std;
class radio {
public:
    radio();
    radio(bool, string);
    virtual ~radio();
    bool getLigado();
    string getEstacao();
    void setLigado(bool);
    void setEstacao(string);

private:
    bool ligado;
    string estacao;
    
};




#endif	/* RADIO_H */