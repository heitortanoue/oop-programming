/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


/**
 *
 * @author bealomes
 */
public class ThreadCliente  implements Runnable {
    private int porta = 0;
    
    public ThreadCliente(int porta) {
        this.porta = porta;
    }
    
    @Override
    public void run() {
   
        //Receber mensagem do servidor
        try {
            Socket cliente = new Socket("localhost", porta);
            BufferedReader RECEBE = new BufferedReader(
                                        new InputStreamReader(
                                            cliente.getInputStream()));
            String mensagem = RECEBE.readLine();
            System.out.println("Mensagem recebida: " + mensagem);
            cliente.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}
    
