/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Beatriz Cardoso
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> mensagens = new ArrayList(); // guarda as mensagens 
                                                       // objeto compartilhado entre as threads
        
        mensagens.add("");
        
        try {
            ServerSocket OUVIDO = new ServerSocket(8008);
            
            // continuamente ler do teclado
            Thread THREAD_LEITURA = new Thread(new ThreadLeTeclado(OUVIDO, mensagens));
            THREAD_LEITURA.start();
            
            // continuamente aceitar novos clientes
            while(true) {
                Socket umCliente = OUVIDO.accept(); // aguarda um novo cliente
                // continuamente envia mensagens ao novo cliente
                Thread THREAD_CLIENTE = new Thread(new ThreadEnviaCliente(umCliente, mensagens));
                THREAD_CLIENTE.start();
            }
            
        } catch(IOException e) {
            System.exit(1); // termina a aplicacao com erro
        }
        
    }
    
}
