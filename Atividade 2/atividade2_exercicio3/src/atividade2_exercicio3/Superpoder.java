package atividade2_exercicio3;

public class Superpoder {

    public Superpoder() {
    }

    private int categoria;
    private String fraqueza;
    private String nome;

    public void setSuperpoder(String pNome, int pCategoria, String pFraqueza) {
        nome = pNome;
        categoria = pCategoria; // de 1 a 5
        fraqueza = pFraqueza; // poder que anula esse poder
    }
    
    public int getCategoria() {
        return categoria;
    }

    public String getNome() {
        return nome;
    }

    public String getFraqueza(){
        return fraqueza;
    }
}