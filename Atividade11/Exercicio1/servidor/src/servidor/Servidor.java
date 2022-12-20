/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
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
        boolean bEscutando = true;
        
        try {
            ServerSocket OUVIDO = new ServerSocket(8008);

            while (bEscutando) {
                Socket SERVIDOR_SOCKET = OUVIDO.accept();
                Thread threadEnvio = new Thread(new EnvioThread(SERVIDOR_SOCKET));
                threadEnvio.start();
                Thread threadRecebe = new Thread(new RecebeThread(SERVIDOR_SOCKET));
                threadRecebe.start();
            }
            
            OUVIDO.close();
        } catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
            System.exit(-1);
        }
        
    }
    
}
