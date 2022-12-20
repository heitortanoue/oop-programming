/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author beatr
 */
public class FXMLDocumentController implements Initializable {
    
    private Socket CLIENTE_SOCKET;
    boolean bEscutando = true;
    
    @FXML
    private Label label;
    
    @FXML
    private TextField ip;
    @FXML
    private TextField msg;
    
    @FXML
    private Button conec;
    @FXML
    private Button enviaMsg;
    
    @FXML void conectaIP(ActionEvent event){
        ip.textProperty().addListener( 
                new ChangeListener<String>() { 
                @Override 
                    public void changed(ObservableValue<? extends String> observable, String oldValue, 
                                        String newValue) { 
                        if (!newValue.matches("\\d*")) { 
                            ip.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                    } 
                } 
            );
        System.out.println(ip.getText());
        try{
            CLIENTE_SOCKET = new Socket(ip.getText(), 8008);
            while (bEscutando) {
                Thread threadRecebe = new Thread(new RecebeThread(CLIENTE_SOCKET, label));
                threadRecebe.start();
            }
        }catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    @FXML
    private void Enviamsg(ActionEvent event) {
        try {
            PrintWriter ENVIA = new PrintWriter(
                    CLIENTE_SOCKET.getOutputStream(), true);
            msg.textProperty().addListener( 
                new ChangeListener<String>() { 
                @Override 
                    public void changed(ObservableValue<? extends String> observable, String oldValue, 
                                        String newValue) { 
                        if (!newValue.matches("\\d*")) { 
                            msg.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                    } 
                } 
            );
            String str = "";
            while(str.compareTo("Tchau") != 0){
                str = msg.getText();
                ENVIA.println(str);
                ENVIA.flush();
            }
            
            ENVIA.close();
            CLIENTE_SOCKET.close();
        } catch(IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
