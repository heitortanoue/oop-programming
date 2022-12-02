/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista9ex2;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author Beatriz Lomes - 12548038
 */
public class Lista9Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "C:\\Users\\heito\\OneDrive\\Desktop";
        String extension = ".jed";
        listFilesForFolderWithFilter(path, extension);
    }
    
    public static void listFilesForFolderWithFilter(String path, String extension) {
        File folder = new File(path);
        for (File fileEntry : folder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(extension) || new File(dir, name).isDirectory();
            }
        })) {
            if (fileEntry.isDirectory()) {
                System.out.println("===== Diretorio: " + fileEntry.getName() + " =====");
                listFilesForFolderWithFilter(fileEntry.getPath(), extension);
                System.out.println("===== Fim do Diretorio: " + fileEntry.getName() + " =====");
            } else {
                System.out.println(fileEntry.getName());
            }
        }
    }

}
