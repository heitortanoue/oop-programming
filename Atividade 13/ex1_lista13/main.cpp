#include "generica.h"
#include <cstdlib>
#include <iostream>

using namespace std;
int main(int argc, char** argv) {
    
    generica<int>   *g1 = new generica<int>(10, 50);
    generica<float> *g2 = new generica<float>(10.5, 50.5);
    
    cout << "Maior valor do par 1: " << g1->getMax() << endl;
    cout << "Menor valor do par 1: " << g1->getMin() << endl;
    cout << "Soma do par 1: " << g1->getSum() << endl;
    cout << endl;
    cout << "Maior valor do par 2: " << g2->getMax() << endl;
    cout << "Menor valor do par 2: " << g2->getMin() << endl;
    cout << "Soma do par 2: " << g2->getSum() << endl;
  
    return 0;
}