#include "BinarySearchTree.h"

template <typename T>
BinarySearchTree<T>::BinarySearchTree() : root(nullptr) {}

template <typename T>
void BinarySearchTree<T>::insert(T data) {
    if (!root) {  // Se a árvore estiver vazia, o novo nó será a raiz
        root = new Node(data);
        return;
    }

    Node* current = root;  // Inicio da busca no nó raiz
    while (true) {
        if (data < current->data) {  // Se o valor a ser inserido for menor, vamos para a subárvore esquerda
            if (!current->left) {  // Se não houver um nó à esquerda, inserimos o novo nó aqui
                current->left = new Node(data);
                return;
            }
            current = current->left;  // Caso contrário, continuamos a busca na subárvore esquerda
        } else {  // Se o valor a ser inserido for maior ou igual, vamos para a subárvore direita
            if (!current->right) {  // Se não houver um nó à direita, inserimos o novo nó aqui
                current->right = new Node(data);
                return;
            }
            current = current->right;  // Caso contrário, continuamos a busca na subárvore direita
        }
    }
}

template <typename T>
void BinarySearchTree<T>::remove(T data) {
    Node* current = root;  // Iniciamos a busca pelo nó raiz
    Node* parent = nullptr;  // Mantemos uma referência para o nó pai para podermos atualizá-lo quando necessário
    bool isLeft = false;  // Mantemos um registro de se o nó atual é o filho esquerdo ou direito do nó pai

    // Encontramos o nó a ser removido e o nó pai
    while (current && current->data != data) {
    parent = current;
    if (data < current->data) {
        current = current->left;
        isLeft = true;
    } else {
        current = current->right;
        isLeft = false;
    }
    }

    if (!current) {  // Se o nó não foi encontrado, não há nada a ser feito
    return;
    }

    if (!current->left && !current->right) {  // Caso 1: nó folha
    if (!parent) {  // Se o nó a ser removido é a raiz
        root = nullptr;
    } else {
        // Atualizamos o filho do nó pai para apontar para nullptr
        if (isLeft) {
        parent->left = nullptr;
        } else {
        parent->right = nullptr;
        }
    }
    } else if (current->left && !current->right) {  // Caso 2: nó com apenas um filho à esquerda
    if (!parent) {  // Se o nó a ser removido é a raiz
        root = current->left;
    } else {
        // Atualizamos o filho do nó pai para apontar para o filho esquerdo do nó atual
        if (isLeft) {
        parent->left = current->left;
        } else {
        parent->right = current->left;
        }
    }
    } else if (!current->left && current->right) {  // Caso 2: nó com apenas um filho à direita
    if (!parent) {  // Se o nó a ser removido é a raiz
        root = current->right;
    } else {
        // Atualizamos o filho do nó pai para apontar para o filho direito do nó atual
        if (isLeft) {
        parent->left = current->right;
        } else {
        parent->right = current->right;
        }
    }
    } else {  // Caso 3: nó com dois filhos
    // Encontramos o nó sucessor (o menor nó da subárvore direita)
    Node* successor = current->right;
    Node* successorParent = current;
    while (successor->left) {
        successorParent = successor;
        successor = successor->left;
    }

    // Copiamos o valor do sucessor para o nó atual e removemos o sucessor
    current->data = successor->data;
    if (successorParent == current) {  // Se o sucessor é filho direito do nó atual
        current->right = successor->right;
    } else {  // Se o sucessor tem um nó pai (não é filho direito do nó atual)
        successorParent->left = successor->right;
    }
    }

    // Desalocamos o nó removido da memória
    delete current;
}

template <typename T>
bool BinarySearchTree<T>::search(T data) {
    Node* current = root;  // Iniciamos a busca pelo nó raiz
    while (current) {
    if (current->data == data) {  // Se o valor for encontrado, retornamos true
        return true;
    } else if (data < current->data) {  // Se o valor for menor, vamos para a subárvore esquerda
        current = current->left;
    } else {  // Se o valor for maior, vamos para a subárvore direita
        current = current->right;
    }
    }
    return false;  // Se o nó não foi encontrado, retornamos false
}


template <typename T>
void BinarySearchTree<T>::printInOrder() {
    // Chamamos a função recursiva de impressão em ordem para percorrer a árvore
    printInOrder(root);
    std::cout << std::endl;  // Adicionamos uma quebra de linha ao final da impressão
}


template <typename T>
void BinarySearchTree<T>::printInOrder(Node* current) {
    if (!current) return;  // Se o nó atual for nullptr, encerramos a recursão

    // Primeiro visitamos a subárvore esquerda
    printInOrder(current->left);
    // Em seguida, imprimimos o valor do nó atual
    std::cout << current->data << " ";
    // Por fim, visitamos a subárvore direita
    printInOrder(current->right);
}
