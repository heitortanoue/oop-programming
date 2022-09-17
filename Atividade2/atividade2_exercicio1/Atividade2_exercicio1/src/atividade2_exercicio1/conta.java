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
public class conta {
    private float extrato;
    private int id;
    private banco seuBanco;

    conta(float extrato, int id){
            this.extrato = extrato;
            this.id = id;
    }

    public float getExtrato() {
            return extrato;
    }

    public void setExtrato(float extrato) {
            this.extrato = extrato;
    }

    public int getId() {
            return id;
    }

    public void setId(int id) {
            this.id = id;
    }

    public int saque(float valor) {
            if(valor <= this.extrato) {
                    setExtrato(this.extrato - valor);
                    return 1;
            }
            else {
                    return 0;
            }

    }

    public int transferencia(float valor, int id) {
            seuBanco.transferir(valor, this.getId(), id);
            return 1;
    }

    public int deposito(float valor) {
            if (valor > 0) {
                    setExtrato(getExtrato() + valor);
                    return 1;
            }
            else {
                    return 0;
            }
    }

    public void setBanco(banco novoBanco) {
            this.seuBanco = novoBanco;
    } 
}
