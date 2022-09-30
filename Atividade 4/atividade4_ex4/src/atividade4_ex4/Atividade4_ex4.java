/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade4_ex4;

/**
 *
 * @author heito
 */
public class Atividade4_ex4 {

    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1000);
        try{
            conta1.depositar(1500);
        } catch (ValorInvalido e){
            System.out.println("Valor de deposito invalido");
        }
        
        try{
            conta1.sacar(1011);
        } catch (SaldoInsuficiente e){
            System.out.println("Valor insuficiente de saque");
        }
        
        System.out.println(conta1.getSaldo());
    }
    
}
