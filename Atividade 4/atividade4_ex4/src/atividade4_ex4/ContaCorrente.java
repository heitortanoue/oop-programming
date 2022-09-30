/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade4_ex4;

/**
 *
 * @author heito
 */
public class ContaCorrente {
    private float saldo;
    private float creditoLimite;
    
    public ContaCorrente(float valorLimite){
        this.creditoLimite = valorLimite;
        this.saldo = 0;
    }
    
    public void sacar(float valor) throws ContaExcecao{
        if (valor > saldo + creditoLimite){
            throw new SaldoInsuficiente("Sem limite");
        } else {
            saldo -= valor;
        }
    }
    public void depositar(float valor){
        if(valor <= 0){
            throw new ValorInvalido("Valor inválido");
        } else {
            saldo += valor;
        }
    }
    public void setValorLimite(float valor){
        creditoLimite = valor;
    }
    
    public float getSaldo() {
    	return saldo;
    }
            
            
    //testes: sacar além do valor saldo+limite E depositar um valor zero ou negativo
}
