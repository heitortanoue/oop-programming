/* 1.) a. Para valores baixos de repetição, tipo 5000 o código roda sem problemas, apresentando valores corretos
como resultado final. Para valores maiores, em torno de 25000, o código já começa a apresentar problemas,
resultando em valores incorretos. Isso ocorre devido ao fato de que as threads estão acessando a mesma variável
simultaneamente e, portanto, não estão sendo executadas de forma correta por conta do conflito no acesso e utilização
da informação. Para resolver esse problema, é necessário utilizar o mutex, que é um mecanismo de sincronização
que permite que apenas uma thread acesse a informação por vez. Assim, o código fica igual a implementação do 1b.

*/

// Autora: Beatriz Cardoso

#include <iostream>
#include <thread>

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

void depositosTask(ContaCorrente *conta)
{
    for (int i = 0; i < 25000; i++)
        conta->deposito(1);
}

void saquesTask(ContaCorrente *conta)
{
    for (int i = 0; i < 25000; i++)
        conta->saque(1);
}

int main()
{
    // cria uma conta corrente
    ContaCorrente conta(100);

    // inicia as threads
    thread depositos(depositosTask, &conta);
    thread saques(saquesTask, &conta);    
    
    // espera as threads terminarem
    depositos.join();
    saques.join();

    // imprime o saldo final
    std::cout << "Saldo final: " << conta.getSaldo() << std::endl; 
}
