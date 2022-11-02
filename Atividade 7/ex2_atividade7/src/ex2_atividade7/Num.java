/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2_atividade7;

/**
 *
 * @author Heitor Tanoue de Mello - 12547260
 */
public class Num implements Comparable {
    private int value;
    public Num(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public int compareTo (Object o) {
        Num n = (Num) o;
        return this.value - n.value;
    }
}
