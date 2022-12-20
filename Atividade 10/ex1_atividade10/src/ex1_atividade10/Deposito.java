/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1_atividade10;

import java.util.Stack;

/**
 *
 * @author Pedro
 */
public class Deposito<pilha> extends Stack<pilha> {
    int limite = 10;
    boolean estoqueVazio;
    Deposito(){
        estoqueVazio = false;
    }
    
    public boolean estaFechado() {
        return estoqueVazio && isEmpty();
    }
    
    synchronized public void fecha() {
        estoqueVazio = true;
    }
    
    synchronized public void recebe(String nomeProdutor, pilha produto){
        while (size() == limite) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        
        push(produto);
        notifyAll();
    }
    
    synchronized public pilha envia(String consumidor){
        while (isEmpty() && !estaFechado()) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Erro: " + e.getMessage());
            } 
        }
        
        if (estaFechado())
            return null; // nada mais a retirar
        
        pilha produto = pop();
        //System.out.println("Consumidor " + nomeConsumidor + " retirou o produto " + produto);
        notifyAll();
        return produto;
    }
}
