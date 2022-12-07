/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4_lista10;

import java.math.BigInteger;
/**
 *
 * @author Heitor Tanoue de Mello - 12547260
 */
public class Ex4_lista10 {

    public static void main(String[] args) throws Exception {
        BigInteger quant = new BigInteger("10000000");
        // EXERCICIO A
        System.out.println("=== SEM THREADS ===");
        for (int i = 0; i < 10; i++) {
            double tempoInicial = System.currentTimeMillis();
            calcRaizQuadrada(quant);
            double tempoFinal = System.currentTimeMillis();
            System.out.println("Tempo gasto: " + (tempoFinal - tempoInicial) + " ms");
        }

        // EXERCICIO B
        //System.out.println("Nucleos: " + checkNucleos());
        System.out.println("=== COM THREADS ===");
        for (int i = 0; i < 10; i++) {
            double tempoInicial = System.currentTimeMillis();
            calcRaizQuadradaMultiThread(quant, checkNucleos());
            double tempoFinal = System.currentTimeMillis();
            System.out.println("Tempo gasto: " + (tempoFinal - tempoInicial) + " ms");
        }
    }

    // funcao que calcula raiz quadrada de 10^N numeros aleatorios
    public static void calcRaizQuadrada(BigInteger quant) {
        // for with BigInteger
        for (BigInteger i = BigInteger.ZERO; i.compareTo(quant) < 0; i = i.add(BigInteger.ONE)) {
            double x = Math.random();
            //double y = Math.sqrt(x);
            //double y = x + 1;
            double y = Math.sqrt(x) + Math.pow(x, 3) * Math.cos(x);
        }
    }

    // funcao que checa quantos nucleos tem o processador (o meu tem 8)
    public static int checkNucleos() {
        return Runtime.getRuntime().availableProcessors();
    }

    // funcao que cria nCore threads e calcula 10^N/nCore raizes para cada uma
    public static void calcRaizQuadradaMultiThread(BigInteger quant, int nCore) {
        // criar nCore threads
        for (int i = 0; i < nCore; i++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    BigInteger divisao = quant.divide(BigInteger.valueOf(nCore));
                    // para cada core, calcular 10^N/nCore raizes
                    for (int i = 0; i < nCore; i++) {
                        calcRaizQuadrada(divisao);
                    }
                }
            });
            t.start();
        }
    }
    
}
