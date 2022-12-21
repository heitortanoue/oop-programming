/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente;

/**
 *
 * @author bealomes
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        //Criar clientes que recebem mensagem do servidor
        int porta = 123;
        for(int i = 0; i < 10; i++){
            Thread thread = new Thread(new ThreadCliente(porta));
            thread.start();
            porta++;
        }

    }
    
}
