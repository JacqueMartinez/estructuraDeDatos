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
public interface StackADT<T> {
    //Añade un elemento a la parte superior de la pila
    public void Push(T element);
    //Elimina un elemento de la parte superior de la pila
    public T Pop();
    //Examina el elemento situado en la parte superior de la pila
    public T Peek();
    //Examina que se encuentre vacio
    public boolean isEmpty();
    //Devuelve el tamañp 
    public int size();
    //Devuelve la informacion
    public String toString();
    
    
        
    
}
