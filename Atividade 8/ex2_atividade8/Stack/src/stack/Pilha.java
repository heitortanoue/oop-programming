/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author 12547260
 */
public class Pilha {
    private int size;
    private int index;
    private int[] data;
    
    public Pilha (int n_size) {
        this.size = n_size;
        this.data = new int[n_size];
        this.index = -1;
    }
    
    public void push (int i) throws PilhaCheia {
        if (this.isFull()) {
            throw new PilhaCheia();
        }
        this.index++;
        this.data[this.index] = i;
    }
    
    
    public int pull () throws PilhaVazia {
        if (this.isEmpty()) {
            throw new PilhaVazia();
        }
        int returnValue = this.data[this.index];
        this.index--;
        
        return returnValue;
    }
    
    public int getSize () {
        return this.index + 1;
    }
    
    public void setMaxSize (int n_size) {
        this.size = n_size;
    }
    
    public int getMaxSize () {
        return this.size;
    }
    
    public boolean isFull() {
        return (this.index + 1 >= this.size);
    }
    
    public boolean isEmpty() {
        return (this.index == -1);
    }
}
