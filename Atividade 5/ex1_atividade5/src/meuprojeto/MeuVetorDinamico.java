/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuprojeto;

/**
 *
 * @author heito
 */
public class MeuVetorDinamico {
   private int tamanho;
   private int[] valores;
   
   public MeuVetorDinamico ( int tamanho ) {
       this.valores = new int[tamanho];
       this.tamanho = tamanho;
       for (int i = 0; i < tamanho; i++) {
           this.valores[i] = 0;
       }
   }
   
   public void preencherPosicao (int pos, int v) {
       this.valores[pos] = v;
   }
   
   public void preencherTodos () {
       for (int i = 0; i < this.tamanho; i++) {
           this.valores[i] = i*100;
       }
   }
   
   public void imprimirVetor () {
        for (int i = 0; i < this.tamanho; i++) {
           System.out.println(this.valores[i]);
       }
   }
}
