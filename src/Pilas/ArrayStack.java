/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author jacQu
 */
public class ArrayStack<T> implements StackADT<T>{
    private T[] array;
    private int count;
    int maxsize;
 
    public ArrayStack(int n ){
      maxsize=n;
      array =(T[]) new Object[n]; 
       count=0;
    }
    
    @Override
    public void Push(T element) {
       if( count<maxsize){
              array[ count]= element;
             count++;
       }   
    }

    @Override
    public T Pop() {
          T temp = array[ count-1];
          array[ count-1]= null;
           count--;
      
      return temp;
    }

    @Override
    public T Peek() {
        if( count>0){
            return array[ count-1];
        }else{
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
       if( count==0){
           return true;
       }else{
           return false;
       }
    }

    @Override
    public int size() {
        return count;
    }

    
    
}
