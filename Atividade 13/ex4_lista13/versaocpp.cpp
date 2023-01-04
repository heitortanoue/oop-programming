/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: Pedro
 */

#include <cstdlib> // srand, rand, NULL, RAND_MAX
#include <cmath> // pow
#include <vector> // vector
#include <unordered_set> // unordered_set
#include <ctime> // time_t, time, difftime
#include <algorithm> // find
#include <iostream>
#include <list> // cout

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    long tamanhoG = (long) pow(10, 5);
    
    vector<double> *v = new vector<double>();
    unordered_set<double> *h = new unordered_set<double>();
    list<double> *l = new list<double>();
    
    double *b = new double[tamanhoG/2];
    
    time_t tempoInicial, tempoTotal = 0;
    srand(time(NULL)); // inicializa semente de geracao de numeros pseudo-aleatorios
    
    // insere numeros aleatorios em todas estruturas
    for (long i=0; i < tamanhoG; i++) {
        v->push_back((double) rand() / RAND_MAX); // insere valor aleatorio no vector
        h->insert(v->at(i)); // adiciona mesmo elemento no unordered_set
     //   list->insert(v->at(i));
    }

    // seleciona alguns dos elementos para buscas
    for (long i=0; i < tamanhoG/2; i++)
        b[i] = v->at(rand() % tamanhoG);

    
    // Varredura: vector
    cout << "----------vector----------" << endl;
    tempoInicial = time(NULL); // guarda tempo inicial        
    for (auto i=v->begin(); i != v->end(); i++); // auto existe a partir do C++11
        //cout << *i << endl; // mostra elemento apontado pelo iterador
    cout << "Tempo de varredura (vector): " << difftime(time(NULL), tempoInicial) << endl;
    tempoTotal += difftime(time(NULL), tempoInicial); 
    
    // Busca: vector
    tempoInicial = time(NULL); // guarda tempo inicial        
    for (long i=0; i < tamanhoG/2; i++)
        find(v->begin(), v->end(), b[i]); // executa as buscas
        //if (find(a->begin(), a->end(), b[i]) != a->end()) // executa as buscas
        //    cout << b[i] << " encontrado no vector" << endl;
    cout << "Tempo de busca (vector): " << difftime(time(NULL), tempoInicial) << endl;
    tempoTotal += difftime(time(NULL), tempoInicial); 
    
    // Remocao: vector
    tempoInicial = time(NULL); // guarda tempo inicial        
    for (auto i=v->begin(); i != v->end(); ) // auto existe a partir do C++11
        i = v->erase(i); // remove elemento apontado pelo iterador, e atualiza iterador
    cout << "Tempo de remocao (vector): " << difftime(time(NULL), tempoInicial) << endl;
    tempoTotal += difftime(time(NULL), tempoInicial);
    
    cout << "Tempo total: " << tempoTotal << endl << endl;
    tempoTotal = 0;
    

    // Varredura: unordered_set
    cout << "----------unordered_set----------" << endl;
    tempoInicial = time(NULL); // guarda tempo inicial        
    for (auto i=h->begin(); i != h->end(); i++); // auto existe a partir do C++11
        //cout << *i << endl; // mostra elemento apontado pelo iterador
    cout << "Tempo de varredura (unordered_set): " << difftime(time(NULL), tempoInicial) << endl;
    tempoTotal += difftime(time(NULL), tempoInicial); 
    
    // Busca: unordered_set
    tempoInicial = time(NULL); // guarda tempo inicial        
    for (long i=0; i < tamanhoG/2; i++)
        h->find(b[i]); // executa as buscas
                       // neste caso, seria ineficiente, porem posivel, usar find(h->begin(), h->end(), b[i]);
        //if (h->find(b[i]) != h->end()) // executa as buscas
        //    cout << b[i] << " encontrado no unordered_set" << endl;
    cout << "Tempo de busca (unordered_set): " << difftime(time(NULL), tempoInicial) << endl;
    tempoTotal += difftime(time(NULL), tempoInicial); 
    
    // Remocao: unordered_set
    tempoInicial = time(NULL); // guarda tempo inicial        
    for (auto i=h->begin(); i != h->end(); ) // auto existe a partir do C++11
        i = h->erase(i); // remove elemento apontado pelo iterador, e atualiza iterador
    cout << "Tempo de remocao (unordered_set): " << difftime(time(NULL), tempoInicial) << endl;
    tempoTotal += difftime(time(NULL), tempoInicial); 
    
    cout << "Tempo total (unordered_set): " << tempoTotal << endl << endl;
    tempoTotal = 0;
    
    // Varredura: list
    cout << "----------list----------" << endl;
    tempoInicial = time(NULL); // guarda tempo inicial        
    for (auto i=l->begin(); i != l->end(); i++); // auto existe a partir do C++11
        //cout << *i << endl; // mostra elemento apontado pelo iterador
    cout << "Tempo de varredura (list): " << difftime(time(NULL), tempoInicial) << endl;
    tempoTotal += difftime(time(NULL), tempoInicial); 
    
    // Busca: list
    tempoInicial = time(NULL); // guarda tempo inicial        
    for (long i=0; i < tamanhoG/2; i++)
        find(l->begin(), l->end(), b[i]); // executa as buscas
        //if (find(a->begin(), a->end(), b[i]) != a->end()) // executa as buscas
        //    cout << b[i] << " encontrado no vector" << endl;
    cout << "Tempo de busca (list): " << difftime(time(NULL), tempoInicial) << endl;
    tempoTotal += difftime(time(NULL), tempoInicial); 
    
    // Remocao: list
    tempoInicial = time(NULL); // guarda tempo inicial        
    for (auto i=l->begin(); i != l->end(); ) // auto existe a partir do C++11
        i = l->erase(i); // remove elemento apontado pelo iterador, e atualiza iterador
    cout << "Tempo de remocao (list): " << difftime(time(NULL), tempoInicial) << endl;
   tempoTotal += difftime(time(NULL), tempoInicial);
    
    cout << "Tempo total (list): " << tempoTotal << endl << endl;
    tempoTotal = 0;
    
    // Limpa a memoria
    delete v;
    delete h;
    delete l;
    delete b;
    
    return 0;
}

