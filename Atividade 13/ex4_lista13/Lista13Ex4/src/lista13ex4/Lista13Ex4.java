/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista13ex4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Pedro
 */
public class Lista13Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamanhoG = (int) Math.pow(10, 5);
        
        ArrayList<Double> arrayList = new ArrayList();
        HashSet<Double> hashSet = new HashSet();
        LinkedList<Double> linkedList = new LinkedList();
        
        long tempoInicial, tempoFinal, tempoTotal=0;        
        
        double num;
        for (int i=0; i < tamanhoG; i++){
            num = Math.random();
            arrayList.add(num);
            hashSet.add(num);
            linkedList.add(num);
        }
        
        System.out.println("----------ArrayList----------");
        
        //Varredura: ArrayList
        tempoInicial = System.currentTimeMillis();
        for (int i=0; i < tamanhoG; i++)
          //  System.out.println(arrayList.get(i));
            arrayList.get(i);        
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de varredura (ArrayList): " + (tempoFinal-tempoInicial)/1000 + "s" );
        tempoTotal += (tempoFinal-tempoInicial);
        
        //Busca: ArrayList
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < tamanhoG/2; i++)
            arrayList.contains( /*(int)*/ (Math.random()*arrayList.size()));
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de busca (ArrayList): " + (tempoFinal - tempoInicial)/1000 + "s");
        tempoTotal += (tempoFinal-tempoInicial);
        
        //Remocao: ArrayList
        tempoInicial = System.currentTimeMillis();
        for (Iterator<Double> it = arrayList.iterator(); it.hasNext();) {  
            Double numero = it.next();
            it.remove();
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de remoção (ArrayList): " + (tempoFinal - tempoInicial)/1000 + "s");
        tempoTotal += (tempoFinal-tempoInicial);        
        
        System.out.println("Tempo total (ArrayList): " + tempoTotal/1000 + "s");
        tempoTotal = 0;
        
        System.out.println();
        System.out.println("----------HashSet----------: ");
        
        //Varredura: HashSet
        tempoInicial = System.currentTimeMillis();
        for( Double numero: hashSet);      
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de varredura (HashSet): " + (tempoFinal-tempoInicial)/1000 + "s" );
        tempoTotal += (tempoFinal-tempoInicial);
        
        //Busca: HashSet
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < tamanhoG; i++)
            hashSet.contains( /*(int)*/ (Math.random()*hashSet.size()));
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de busca (HashSet): " + (tempoFinal - tempoInicial)/1000 + "s");
        tempoTotal += (tempoFinal-tempoInicial);
        
        //Remocao: HashSet
        tempoInicial = System.currentTimeMillis();
        for (Iterator<Double> it = hashSet.iterator(); it.hasNext();) {  
            Double numero = it.next();
            it.remove();
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de remoção (HashSet): " + (tempoFinal - tempoInicial)/1000 + "s");
        tempoTotal += (tempoFinal-tempoInicial);
        
        System.out.println("Tempo total (HashSet): " + tempoTotal/1000 + "s");
        tempoTotal = 0;
        
        System.out.println();
        System.out.println("----------LinkedList----------: ");
        
        //Varredura: LinkedList
        tempoInicial = System.currentTimeMillis();
        for (int i=0; i < tamanhoG; i++)
            linkedList.get(i);        
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de varredura (LinkedList): " + (tempoFinal-tempoInicial)/1000 + "s");
        tempoTotal += (tempoFinal-tempoInicial);
        
        //Busca: LinkedList
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < tamanhoG; i++)
            linkedList.contains( /*(int)*/ (Math.random()*linkedList.size()));
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de busca (LinkedList): " + (tempoFinal - tempoInicial)/1000 + "s");
        tempoTotal += (tempoFinal-tempoInicial);
        
        //Remocao: LinkedList
        tempoInicial = System.currentTimeMillis();
        for (Iterator<Double> it = linkedList.iterator(); it.hasNext();) {  
            Double numero = it.next();
            it.remove();
        }
        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de remoção (LinkedList): " + (tempoFinal - tempoInicial)/1000 + "s");
        tempoTotal += (tempoFinal-tempoInicial);
        
        System.out.println("Tempo total (LinkedList): " + tempoTotal/1000 + "s");
        tempoTotal = 0;
    }
    
}
