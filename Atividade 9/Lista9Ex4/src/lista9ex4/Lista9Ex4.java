/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista9ex4;

import java.io.*;

/**
 *
 * @author Pedro
 */
public class Lista9Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File binNome = new File("nome.txt");
        //binNome.createNewFile();
        String nome = "Pedro Oliveira Torrente";
        byte[] b = new byte[256];
        b = nome.getBytes();
        ByteArrayInputStream bstream = new ByteArrayInputStream(b);
        
        //  FileInputStream nomeIn = new FileInputStream();
        FileOutputStream nomeOut = new FileOutputStream(binNome);
        nomeOut.write(b, 0, nome.length());
    }
    
}
