/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2_exercicio1;

/**
 *
 * @author 11798853
 */
public class gerente {
    private String nome;
    private banco seuBanco;

    public String getNome() {
            return nome;
    }

    public void setNome(String nome) {
            this.nome = nome;
    }

    gerente(String nome, banco novoBanco){
            this.nome = nome;
            this.seuBanco = novoBanco;
    }

    public conta novaConta(float valor) {
            conta suaNovaConta = seuBanco.criaConta(valor);
            suaNovaConta.setBanco(seuBanco);
            return suaNovaConta;
    }

    public boolean verificaEmprestimo(float valor, int id) {
            boolean valido = false;
            if(seuBanco.getExtratoTotal() > valor) {
                    valido = true;
            }
            return valido;
    }

    public boolean verificaCartao(int id) {
            return seuBanco.verificaExtrato(id);
    }
}
