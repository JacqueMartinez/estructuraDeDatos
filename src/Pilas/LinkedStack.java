/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import java.util.EmptyStackException;

/**
 *
 * @author jacQu
 */
//Pila enlaces    public void Push(T element) {

public class LinkedStack<T> implements StackADT<T>{
    
    private LinearNode<T> top;
    private int count;
    
    public LinkedStack (){
        top=null;
        count=0;
    }
    @Override
    public void Push(T element) {
        LinearNode<T> temp = new LinearNode<>(element);
        temp.setNext(top);
        top=temp;
        count++;
        
    }

    @Override
    //Elimina un elemento de la parte superior de la pila
    public T Pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T result = top.getElement();
        top= top.getNext();
        count--;
        return result;
    }

    @Override
    // Examina el elemento situado en la parte superior de la pila
    public T Peek() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T result = top.getElement();
        
        return result;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public int size() {
       return count;
    }
    public String toString(){
        String result="";
        LinearNode aux = top ;
        for (int i = 0; i < size(); i++) {
            String aux2 = (String) aux.getElement();
            result = result + "\n" +(aux2);
            aux = aux.getNext();

        }
        return result;
    }
}