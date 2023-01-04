#ifndef GENERICA_H
#define GENERICA_H

using namespace std;

template<class T>
class generica {
public:
    generica(T par1, T par2){
        this->par1 = par1;
        this->par2 = par2;
    }
    T getMax();
    T getMin();
    T getSum();
    virtual ~generica(){
        
    }
private:
    T par1;
    T par2;
};


template<class T>
T generica<T>::getMax(){
    if(par1 > par2)
        return par1;
    else
        return par2;
}

template<class T>
T generica<T>::getMin(){
    if(par1 < par2)
        return par1;
    else
        return par2;
}

template<class T>
T generica<T>::getSum(){
    return par1 + par2;
}

#endif /* GENERICA_H */

