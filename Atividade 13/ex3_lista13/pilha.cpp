#include <iostream>
#include <deque>
#include <algorithm>
#include <iterator>
using namespace std;

// adaptador da classe deque para a classe pilha
template <class T>
class pilha : public deque<T> {
public:
    void push(const T& x) { push_back(x); }
    void pop() { pop_back(); }
    T& top() { return back(); }
    const T& top() const { return back(); }
};

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