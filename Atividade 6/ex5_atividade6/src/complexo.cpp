#include "../headers/complexo.h"
#include <iostream>

using namespace std;

Complexo::Complexo(double real, double img) {
    this->real = real;
    this->img = img;
}

void Complexo::setReal(double real) {
    this->real = real;
}

void Complexo::setImg(double img) {
    this->img = img;
}

double Complexo::getReal() const {
    return real;
}

double Complexo::getImg() const {
    return img;
}

void Complexo::imprimir() const {
    cout << real << "+" << img << "*i" << endl; 
}

Complexo Complexo::operator+(const Complexo &c) const {
    return Complexo(real + c.real, img + c.img);
}

Complexo Complexo::operator-(const Complexo &c) const {
    return Complexo(real - c.real, img - c.img);
}

Complexo Complexo::operator*(const Complexo &c) const {
    return Complexo(real * c.real - img * c.img, real * c.img + img * c.real);
}

Complexo Complexo::operator/(const Complexo &c) const {
    return Complexo((real * c.real + img * c.img) / (c.real * c.real + c.img * c.img), (img * c.real - real * c.img) / (c.real * c.real + c.img * c.img));
}
