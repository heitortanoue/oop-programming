#include "radioRelogio.h"
#include "relogio.h"
#include "radio.h"

//Não tem MAKEFILE, pois o projeto não foi feito no Netbeans
using namespace std;

int main(int argc, char** argv) {
    radioRelogio r;
    relogio re;
    radio ra;
    re.setAlarme("12:00");

    ra.setEstacao("Rádio 1");
    ra.setLigado(true);


    r.setAlarme(re);
    r.setDespertador(ra);

    //Imprimir alarme e despertador
    r.getDespertador();
    r.getAlarme();


    

    return 0;
}

 