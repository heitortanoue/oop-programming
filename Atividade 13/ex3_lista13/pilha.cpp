#include <iostream>
#include <deque>
#include <algorithm>
#include <iterator>
using namespace std;

// adaptador da classe deque para a classe pilha
template <typename T>
class pilha : public deque<T> {
public:
    void push(const T& x) { this->push_back(x); }
    void pop() { this->pop_back(); }
    T& top() { return this->back(); }
    const T& top() const { return this->back(); }
}; // fim da classe pilha

int main() {
    pilha<int> p;
    p.push(1);
    p.push(2);
    p.push(3);
    p.push(4);
    p.push(5);
    cout << "Tamanho da pilha: " << p.size() << endl;
    cout << "Elementos da pilha: ";
    copy(p.begin(), p.end(), ostream_iterator<int>(cout, " "));
    cout << endl;
    cout << "Topo da pilha: " << p.top() << endl;
    p.pop();
    cout << "Novo topo da pilha: " << p.top() << endl;
    return 0;
}