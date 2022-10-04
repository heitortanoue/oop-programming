package ex3_atividade5;

public class Elemento {
    // elemento de uma lista encadeada
    private int valor;
    private Elemento proximo;

    // construtor
    public Elemento(int valor) {
        this.valor = valor;
        this.proximo = null;
    }
    // retorna o valor do elemento
    public int getValor() {
        return this.valor;
    }
    // retorna o proximo elemento
    public Elemento getProximo() {
        return this.proximo;
    }

    //set para o proximo elemento
    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
}
