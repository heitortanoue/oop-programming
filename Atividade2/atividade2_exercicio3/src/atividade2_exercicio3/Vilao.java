package atividade2_exercicio3;

public class Vilao extends Personagem {

    public Vilao() {
    }

    private int anosDePrisao;
    private int fama;

    public int getAnosDePrisao() {
        return anosDePrisao;
    }

    public void setAnosDePrisao(int pAnosDePrisao) {
        anosDePrisao = pAnosDePrisao;
        fama = 0;
    }
    
    public void setFama(int pFama){
        fama += pFama;
    }
    
    public int getFama(){
        return fama;
    }
}
