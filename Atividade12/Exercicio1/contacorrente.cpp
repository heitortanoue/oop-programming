// cria classe conta corrente com metodos de deposito e saque usando threads 

#include "contacorrente.h"

ContaCorrente::ContaCorrente()
{
    saldo = 0;
}

void ContaCorrente::deposito(int valor)
{
    saldo += valor;
}

void ContaCorrente::saque(int valor)
{
    saldo -= valor;
}

int ContaCorrente::getSaldo()
{
    return saldo;
}

    