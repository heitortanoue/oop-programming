/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1_atividade10;

/**
 *
 * @author Pedro
 */
public class Consumidor implements Runnable{
    String nome;
    private Deposito<Integer> deposito;
    private int consumido;
    
    Consumidor(String nome, Deposito<Integer> deposito){
        this.nome = nome;
        this.deposito = deposito;
        consumido = 0;
    }
    
    public int getConsumido() {
        return consumido;
    }
    
    @Override
    public void run(){
        Integer produto;
        while (!deposito.estaFechado()) {
            produto = deposito.envia(nome); // retira produto do deposito
            if (produto != null){
                consumido++;
            }
        }
    }
}
