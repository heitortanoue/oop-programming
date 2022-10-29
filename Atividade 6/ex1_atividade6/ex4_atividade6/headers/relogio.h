#ifndef RELOGIO_H
#define	RELOGIO_H
#include <string>
#include <iostream>

using namespace std;
class relogio {
    
public:
    relogio();
    virtual ~relogio();
    void setHora(string);
    void setAlarme(string);
    void getHora();
    void getAlarme();

protected:
   string horas[24];
   string alarme;
};



#endif	/* RELOGIO_H */