/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2_exercicio1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author 11798853
 */
public class Atividade2_exercicio1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        banco bancoPrincipal = new banco();
        gerente gerente1 = new gerente("Pedro", bancoPrincipal);
        cliente cliente1 = new cliente("Bia", 5000, gerente1);
        cliente cliente2 = new cliente("Heitor", 200, gerente1);
        cliente cliente3 = new cliente("Triz", 100000, gerente1);

        cliente1.depositar(1000);
        cliente1.transferir(300, cliente2.getId());
        cliente3.sacar(987);
        cliente1.emprestimo(1000000);
        cliente2.cartao();

        cliente1.mostrar();
        cliente2.mostrar();
        cliente3.mostrar();
    }
    
}
