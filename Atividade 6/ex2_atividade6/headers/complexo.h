#ifndef COMPLEXO_H
#define COMPLEXO_H

class Complexo {
    public:
        Complexo(double, double);

        void setReal(double);
        void setImg(double);
        double getReal() const;
        double getImg() const;

        Complexo somar(const Complexo &) const;
        Complexo subtrair(const Complexo &) const;
        Complexo multiplicar(const Complexo &) const;
        Complexo dividir(const Complexo &) const;

        void imprimir() const;
    private:
        double real;
        double img;
};

#endif