/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 *
 * @author robson
 */
public class RecebeThread implements Runnable {

    private Socket CLIENTE_SOCKET = null;
    @FXML
    private Label label;

    public RecebeThread(Socket umCLIENTE, Label label) {
        this.CLIENTE_SOCKET = umCLIENTE;
        this.label = label;
    }
    
    public void run() {
        try {
            BufferedReader RECEBE = new BufferedReader(
                    new InputStreamReader(
                             CLIENTE_SOCKET.getInputStream()));
            String str = "";
            while(str.compareTo("Tchau") != 0){
                str = RECEBE.readLine();
                label.setText(str);
            }
            RECEBE.close();
            CLIENTE_SOCKET.close();
        } catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
