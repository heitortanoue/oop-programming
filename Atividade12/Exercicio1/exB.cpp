#include <iostream>
#include <thread>
#include <mutex>

using namespace std;

class ContaCorrente
{
public:
    ContaCorrente(int saldo);
    void deposito(int valor);
    void saque(int valor);
    int getSaldo();
private:
    int saldo;
};
ContaCorrente::ContaCorrente(int saldo)
{
    this->saldo = saldo;
}

void ContaCorrente::deposito(int valor)
{
    int temp = getSaldo() + valor;
    this->saldo = temp;
}

void ContaCorrente::saque(int valor)
{
    int temp = getSaldo() - valor;
    this->saldo = temp;
}

int ContaCorrente::getSaldo()
{
    return saldo;
}

std::mutex mtx;

void depositosTask(ContaCorrente *conta)
{
    for (int i = 0; i < 250000; i++){
        mtx.lock();
        conta->deposito(1);
        mtx.unlock();
    }
}

void saquesTask(ContaCorrente *conta)
{
    for (int i = 0; i < 250000; i++){
        mtx.lock();
        conta->saque(1);
        mtx.unlock();
    }
}

int main()
{
    // cria uma conta corrente
    ContaCorrente conta(100);

    // inicia as threads de depositos e saques usando mutex
    thread depositos(depositosTask, &conta);
    thread saques(saquesTask, &conta);    
    
    // espera as threads terminarem
    depositos.join();
    saques.join();

    // imprime o saldo final
    std::cout << "Saldo final: " << conta.getSaldo() << std::endl; 
}
