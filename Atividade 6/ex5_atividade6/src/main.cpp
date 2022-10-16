#include "../headers/complexo.h"
#include <iostream>
#include <vector>
#include <cstdlib>

using namespace std;

int main(){
    vector<Complexo> nums;
    nums.clear();

    int n;
    cin >> n;
    
    double r = rand() % 1000;
    double img = rand() % 1000;
    Complexo x(r, img);
    nums.push_back(x);

    for (int i = 0; i < n - 1; i++){
        double r = rand() % 1000;
        double img = rand() % 1000;
        Complexo x(r, img);
        nums.push_back(x);
    }

    Complexo soma(0, 0);

    for (Complexo c : nums){
        soma = soma + c;
    }

    soma.imprimir();
}