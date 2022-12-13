/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Beatriz Cardoso
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Socket SOCKET_CLIENTE = new Socket("localhost", 8008); // cria link com o servidor
            BufferedReader RECEBE = new BufferedReader(new InputStreamReader(SOCKET_CLIENTE.getInputStream())); // fluxo de entrada
            
            String recebido;
            while (true) {
                recebido = RECEBE.readLine();
                System.out.println("O servidor diz: " + recebido);
                if (recebido.equals("Tchau"))
                    break; // termina
            }
            
            RECEBE.close(); // fecha fluxo de entrada
            SOCKET_CLIENTE.close(); // fecha link
        } catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}
