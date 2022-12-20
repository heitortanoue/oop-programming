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
import java.net.Socket;

/**
 *
 * @author robson
 */
public class EnvioThread implements Runnable {

    private Socket SERVIDOR_SOCKET = null;

    public EnvioThread(Socket umCLIENTE) {
        this.SERVIDOR_SOCKET = umCLIENTE;
    }
    
    public void run() {
        try {
            PrintWriter ENVIA = new PrintWriter(
                                    new OutputStreamWriter(
                                        SERVIDOR_SOCKET.getOutputStream()));
            BufferedReader LEITOR_ENTRADA_PADRAO = new BufferedReader(
	                                                  new InputStreamReader(System.in));
            String str = "";
            while(str.compareTo("Tchau") != 0){
                str = LEITOR_ENTRADA_PADRAO.readLine();
                ENVIA.println(str);
                ENVIA.flush();
            }
            
            ENVIA.close();
            SERVIDOR_SOCKET.close();
        } catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
