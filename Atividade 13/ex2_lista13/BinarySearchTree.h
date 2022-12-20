#ifndef BINARY_SEARCH_TREE_H
#define BINARY_SEARCH_TREE_H

template <typename T>
class BinarySearchTree {
    private:
        // Estrutura de nó para a árvore binária de busca
        struct Node {
            T data;
            Node* left;
            Node* right;

            Node(T data) : data(data), left(nullptr), right(nullptr) {}
        };

        Node* root;  // Nó raiz da árvore

    public:
        BinarySearchTree();
        void insert(T data);
        void remove(T data);
        bool search(T data);
        void printInOrder();

    private:
        void printInOrder(Node* node);
};

#include "BinarySearchTree.cpp"

#endif
