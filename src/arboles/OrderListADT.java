/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author jacQu
 */
public interface OrderListADT<T> {
    //Añade un elemento a la lista
    public void Add(T element);
    //Remueve el prime elemento de la lista
    public T removeFirst();
    //Remueve el ltimo elemento de la lista
    public T removeLast();
    //Remuve elemento concreto de la lista
    public T remove(T element);
    //Examina el primer elemento de la lista
    public T First();
    //Examina el ultimo elemento de la lista
    public T Last();
    //Busca un elemento y verifica si lo tiene
    public boolean contains(T element);
    //Si esta vacia la lista
    public boolean isEmpty();
    public int size();
  
       
    
    
}
