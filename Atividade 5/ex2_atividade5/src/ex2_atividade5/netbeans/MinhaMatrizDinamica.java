/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2_atividade5.netbeans;

/**
 *
 * @author heito
 */
public class MinhaMatrizDinamica {
    private int numLinhas;
    private int numColunas;
    private int[][] matriz;

    MinhaMatrizDinamica (int numLinhas, int numColunas) {
        this.numLinhas = numLinhas;
        this.numColunas = numColunas;
        matriz = new int[numLinhas][numColunas];

        // preenche a matriz alocada com 0
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    public void setElemento (int linha, int coluna, int valor) {
        matriz[linha][coluna] = valor;
    }

    public void preencheMatriz () {
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                matriz[i][j] = i + j;
            }
        }
    }

    public void imprimeMatriz () {
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

