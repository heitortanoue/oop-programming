#include <iostream>
#include "BinarySearchTree.h"

// @author: Heitor Tanoue de Mello - 12547260
int main() {
    // Criacao da arvore
    BinarySearchTree<int> bst;

    // Insercao de valores
    bst.insert(5);
    bst.insert(3);
    bst.insert(7);
    bst.insert(1);
    bst.insert(4);
    bst.insert(6);
    bst.insert(8);

    // Busca de valores
    std::cout << "Procurando valor 3: " << (bst.search(3) ? "encontrado" : "não encontrado") << std::endl;
    std::cout << "Procurando valor 10: " << (bst.search(10) ? "encontrado" : "não encontrado") << std::endl;

    // Impressao em ordem, pre remocao
    std::cout << "Impressão em ordem: ";
    bst.printInOrder();

    // Remocao de alguns valores da árvore
    bst.remove(1);
    bst.remove(4);

    // Impressao em ordem, pós remocao
    std::cout << "Impressão em ordem: ";
    bst.printInOrder();

    return 0;
}
