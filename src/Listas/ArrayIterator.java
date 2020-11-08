/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author jacQu
 */
public class ArrayIterator<T> implements Iterator<T>{
    private int count;
    private int current;
    private T[] items;
 
    
   
    public ArrayIterator(T [] collecttion, int size){
        items=collecttion;
        count=size;
        current=0;
    }
    @Override
    public boolean hasNext() { // rcorre el arreglo
        return (current<count);
    }
    @Override
    public T next() { //devuelve el elemento
        if(! hasNext()){
            throw new NoSuchElementException();
            
        }
        current++;
        return items[current-1];
    }
    
}
