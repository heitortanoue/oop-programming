/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade7;

/**
 *
 * @author bealomes
 */
public class Atividade7 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        GenericCollection<Integer> gc1 = new GenericCollection<>(1, 2);
        GenericCollection<Double> gc2 = new GenericCollection<>(15.66, 2.0);
        GenericCollection<Float> gc3 = new GenericCollection<>(18.05f, 2.032f);
        GenericCollection<String> gc4 = new GenericCollection<>("1", "2");

        System.out.println("Maior valor de gc1: " + gc1.getMax());
        System.out.println("Maior valor de gc2: " + gc2.getMax());
        System.out.println("Maior valor de gc3: " + gc3.getMax());
        System.out.println("Maior valor de gc4: " + gc4.getMax());

        System.out.println("Impressão dos toStrings:");
        System.out.println(gc1.toString());
        System.out.println(gc2.toString());
        System.out.println(gc3.toString());
        
    }
    
}
