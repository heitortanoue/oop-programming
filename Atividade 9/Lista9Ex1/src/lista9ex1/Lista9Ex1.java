/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista9ex1;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author Heitor Tanoue de Mello - 12547260
 */
public class Lista9Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "C:\\Users\\heito\\OneDrive\\Desktop";
        listFilesForFolder(path);
    }
    
    public static void listFilesForFolder(String path) {
        File folder = new File(path);
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                System.out.println("===== Diretorio: " + fileEntry.getName() + " =====");
                listFilesForFolder(fileEntry.getPath());
                System.out.println("===== Fim do Diretorio: " + fileEntry.getName() + " =====");
            } else {
                System.out.println(fileEntry.getName());
            }
        }
    }

}
