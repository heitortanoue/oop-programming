package atividade2_exercicio3;
import java.util.*;
import java.util.Random; 

public class Atividade2_exercicio3 {

    public static void main(String[] args) {
        List<Superpoder> poderes = new ArrayList<>();
        
        // criando os superpoderes
        Superpoder superForca = new Superpoder();
        superForca.setSuperpoder("forca", 4, "resistencia");
        poderes.add(superForca);
        
        Superpoder resistencia = new Superpoder();
        resistencia.setSuperpoder("resistencia", 1, "velocidade");
        poderes.add(resistencia);
        
        Superpoder velocidade = new Superpoder();
        velocidade.setSuperpoder("velocidade", 2, "telecinese");
        poderes.add(velocidade);
        
        Superpoder telecinese = new Superpoder();
        telecinese.setSuperpoder("telecinese", 5, "controleMental");
        poderes.add(telecinese);
        
        Superpoder controleMental = new Superpoder();
        controleMental.setSuperpoder("controleMental", 5, "invisibilidade");
        poderes.add(controleMental);
        
        Superpoder invisibilidade = new Superpoder();
        invisibilidade.setSuperpoder("invisibilidade", 2, "gritoSonico");
        poderes.add(invisibilidade);
        
        Superpoder gritoSonico = new Superpoder();
        gritoSonico.setSuperpoder("gritoSonico", 1, "elasticidade");
        poderes.add(gritoSonico);
        
        Superpoder elasticidade = new Superpoder();
        elasticidade.setSuperpoder("elasticidade", 3, "fogo");
        poderes.add(elasticidade);
        
        Superpoder fogo = new Superpoder();
        fogo.setSuperpoder("fogo", 4, "gelo");
        poderes.add(fogo);
        
        Superpoder gelo = new Superpoder();
        gelo.setSuperpoder("gelo", 3, "forca");
        poderes.add(gelo);
        
        // criando personagens
        
        // heroi
        Scanner s = new Scanner(System.in);
        System.out.print("Nome do SuperHeroi 1: ");
        String heroiNome = s.next();
        SuperHeroi heroi = new SuperHeroi();
        heroi.setPersonagem(heroiNome, 100);
        
        Random rand = new Random(); // gerador de aleatorios
        int n = rand.nextInt(10);
        Superpoder poder = poderes.get(n);
        heroi.setSuperpoder(poder);
        n = rand.nextInt(10);
        poder = poderes.get(n);
        heroi.setSuperpoder(poder);
        
        System.out.print("Nome real do SuperHeroi: ");
        String nomeReal = s.next();
        heroi.setNomeVidaReal(nomeReal);
        
        // vilao
        System.out.print("Nome do Vilao 1: ");
        String vilaoNome = s.next();
        Vilao vilao = new Vilao();
        vilao.setPersonagem(vilaoNome, 100);
        n = rand.nextInt(50);
        vilao.setAnosDePrisao(n);
        
        n = rand.nextInt(10);
        poder = poderes.get(n);
        vilao.setSuperpoder(poder);
        n = rand.nextInt(10);
        poder = poderes.get(n);
        vilao.setSuperpoder(poder);
        
        // mostra personagens
        heroi.mostraPersonagem();
        vilao.mostraPersonagem();
        
        // duelos
        
        int cont = 0; // contador de ataques
        boolean flag = true;
        
        while(flag){
            cont++;
            if (cont%2 == 1){ //vilao ataca nas vezes impares
                int intensidade = rand.nextInt(10) + 1; // intensidade do ataque entre 1 e 10
                n = rand.nextInt(2); // escolhe poder
                flag = vilao.ataque(intensidade, vilao.getPoder(n), heroi);

                if(!flag){ // se vilao ganhar
                    vilao.setFama(vilao.getVida());
                    System.out.println("O vilao ganhou do heroi na rodada " + cont);
                    System.out.println("Fama Vilao: " + vilao.getFama());
                    System.out.println("O nome real do Heroi era " + heroi.getNomeVidaReal());
                }
            }
            
            else{
                int intensidade = rand.nextInt(5) + 1;
                n = rand.nextInt(2);
                flag = heroi.ataque(intensidade, heroi.getPoder(n), vilao);
                
                if(!flag){
                    heroi.setPrestigio(heroi.getVida());
                    System.out.println("O heroi ganhou do vilao na rodada " + cont);
                    System.out.println("Prestigio Heroi: " + heroi.getPrestigio());
                    System.out.println("O vilao um estara preso por " + vilao.getAnosDePrisao() + " anos");
                }
            }
        }
    }
}
