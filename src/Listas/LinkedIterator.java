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
public class LinkedIterator<T> implements Iterator<T>{
    
    private int count;
    private LinearNode<T> current;

    public LinkedIterator(int size, LinearNode<T> collection) {
        this.count = size;
        this.current = collection;
    }
    
    @Override
    public boolean hasNext() {
        return (current !=null) ;
   }

    @Override
    public T next() {
        if(!hasNext()){
            throw new NoSuchElementException();         
        }
        T result = current.getElement();
        current = current.getNext();
        return result;
    }
    
}
