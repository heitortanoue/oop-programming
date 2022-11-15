package ex3_atividade7;

public class ArvoreBin <T extends Comparable>{
    private No<T> raiz;
    
    public ArvoreBin() {
        raiz = null;
    }
    public void insere(T info){
        No<T> n = new No(info, null, null);
        if (raiz == null){
            raiz = n;
        }
        else{
            No<T> atual = raiz;
            No<T> anterior;
            while(true){
                anterior = atual;
                if (atual.retornaInfo().compareTo(info) > 0){
                    atual = atual.retornaNoEsq();
                    if (atual == null){
                        anterior.setNoEsq(n);
                        break;
                    }
                }
                else{
                    atual = atual.retornaNoDir();
                    if (atual == null){
                        anterior.setNoDir(n);
                        break;
                    }
                }
            }
        }
    }
    
    public boolean remove(T info){
        No<T> atual = raiz;
        No<T> pai = atual;
        boolean filhoEsq = true;
        while(atual.retornaInfo().compareTo(info) != 0){
            pai = atual;
            if (atual.retornaInfo().compareTo(info) > 0){
                atual = atual.retornaNoEsq();
                filhoEsq = true;
            }
            else{
                atual = atual.retornaNoDir();
                filhoEsq = false;
            }
            if (atual == null){
                return false;
            }
        }
        
        // caso o no removido seja folha, retira-se apenas ele
        if (atual.retornaNoEsq() == null && atual.retornaNoDir() == null) {
            if (atual == raiz){
                raiz = null; // elimina a raiz
            }
            else if (filhoEsq){
                pai.setNoEsq(null); // altera a esquerda do pai para null
            }
            else{
                pai.setNoDir(null); // altera a direita do pai para null
            }
        }
        
        // caso o no nao possua filhos a direita
        else if (atual.retornaNoDir() == null) {
            if (atual == raiz){
                raiz = atual.retornaNoEsq(); // substitui por outra raiz
            }
            else if (filhoEsq){
                pai.setNoEsq(atual.retornaNoEsq()); // se o no estiver a esquerda do pai
            }
            else {
                pai.setNoDir(atual.retornaNoEsq()); // se o no estiver a direita do pai
            }
        }
        
        // caso o no nao possua filhos a esquerda
        else if (atual.retornaNoEsq() == null) {
            if (atual == raiz){
                raiz = atual.retornaNoDir(); // substitui por outra raiz
            }
            else if (filhoEsq){
                pai.setNoEsq(atual.retornaNoDir()); // se o no estiver a esquerda do pai
            }
            else {
                pai.setNoDir(atual.retornaNoDir()); // se o no estiver a direita do pai
            }
        }
        
        // caso possua mais de um filho, for um avô ou outro grau maior de parentesco
        else {
            No<T> sucessor = noSucessor(atual);
            // usa-se o sucessor, que eh o No mais a esquerda da subarvore a direita do No removido
            if (atual == raiz){
                raiz = sucessor; // substitui por outra raiz
            }
            else if(filhoEsq){
                pai.setNoEsq(sucessor); // se o no estiver a esquerda do pai
            } 
            else{
                pai.setNoDir(sucessor); // se o no estiver a direita do pai
            }
            
            sucessor.setNoEsq(atual.retornaNoEsq());   
        }
      
        return true;
    }
    
    public boolean busca(T info){
        No<T> atual = raiz;
        No<T> pai = atual;
        while(atual.retornaInfo().compareTo(info) != 0){
            pai = atual;
            if (atual.retornaInfo().compareTo(info) > 0){
                atual = atual.retornaNoEsq();
            }
            else{
                atual = atual.retornaNoDir();
            }
            if (atual == null){
                return false;
            }
        }
        return true;
    }
    
    public void imprime(){
        System.out.println("Imprimindo Arvore Binaria: ");
        imprimeRecursivo(raiz);
        System.out.println();
    }
    
    public void imprimeRecursivo(No atual) {
        if (atual != null) {
            imprimeRecursivo(atual.retornaNoEsq());
            System.out.println(atual.retornaInfo() + " ");
            imprimeRecursivo(atual.retornaNoDir());
        }
    }
    
    // retorna o sucessor, que eh o No mais a esquerda da subarvore a direita do No removido
    private No<T> noSucessor(No<T> apagado) {
        No<T> paidosucessor = apagado;
        No<T> sucessor = apagado;
        No<T> atual = apagado.retornaNoDir(); // caminha para a subarvore a direita

        while (atual != null) { // encontra o No mais a esquerda
            paidosucessor = sucessor;
            sucessor = atual;
            atual = atual.retornaNoEsq(); // caminha para a esquerda
        } 
        
        // sabendo o No mais a esquerda e seu sucessor, realiza a remocao
        if (sucessor != apagado.retornaNoDir()) { // verifica se sucessor eh o filho a direita do No removido
            // o no esquerda do pai do sucessor recebe o no direito do sucessor
            paidosucessor.setNoEsq(sucessor.retornaNoDir());
            
            // o no direito do sucessor recebe o no direito do no apagado
            sucessor.setNoDir(apagado.retornaNoDir());
        }
        return sucessor;
    }
}