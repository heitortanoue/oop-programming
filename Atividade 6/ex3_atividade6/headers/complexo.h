#ifndef COMPLEXO_H
#define COMPLEXO_H

class Complexo {
    public:
        Complexo(double, double);

        void setReal(double);
        void setImg(double);
        double getReal() const;
        double getImg() const;

        Complexo operator+ (const Complexo &) const;
        Complexo operator- (const Complexo &) const;
        Complexo operator* (const Complexo &) const;
        Complexo operator/ (const Complexo &) const;

        void imprimir() const;
    private:
        double real;
        double img;
};

#endif