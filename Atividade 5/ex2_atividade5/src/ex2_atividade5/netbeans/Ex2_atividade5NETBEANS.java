/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2_atividade5.netbeans;

/**
 *
 * @author heito
 */
public class Ex2_atividade5NETBEANS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MinhaMatrizDinamica m = new MinhaMatrizDinamica(3, 3);
        m.preencheMatriz();
        m.setElemento(2,2, 10);
        m.imprimeMatriz();
    }
    
}
