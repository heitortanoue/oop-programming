/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author Beatriz Cardoso
 */
public class ThreadEnviaCliente implements Runnable {
    Socket umCliente;
    ArrayList<String> mensagens;
    String enviado = "";
    String aEnviar = "";
    
    ThreadEnviaCliente(Socket umCliente, ArrayList<String> mensagens) {
        this.umCliente = umCliente;
        this.mensagens = mensagens;
    }
    
    @Override
    public void run() {
        try {
            PrintWriter ENVIA = new PrintWriter(new OutputStreamWriter(umCliente.getOutputStream())); // cria fluxo de saida
            while (true) {
                aEnviar = mensagens.get(mensagens.size() - 1); // pega mensagem mais recente
                if ( !(aEnviar.equals("") || aEnviar.equals(enviado))) {
                    ENVIA.println(aEnviar);
                    ENVIA.flush();
                    enviado = aEnviar;
                }
                
                if (enviado.equals("Tchau")) {
                    ENVIA.close();
                }
                
                Thread.sleep(1000); // aguarda para receber novas mensagens
            }
        } catch(IOException | InterruptedException e) {
            System.exit(1); // termina com erro
        }
    }
}
