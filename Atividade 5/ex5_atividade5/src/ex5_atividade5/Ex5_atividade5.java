/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5_atividade5;

/**
 *
 * @author heito
 */
public class Ex5_atividade5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Ex5_atividade5.metodoRecursivo(1);
    }

    public static void metodoRecursivo(int num) {
        System.out.println(num);
        metodoRecursivo(++num);
    }

    
}
