/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

/**
 *
 * @author jacQu
 */
public interface QueueADT<T>{
    //añade un elemento al final de la cola
    public void enqueue(T element);
    //elimina un elemento del principio de la cola
    public T dequeue();
    //Examina el elemento situado al principio de la cola
    public T first();
    //Determina si la cola esta vacia
    public boolean isEmpty();
    //Determina el numero de elementos que hay en la cola
    public int Size();
    //Devuelve una representacion de la cola en forma de cadena
    public String ToString ();
    
    
}
