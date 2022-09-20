package atividade2_exercicio5;
import java.util.*;

/**
 * 
 */
public class Operacoes {

    /**
     * Default constructor
     */
    public Operacoes(float valor1, float valor2) { //valor1 pelo valor2;
        this.valor1 = valor1;
        this.valor2 = valor2;
        System.out.println("Escolha uma operação: 0 - soma; 1 - subtração; 2 - multiplicação; 3 - divisão");
    }

    /**
     * 
     */
    private float valor1;
    private float valor2;

    private float soma() { //tipo 0
       float resultado = valor1 + valor2;
    }

    /**
     * @return
     */
    private float subtracao() { //tipo 1
        float resultado = valor1 - valor2;
        return 0.0f;
    }

    /**
     * @return
     */
    private float divisao() {
        float resultado = valor1 / valor2;
        return 0.0f;
    }

    /**
     * @return
     */
    private float multiplicacao() {
        float resultado = valor1 * valor2;
        return 0.0f;
    }

    public Resultado realizarCalculo(int operacao) {
        
        return null;
    }

}