/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2_exercicio1;
import java.util.*;
/**
 *
 * @author 11798853
 */
public class cliente {
    private String nome;
    private conta clienteConta;
    private gerente seuGerente;

    cliente(String nome, float valorInicial, gerente novoGerente){
            this.nome = nome;
            this.clienteConta = novoGerente.novaConta(valorInicial);
            this.seuGerente = novoGerente;
    }

    public String getNome() {
            return nome;
    }
    public void setNome(String nome) {
            this.nome = nome;
    }
    public conta getClienteConta() {
            return clienteConta;
    }

    public void depositar(float valor) {
            clienteConta.deposito(valor);
    }
    public void transferir(float valor, int id) {
            clienteConta.transferencia(valor, id);
    }
    public void emprestimo(float valor) {
            if(seuGerente.verificaEmprestimo(valor, clienteConta.getId())) {
                    System.out.println("Emprestimo aprovado");
            } else {
                    System.out.println("Emprestimo negado");
            }
    }
    public void cartao() {
            if(seuGerente.verificaCartao(getId())) {
                    System.out.println("Cartao aprovado");
            } else {
                    System.out.println("Cartao negado");
            }
    }

    public void sacar (float valor) {
            clienteConta.saque(valor);
    }

    public void mostrar() {
            System.out.println(nome);
            System.out.println(clienteConta.getId());
            System.out.println(clienteConta.getExtrato());
            System.out.println(seuGerente.getNome());
    }

    public int getId() {
            return clienteConta.getId();
    }
}
