#include <iostream>
#include <list>
#include <cmath>
using namespace std;

class Termo {
    public:
        float coeficiente;
        unsigned int expoente;

    Termo (unsigned int novo_expoente, float novo_coeficiente) {
        expoente = novo_expoente;
        coeficiente = novo_coeficiente;
    }
    Termo () {
        expoente = 0;
        coeficiente = 0;
    }

    void Mostra () {
        cout << coeficiente << "x^" << expoente;
    }
};

class Polinomio {
    private: 
        Termo *termos;
    public:
        unsigned int max_expoente;
        void Add (Termo t) {
            if (t.expoente > max_expoente) {
                return;
            }
            Termo t1 = getTermo(termos, t.expoente);
            t1.coeficiente += t.coeficiente;
            setTermo(termos, t1, t.expoente);
        }

        Termo getTermo(Termo* _list, int _i){
            return _list[_i];
        }

        void setTermo(Termo* _list, Termo t, int _i) {
            _list[_i] = t;
        }

        void Mostra () {
            for (int i = max_expoente; i >= 0; i--) {
                termos[i].Mostra();
                if (i > 0) {
                    cout << " + ";
                }
            }
            cout << '\n';
        }

        unsigned int Calcula (unsigned int x)  {
            unsigned int y = 0;
            for ( int i = 0; i <= max_expoente; i++) {
                Termo t = termos[i];
                y += (t.coeficiente) * pow(x, t.expoente);
            }
            return y;
        }

    Polinomio (unsigned int novo_max_expoente) {
        max_expoente = novo_max_expoente;
        termos = new Termo[novo_max_expoente + 1];
        for (int i = 0; i <= novo_max_expoente; i++) {
            termos[i].expoente = i;
        }
    } 
};

int main () {
    return 0;
}