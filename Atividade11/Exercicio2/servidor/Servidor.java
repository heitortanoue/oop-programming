/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package servidor;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author bealomes
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO Auto-generated method stub
            Socket[] CLIENTES = new Socket[10];
            int i = 0;
            int porta = 123;
            while(true){
                Socket cliente = new Socket("localhost", porta);
                CLIENTES[i] = cliente;
                i++;
                if(i == 10){
                    break;
                }
                porta++;
            }

            //Entrada da mensagem a ser enviada
            Scanner ENTRADA = new Scanner(System.in);
            System.out.print("Digite a mensagem: ");
            String mensagem = ENTRADA.nextLine();

            //Enviar mensagem para clientes a partir de uma thread
            Thread thread = new Thread(new ThreadServidor(CLIENTES, mensagem));
            thread.start();

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            System.exit(-1);
        }    

        
    }
    
}
