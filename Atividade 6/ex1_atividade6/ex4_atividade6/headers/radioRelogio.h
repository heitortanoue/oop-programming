#ifndef RADIORELOGIO_H
#define	RADIORELOGIO_H
#include <string>
#include <iostream>
#include "relogio.h"
#include "radio.h"

class radioRelogio : public relogio, public radio {
public:
    radioRelogio();
    virtual ~radioRelogio();
    void setDespertador(radio);
    void getDespertador();
    void setAlarme(relogio);
    void getAlarme();
private:
    radio despertador;
    relogio alarme;
};





#endif	/* RADIORELOGIO_H */
