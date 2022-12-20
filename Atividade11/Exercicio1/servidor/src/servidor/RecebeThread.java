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
public class RecebeThread implements Runnable {

    private Socket SERVIDOR_SOCKET = null;

    public RecebeThread(Socket umCLIENTE) {
        this.SERVIDOR_SOCKET = umCLIENTE;
    }
    
    public void run() {
        try {
            BufferedReader RECEBE = new BufferedReader(
                                        new InputStreamReader(
                                            SERVIDOR_SOCKET.getInputStream()));
            String str = "";
            while(str.compareTo("Tchau") != 0){
                str = RECEBE.readLine();
                System.out.println(str);
            }
            RECEBE.close();
            SERVIDOR_SOCKET.close();
        } catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
