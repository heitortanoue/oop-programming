/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.util.ArrayList;

/**
 *
 * @author Beatriz Cardoso
 */
public class ThreadLeTeclado implements Runnable {
    ServerSocket OUVIDO;
    ArrayList<String> mensagens;
    
    ThreadLeTeclado(ServerSocket OUVIDO, ArrayList<String> mensagens) {
        this.OUVIDO = OUVIDO;
        this.mensagens = mensagens;
    }
    
    @Override
    public void run() {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        String lido;
        try {
            while (true) {
                lido = teclado.readLine(); // le do teclado
                mensagens.add(lido); // guarda mensagem
                if (lido.equals("Tchau")) {
                    System.out.println("Saindo...");
                    Thread.sleep(2000); // aguarda que o "Tchau" seja enviado aos clientes
                    OUVIDO.close();
                    System.exit(0); // termina a aplicacao com sucesso
                }
            }
        } catch(IOException | InterruptedException e) {
            System.exit(1); // termina a aplicacao com erro
        }
    }
}
