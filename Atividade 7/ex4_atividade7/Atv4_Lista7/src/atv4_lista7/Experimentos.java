/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv4_lista7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Pedro
 */
public class Experimentos {
    ArrayList<Double> nums = new ArrayList<Double>();
    LinkedList<Double> numsLink = new LinkedList<Double>();
    long tamMax = 100000;
    
    void experimentoA(){
        long tempoInicial = System.currentTimeMillis(); 
        for (long i = 0; i < tamMax; i++){
            nums.add(Math.random()*tamMax);
        }
        for (long i = 0; i < 10000000; i++){
            nums.get((int) (Math.random() * tamMax));
        }
        
        long tempoFinal = System.currentTimeMillis();
        float tempoTotal = (float)(tempoFinal - tempoInicial) / 60000;
        System.out.printf( "%.5f\n",tempoTotal );
    }
    
    void experimentoB(){
        HashSet hs = new HashSet();
        while(hs.size() < tamMax/10){
            int numAleat = (int)(Math.random()*tamMax);
            hs.add(numAleat);   
        }
        
        Iterator it = hs.iterator();
        
        long tempoInicial = System.currentTimeMillis();
        
        for (long i = 0; i < tamMax/10; i++){
            nums.remove(it.next());
        }
        
        for (long i = 0; i < tamMax/10; i++){
            nums.add(Math.random()*tamMax);
        }
        
        long tempoFinal = System.currentTimeMillis();
        float tempoTotal = (float)(tempoFinal - tempoInicial) / 60000;
        System.out.printf( "%.5f\n",tempoTotal );
    }
    
    void experimentoC1(){
        long tempoInicial = System.currentTimeMillis(); 
        for (long i = 0; i < tamMax; i++){
            numsLink.add(Math.random()*tamMax);
        }
        for (long i = 0; i < 10000000; i++){
            numsLink.get((int) (Math.random() * tamMax));
        }
        
        long tempoFinal = System.currentTimeMillis();
        float tempoTotal = (float)(tempoFinal - tempoInicial) / 60000;
        System.out.printf( "%.5f\n",tempoTotal );
    }
    
    void experimentoC2(){
        HashSet hs = new HashSet();
        while(hs.size() < tamMax/10){
            int numAleat = (int)(Math.random()*tamMax);
            hs.add(numAleat);   
        }
        
        Iterator it = hs.iterator();
        
        long tempoInicial = System.currentTimeMillis();
        
        for (long i = 0; i < tamMax/10; i++){
            numsLink.remove(it.next());
        }
        
        for (long i = 0; i < tamMax/10; i++){
            numsLink.add(Math.random()*tamMax);
        }
        
        long tempoFinal = System.currentTimeMillis();
        float tempoTotal = (float)(tempoFinal - tempoInicial) / 60000;
        System.out.printf( "%.5f\n",tempoTotal );
    }
}
