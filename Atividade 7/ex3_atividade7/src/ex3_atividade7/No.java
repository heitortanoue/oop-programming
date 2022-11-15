package ex3_atividade7;

public class No <T extends Comparable>{
    private T info;
    private No<T> noDireita;
    private No<T> noEsquerda;
    
    public No(T novaInfo, No<T> esq, No<T> dir){
        info = novaInfo;
        noDireita = dir;
        noEsquerda = esq;
    }
    
    public void setInfo(T novaInfo){
        info = novaInfo;
    }
    
    public void setNoDir(No<T> n){
        noDireita = n;
    }
    
    public void setNoEsq(No<T> n){
        noEsquerda = n;
    }
    
    public T retornaInfo(){
        return info;
    }
    
    public No retornaNoDir(){
        return noDireita;
    }
    
    public No retornaNoEsq(){
        return noEsquerda;
    }
}
