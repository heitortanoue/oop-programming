/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2_exercicio1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author 11798853
 */
public class banco {
    private int numContas;
    private float extratoTotal;
    private List<conta> contas = new ArrayList<>();
    banco(){
            this.setNumContas(1);
            this.setExtratoTotal(0);
    }

    public float getExtratoTotal() {
            return extratoTotal;
    }
    public void setExtratoTotal(float extratoTotal) {
            this.extratoTotal += extratoTotal;
    }
    public int getNumContas() {
            return numContas;
    }
    public void setNumContas(int numContas) {
            this.numContas = numContas;
    }
    public conta criaConta(float valor) {
            conta novaConta = new conta(valor, numContas);
            contas.add(novaConta);
            setExtratoTotal(valor);
            setNumContas(contas.size() + 1);
            return contas.get(numContas - 2);
    }
    public void transferir(float valor, int idOrig, int idDest) {
            float valorPresenteOrig = contas.get(idOrig - 1).getExtrato();
            float valorPresenteDest = contas.get(idDest - 1).getExtrato();
            if (valorPresenteOrig >= valor) {
                    contas.get(idDest - 1).setExtrato(valor + valorPresenteDest);
                    contas.get(idOrig - 1).setExtrato(valorPresenteOrig - valor);
            }

    }
    public boolean verificaExtrato(int id) {
            if (contas.get(id-1).getExtrato() > 0) {
                    return true;
            } else {
                    return false;
            }
    }   
}
