// cria uma conta corrente e realiza 5000 depositos e  5000 saques usando std::thread

#include <iostream>
#include <thread>
#include "contacorrente.h"

int main()
{
    ContaCorrente conta;
    std::thread t1[5000];
    std::thread t2[5000];
    for (int i = 0; i < 5000; i++)
    {
        t1[i] = std::thread(&ContaCorrente::deposito, &conta, 1);
        t2[i] = std::thread(&ContaCorrente::saque, &conta, 1);
    }
    for (int i = 0; i < 5000; i++)
    {
        t1[i].join();
        t2[i].join();
    }
    std::cout << conta.getSaldo() << std::endl;
}
