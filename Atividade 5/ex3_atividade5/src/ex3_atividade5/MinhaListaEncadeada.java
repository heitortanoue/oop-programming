package ex3_atividade5;

public class MinhaListaEncadeada {
    //atributos da classe Elemento
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;

    // construtor
    public MinhaListaEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    // adicionar no final
    public void adicionarFinal(int valor) {
        Elemento novoElemento = new Elemento(valor);
        if (this.tamanho == 0) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;
    }

    // remover elemento da lista
    public void removerElemento(int valor) {
        if (this.tamanho == 0) {
            System.out.println("Lista vazia");
        } else if (this.tamanho == 1 && this.primeiro.getValor() == valor) {
            this.primeiro = null;
            this.ultimo = null;
            this.tamanho--;
        } else {
            Elemento elementoAuxiliar = this.primeiro;
            Elemento elementoAnterior = null;
            while (elementoAuxiliar.getValor() != valor && elementoAuxiliar.getProximo() != null) {
                elementoAnterior = elementoAuxiliar;
                elementoAuxiliar = elementoAuxiliar.getProximo();
            }
            if (elementoAuxiliar == this.primeiro) {
                this.primeiro = this.primeiro.getProximo();
            } else if (elementoAuxiliar == this.ultimo) {
                this.ultimo = elementoAnterior;
                this.ultimo.setProximo(null);
            } else if (elementoAuxiliar != null) {
                elementoAnterior.setProximo(elementoAuxiliar.getProximo());
            } else{
                System.out.println("Elemento não encontrado");
            }
            this.tamanho--;
        }
    }

    // inserir n elementos no final da lista, com valores de 1 ate n
    public void inserirNElementos(int n) {
        for (int i = 1; i <= n; i++) {
            adicionarFinal(i);
        }
    }

    // imprimir lista
    public void imprimirLista() {
        if (this.tamanho == 0) {
            System.out.println("Lista vazia");
        } else {
            Elemento elementoAuxiliar = this.primeiro;
            for (int i = 0; i < this.tamanho; i++) {
                System.out.println(elementoAuxiliar.getValor());
                elementoAuxiliar = elementoAuxiliar.getProximo();
            }
        }
    }
}
