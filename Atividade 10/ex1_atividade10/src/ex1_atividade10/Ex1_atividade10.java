/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1_atividade10;

/**
 *
 * @author Pedro
 */
public class Ex1_atividade10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int unidades = 100000; // unidades a produzir
        String [] nomes = {"Dona Maria", "Dona Ana", "Senhor Jose", "Dona Joaquina"};
                
        Deposito<Integer> deposito = new Deposito();
        Thread tProdutor = new Thread(new Produtor("Padaria", unidades, deposito));
        
        Consumidor [] Consumidores = new Consumidor[nomes.length];
        Thread [] tConsumidores = new Thread[nomes.length];
        for (int i=0; i<nomes.length; i++) {
            Consumidores[i] = new Consumidor(nomes[i], deposito);
            tConsumidores[i] = new Thread(Consumidores[i]);
        }
        
        tProdutor.start(); // inicia a producao
        for (int i=0; i<nomes.length; i++)
            tConsumidores[i].start(); // inicia o consumo
        
        try {
            tProdutor.join(); // espera o termino da producao
            for (int i=0; i<nomes.length; i++)
                tConsumidores[i].join(); // espera o termino do consumo
        } catch(InterruptedException e) {
            System.out.println("Erro:" + e.getMessage());
        }
        
        // lista consumos
        for (int i=0; i<nomes.length; i++)
            System.out.println("O consumidor " + nomes[i] + " consumiu " + Consumidores[i].getConsumido());
        
        System.out.println(); // nova linha
        
        // descobre o maior consumidor
        int iMaior = 0;
        for (int i=1; i<nomes.length; i++)
            if (Consumidores[i].getConsumido() > Consumidores[iMaior].getConsumido())
                iMaior = i;
        System.out.println("O maior consumidor foi " + nomes[iMaior] + ", o qual consumiu " + Consumidores[iMaior].getConsumido());
    }
    
}
