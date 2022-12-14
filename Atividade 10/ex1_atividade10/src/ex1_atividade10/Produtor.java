/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1_atividade10;

/**
 *
 * @author Pedro
 */
public class Produtor implements Runnable{
    private Deposito<Integer> deposito;
    String nome;
    int aProduzir;
    
    Produtor(String nome, int aProduzir, Deposito<Integer> deposito){
        this.nome = nome;
        this.deposito = deposito;
        this.aProduzir = aProduzir;
    }
    
    @Override
    public void run(){
        for (int i=0; i < aProduzir; i++){
            deposito.recebe(nome, i); 
        }
        deposito.fecha();
    }
}
