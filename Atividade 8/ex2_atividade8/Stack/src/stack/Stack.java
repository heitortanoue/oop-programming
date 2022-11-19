/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.geometry.*;
import javafx.scene.paint.*;
import javafx.scene.canvas.*;
import javafx.scene.text.*;
import javafx.scene.Group;
import javafx.scene.shape.*;

/**
 *
 * @author Heitor Tanoue de Mello - 12547260
 */
public class Stack extends Application {
    
    @Override  
    public void start(Stage primaryStage) throws Exception {  
        // TODO Auto-generated method stub 
        int MAX_SIZE = 100;
        Pilha p = new Pilha(MAX_SIZE);
        p.setMaxSize(3);
                
        Label pilha_label=new Label("Insira na Pilha");   
        TextField tf1=new TextField();  
        Button push_btn = new Button("Empilhar");
        Button pull_btn = new Button ("Desempilhar");
        GridPane root = new GridPane();  
        root.setAlignment(Pos.BOTTOM_CENTER);
        root.setPadding(new Insets(30, 30, 30, 30));
        root.setVgap(25);
        
        ScrollPane sp = new ScrollPane();
        VBox controls = new VBox();
        HBox btns_box = new HBox();  
        HBox center_box = new HBox();
        btns_box.getChildren().addAll(push_btn, pull_btn);
        controls.getChildren().addAll(pilha_label, tf1, btns_box);
        btns_box.setSpacing(15);
        controls.setSpacing(10);
        
        Text info = new Text();
        info.setTextAlignment(TextAlignment.CENTER);
        VBox stack_box = new VBox();
        center_box.getChildren().add(stack_box);
        center_box.setAlignment(Pos.CENTER);
        
        HBox size = new HBox();
        size.setSpacing(20);
        size.setAlignment(Pos.CENTER);
        Text tam_pilha_label = new Text("Tamanho da pilha");
        VBox cont_size = new VBox();
        cont_size.setSpacing(5);
        cont_size.setAlignment(Pos.CENTER);
        Text tam_pilha = new Text("" + p.getMaxSize());
        tam_pilha.setFont(Font.font(null, FontWeight.BOLD, 16));
        Button plus = new Button("+");
        Button minus = new Button("-");
        
        minus.setOnAction(e-> {
            int newSize = Integer.parseInt(tam_pilha.getText());
            if (newSize <= 0) {
                return;
            }
            newSize--;
            
            if (p.getSize() - 1 >= newSize) {
                int removedIndex = p.getSize() - 1;
                try {
                    int removed = p.pull();
                    stack_box.getChildren().remove(stack_box.getChildren().get(0));  
                } catch (PilhaExcecao ex) {
                    System.out.println(e + ": Erro no botao minus");
                    return;
                }     
            }
            p.setMaxSize(newSize);
            tam_pilha.setText("" + newSize);
        });
        plus.setOnAction(e-> {
            int newSize = Integer.parseInt(tam_pilha.getText());
            newSize++;
            
            if (newSize > MAX_SIZE) {
                info.setFill(Color.RED);
                info.setText("Tamanho máximo da pilha atingido.");      
            }
            p.setMaxSize(newSize);
            tam_pilha.setText("" + newSize);
        });
        
        cont_size.getChildren().addAll(tam_pilha_label, tam_pilha);
        size.getChildren().addAll(minus, cont_size, plus);
        sp.setContent(center_box);
        sp.setFitToHeight(true);
        sp.setFitToWidth(true);
        sp.setStyle("-fx-background-color:transparent;");
        
        root.addRow(1, sp);
        root.addRow(2, controls);
        root.addRow(3, size);
        root.addRow(4, info);
        push_btn.setOnAction(e-> {
            if (!tf1.getText().matches("-?\\d+")) {
                tf1.clear();
                return;
            }
            int addNumber = Integer.parseInt(tf1.getText());
            try {
                p.push(addNumber);
                HBox container = new HBox();
                container.setSpacing(5);
                container.setAlignment(Pos.CENTER_LEFT);
                
                Rectangle rect = new Rectangle();
                rect.setWidth(80); //setting the width of rectangle   
                rect.setHeight(40); // setting the height of rectangle 
                rect.setStroke(Color.BLACK);
                rect.setFill(Color.LIGHTGREEN);
                
                Text numLabel = new Text("" + addNumber);
                numLabel.setFill(Color.BLACK);
                
                container.getChildren().addAll(rect, numLabel);
                stack_box.getChildren().add(container);
                container.toBack();
                stack_box.setAlignment(Pos.BOTTOM_CENTER);
                info.setFill(Color.GREEN);
                info.setText(addNumber + " foi adicionado na pilha!");
            } catch (PilhaExcecao ex) {
                info.setFill(Color.RED);
                info.setText("A pilha está cheia.");
            }
            tf1.clear();
        }); 
        
        pull_btn.setOnAction(e-> {
            try {
                int removedIndex = p.getSize() - 1;
                int removed = p.pull();
                stack_box.getChildren().remove(stack_box.getChildren().get(0));
                
                info.setFill(Color.GREEN);
                info.setText(removed + " foi removido da pilha!");
            } catch (PilhaExcecao ex) {
                info.setFill(Color.RED);
                info.setText("A pilha está vazia.");
            }
        });
        
        int SCREEN_WIDTH = 300;
        int SCREEN_HEIGHT = 650;
        Scene scene=new Scene(root,SCREEN_WIDTH, SCREEN_HEIGHT);  
        primaryStage.setMaxWidth(SCREEN_WIDTH);
        primaryStage.setMaxHeight(SCREEN_HEIGHT);
        primaryStage.setMinWidth(SCREEN_WIDTH);
        primaryStage.setMinHeight(SCREEN_HEIGHT);
        primaryStage.setScene(scene);  
        primaryStage.setTitle("Pilha - Exercício 2 - Lista 8"); 
        primaryStage.show();  
    }  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
