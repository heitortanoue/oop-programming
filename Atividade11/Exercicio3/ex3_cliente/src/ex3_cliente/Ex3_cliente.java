/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3_cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author beatr
 */
public class Ex3_cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Socket CLIENTE_SOCKET = new Socket("localhost", 8008);

            PrintWriter ENVIA = new PrintWriter(
                    CLIENTE_SOCKET.getOutputStream(), true);
            BufferedReader RECEBE = new BufferedReader(
                    new InputStreamReader(
                             CLIENTE_SOCKET.getInputStream()));

            BufferedReader LEITOR_ENTRADA_PADRAO = new BufferedReader(
	                                                  new InputStreamReader(System.in));
            String userInput = "";
            
            while(true){
                userInput = LEITOR_ENTRADA_PADRAO.readLine();
                ENVIA.println(userInput);   
                if (userInput.compareTo("Cambio") == 0){
                    break;
                }
            }
            while(true){
                userInput = RECEBE.readLine();
                if (userInput.compareTo("Cambio") == 0){
                    break;
                }
                System.out.println(userInput);
            }
                         
            ENVIA.close();
            RECEBE.close();
            LEITOR_ENTRADA_PADRAO.close();
            CLIENTE_SOCKET.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
}

