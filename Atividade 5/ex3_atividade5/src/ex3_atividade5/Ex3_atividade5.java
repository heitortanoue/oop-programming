package ex3_atividade5;

public class Ex3_atividade5 {
    
    public static void main(String[] args) {
        MinhaListaEncadeada novaLista = new MinhaListaEncadeada();
        
        novaLista.adicionarFinal(20);
        novaLista.inserirNElementos(10);
        novaLista.removerElemento(5);
        
        novaLista.imprimirLista();
    }
}
