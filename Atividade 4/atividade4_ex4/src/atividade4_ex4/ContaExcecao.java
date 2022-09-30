/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade4_ex4;

/**
 *
 * @author heito
 */
public class ContaExcecao extends RuntimeException { //não tem a obrigação de verificar a exceção
    ContaExcecao(){
        
    }
    ContaExcecao(String msg){
        super(msg);
    }
}
