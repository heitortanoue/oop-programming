// cria header classe conta corrente com metodos de deposito e saque usando threads 

#ifndef CONTACORRENTE_H
#define CONTACORRENTE_H

class ContaCorrente
{
public:
    ContaCorrente();
    void deposito(int valor);
    void saque(int valor);
    int getSaldo();
private:
    int saldo;
};

#endif // CONTACORRENTE_H