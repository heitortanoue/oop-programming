/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.atividade8;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
/**
 *
 * @author beatr
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label polinomio;
    @FXML
    private Label valorX;
    
    @FXML
    private Button carregarPoli;
    @FXML
    private Button calc;
    
    @FXML
    private TextField x5;
    @FXML
    private TextField x4;
    @FXML
    private TextField x3;
    @FXML
    private TextField x2;
    @FXML
    private TextField x1;
    @FXML
    private TextField x0;
    @FXML
    private TextField x;
    
    private Polinomio poli = new Polinomio();
    
    @FXML
    private void carregouCoef(ActionEvent event) {
        int v[] = new int[6];
        v[0] = Integer.parseInt(x0.getText());
        v[1] = Integer.parseInt(x1.getText());
        v[2] = Integer.parseInt(x2.getText());
        v[3] = Integer.parseInt(x3.getText());
        v[4] = Integer.parseInt(x4.getText());
        v[5] = Integer.parseInt(x5.getText());
        
        poli.carregarCoefientes(v);
        polinomio.setText(poli.mostrarPolinomio());
    }

    @FXML
    private void calcularX(ActionEvent event){
        poli.calcularX(Integer.parseInt(x.getText()));
        String resultado = String.valueOf(poli.retornarResultado());
        
        valorX.setText(resultado);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        x.textProperty().addListener( 
                new ChangeListener<String>() { 
                @Override 
                    public void changed(ObservableValue<? extends String> observable, String oldValue, 
                                        String newValue) { 
                        if (!newValue.matches("\\d*")) { 
                            x.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                    } 
                } 
            );
        
        x0.textProperty().addListener( 
                new ChangeListener<String>() { 
                @Override 
                    public void changed(ObservableValue<? extends String> observable, String oldValue, 
                                        String newValue) { 
                        if (!newValue.matches("\\d*")) { 
                            x0.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                    } 
                } 
            );
        
        x1.textProperty().addListener( 
                new ChangeListener<String>() { 
                @Override 
                    public void changed(ObservableValue<? extends String> observable, String oldValue, 
                                        String newValue) { 
                        if (!newValue.matches("\\d*")) { 
                            x1.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                    } 
                } 
            );
        
        x2.textProperty().addListener( 
                new ChangeListener<String>() { 
                @Override 
                    public void changed(ObservableValue<? extends String> observable, String oldValue, 
                                        String newValue) { 
                        if (!newValue.matches("\\d*")) { 
                            x2.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                    } 
                } 
            );
        
        x3.textProperty().addListener( 
                new ChangeListener<String>() { 
                @Override 
                    public void changed(ObservableValue<? extends String> observable, String oldValue, 
                                        String newValue) { 
                        if (!newValue.matches("\\d*")) { 
                            x3.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                    } 
                } 
            );
        
        x4.textProperty().addListener( 
                new ChangeListener<String>() { 
                @Override 
                    public void changed(ObservableValue<? extends String> observable, String oldValue, 
                                        String newValue) { 
                        if (!newValue.matches("\\d*")) { 
                            x4.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                    } 
                } 
            );
        
        x5.textProperty().addListener( 
                new ChangeListener<String>() { 
                @Override 
                    public void changed(ObservableValue<? extends String> observable, String oldValue, 
                                        String newValue) { 
                        if (!newValue.matches("\\d*")) { 
                            x5.setText(newValue.replaceAll("[^\\d]", "")); 
                        } 
                    } 
                } 
            );
    }    
    
}
