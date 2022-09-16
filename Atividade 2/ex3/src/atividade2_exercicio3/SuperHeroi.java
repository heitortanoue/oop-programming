package atividade2_exercicio3;

public class SuperHeroi extends Personagem {

    public SuperHeroi() {
    }

    private String nomeVidaReal;
    private int prestigio;

    public String getNomeVidaReal() {
        return nomeVidaReal;
    }

    public void setNomeVidaReal(String pNomeVidaReal) {
        nomeVidaReal = pNomeVidaReal;
        prestigio = 0;
    }
    
    public void setPrestigio(int pPrestigio){
        prestigio += pPrestigio;
    }
    
    public int getPrestigio(){
        return prestigio;
    }
}