package atividade2_exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Personagem {

    public Personagem() {
    }

    private String nome;
    private List<Superpoder> poderes = new ArrayList<>();;
    private int vida;

    public String getNome() {
        return nome;
    }

    public void setPersonagem(String pNome, int pVida) {
        nome = pNome;
        vida = pVida;
    }

    public int getTotalPoder() {
        int total;
        total = poderes.size();
        return total;
    }
    
    public List<Superpoder> getPoderes(){
        return poderes; 
    }
    
    public Superpoder getPoder(int num){
        return poderes.get(num); 
    }

    public void setVida(int pVida) {
        vida = pVida;
    }
    
    public int getVida() {
        return vida;
    }

    public void setSuperpoder(Superpoder pPoderes) {
        poderes.add(pPoderes);
    }
    
    public void mostraPersonagem(){
        System.out.println(nome);
        System.out.println(poderes.get(0).getNome());
        System.out.println(poderes.get(1).getNome());
    }

    public boolean ataque(int intensidade, Superpoder pPoder, Personagem pAlvo) {
        boolean perdeu;
        String fraqueza = pPoder.getFraqueza();
        List<Superpoder> poderesAlvo = pAlvo.getPoderes();
        List<String> nomesPoderes = poderesAlvo.stream().map(Superpoder::getNome).collect(Collectors.toList());
        if (nomesPoderes.contains(fraqueza)){
            System.out.println("Ataque ineficiente. Poder " + pPoder.getNome() + " tem " + fraqueza + " como fraqueza");
            perdeu = true;
        }
        else{
            Random rand = new Random(); // gerador de aleatorios
            int n = rand.nextInt(2);
            if (n == 1){ //acertou o golpe
                int forcaAtaque = pPoder.getCategoria()*intensidade;
                int vidaAlvo = pAlvo.getVida();
                vidaAlvo -= forcaAtaque;
                pAlvo.setVida(vidaAlvo);
                perdeu = (pAlvo.getVida() > 0);
                System.out.println("Força do golpe foi " + forcaAtaque + ", vida do alvo agora eh " + vidaAlvo);
            }
            else{
                System.out.println("Errou o golpe");
                perdeu = true;
            }
        }
        return perdeu;
    }
}
