/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author bealomes
 */
public class ThreadServidor implements Runnable {
    //Servidor recebe lista de clientes
    private Socket[] CLIENTES = null;
    private String mensagem = null;


  

    public ThreadServidor(Socket[] clientes, String mensagem) {
        CLIENTES = clientes;
        this.mensagem = mensagem;
    }
      

    @Override
    public void run() {
        try{
            //Enviar mensagem para clientes
            for(Socket cliente : CLIENTES){
                if(cliente != null){
                    PrintWriter ENVIA = new PrintWriter(
                                            new OutputStreamWriter(
                                                cliente.getOutputStream()));
                    ENVIA.println(mensagem);
                    ENVIA.flush();
                }
            }

            //Fechar conexão
            for(Socket cliente : CLIENTES){
                if(cliente != null){
                    cliente.close();
                }
            }

            //Fechar servidor
            System.exit(0);
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

