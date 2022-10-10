/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meuprojeto;

/**
 *
 * @author heito
 */
public class Meuprojeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MeuVetorDinamico vetor = new MeuVetorDinamico(5);
        vetor.preencherPosicao(0, 1);
        vetor.preencherPosicao(1, 2);
        vetor.preencherPosicao(2, 3);
        vetor.preencherPosicao(3, 4);
        vetor.preencherPosicao(4, 5);
        
        vetor.imprimirVetor();
        
        vetor.preencherTodos();
        
        vetor.imprimirVetor();
    }
    
}
