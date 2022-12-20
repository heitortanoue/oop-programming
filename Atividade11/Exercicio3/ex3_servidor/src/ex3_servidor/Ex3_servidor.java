/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_servidor;

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
 * @author beatr
 */
public class Ex3_servidor {

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
            Socket SERVIDOR_SOCKET = OUVIDO.accept();

            BufferedReader RECEBE = new BufferedReader(
                        new InputStreamReader(
                                   SERVIDOR_SOCKET.getInputStream()));
            PrintWriter ENVIA = new PrintWriter(
                    new OutputStreamWriter(
                                   SERVIDOR_SOCKET.getOutputStream()));
            String str;
            str = RECEBE.readLine();
            int i = 0;
            if (str.compareTo("POO") == 0){
                while(true){
                    str = RECEBE.readLine();
                    mensagens.add(str);
                    if (str.compareTo("Cambio") == 0){
                        break;
                    }
                    System.out.println(str);
                }
                while (true){
                    ENVIA.println(mensagens.get(i));
                    ENVIA.flush();              
                    if("Cambio".equals(mensagens.get(i))){
                        break;
                    }
                    i++;
                }
            }
            RECEBE.close();
            ENVIA.close();
            SERVIDOR_SOCKET.close();
            OUVIDO.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
    }
    
}
