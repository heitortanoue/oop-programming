/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2_atividade7;

import java.util.Arrays;

/**
 *
 * @author Heitor Tanoue de Mello - 12547260
 */
public class Ex2_atividade7 {

private static int[] arr = { 13, 22, 12, 51, 44, 128, 10, 244, 14, 27 };

    private static void insertionSort (int[] arr) {
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int temp = arr[j];
            int i = j - 1;
            while (i > -1 && arr[i] > temp) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    //  [MODIFICACAO DO PSEUDOALGORITMO]
    //  Insertion-sort(TIPO[] A)
    //      Laço j <- 1 até (A.tamanho-1)
    //          temp <- A[ j ]
    //          i <- j-1
    //          Enquanto i > -1 E A[i].compareTo(temp) > 0
    //              A[i+1] <- A[i]
    //              i <- i-1
    //          Fim Enquanto
    //              A[i+1] <- temp
    //      Fim Laço
    //  Fim 

    public static void insertionSortComparable (Num[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].getValue() + " ");
        }
        System.out.print("]");
        System.out.println();

        int n = arr.length;
        for (int j = 1; j < n; j++) {
            Num temp = arr[j];
            int i = j - 1;
            while (i > -1 && arr[i].compareTo(temp) > 0) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = temp;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].getValue() + " ");
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        // Insertion sort normal
        insertionSort(arr.clone());

        // Insertion sort com Comparable
        Num[] arrNum = new Num[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrNum[i] = new Num(arr[i]);
        }
        insertionSortComparable(arrNum);
    }

}
