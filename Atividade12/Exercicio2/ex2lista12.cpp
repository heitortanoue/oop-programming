#include <iostream>
#include <thread>
#include <mutex>
#include <stdexcept>

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

class saldoInsuficiente : public runtime_error{
public:
    void errorMsg();
    saldoInsuficiente(int saldoAtual);
private:
    int saldo;
}
saldoInsuficiente::saldoInsuficiente(int saldoAtual){
    runtime_error("Saldo insufiente!");
    saldo = saldoAtual;
}
void saldoInsuficiente::errorMsg(){
    cout<<"Saldo insuficiente! Saldo atual: "<<saldo<<endl;
}

class depositoInvalido : public runtime_error{
public:
    depositoInvalido(int deposito);
    void errorMsg();
private:
    int valorDeposito;
}
depositoInvalido::depositoInvalido(int deposito){
    runtime_error("Valor de depósito inválido!");
    valorDeposito = deposito;
}
void depositoInvalido::errorMsg(){
    cout<<"Valor de depósito inválido! Por favor inserir um valor positivo e não nulo."<<endl;
}

int main()
{
    // cria uma conta corrente
    ContaCorrente conta(100);
    int valorSaque = 150;
    int valorDeposito = -1;

    try{
        if(valorSaque > conta.getSaldo()){
            throw(saldoInsuficiente(valorSaque));
        }
        conta.saque(valorSaque);
    } catch (saldoInsuficiente s){
        s.errorMsg();
    }
    
    try{
        if(valorDeposito < 1){
            throw(depositoInvalido(valorDeposito));
        }
        conta.deposito(valorDeposito);
    } catch (depositoInvalido d){
        d.errorMsg();
    }
    
    // imprime o saldo final
    std::cout << "Saldo final: " << conta.getSaldo() << std::endl; 
}
