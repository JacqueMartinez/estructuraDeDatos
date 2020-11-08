/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

import java.util.EmptyStackException;

/**
 *
 * @author jacQu
 */
public class ArrayQueue<T> implements QueueADT<T> {
    
    private T[] queue;
    private int rear;
    private final int DEFAULT_CAPACITY = 100;

    public ArrayQueue() {
        rear = 0;
        queue = (T[]) new Object[DEFAULT_CAPACITY];
    }

    // //añade un elemento al final de la cola
    @Override
    public void enqueue(T element) {
        if (Size() == queue.length) {
            expandCapacity();
        }
        queue[rear] = element;
        rear++;
    }

    private void expandCapacity() {
        T[] large = (T[]) (new Object[queue.length * 2]);
        for (int i = 0; i < queue.length; i++) {
            large[i] = queue[i];
        }
        queue = large;
    }

    //elimina un elemento del principio de la cola
    @Override
    public T dequeue() {
        if (!isEmpty()) {
            throw new EmptyStackException();
        }
        T result = queue[0];
        rear--;
        for (int scan = 0; scan < rear; scan++) {
            queue[scan] = queue[scan + 1];
        }
        queue[rear] = null;
        return result;
    }
    //Examina el elemento situado al principio de la cola

    @Override
    public T first() {
        if (!isEmpty()) {
            throw new EmptyStackException();
        }
        T result = queue[0];

        return result;
    }

    //Determina si la cola esta vacia
    @Override
    public boolean isEmpty() {
        if (Size() == 0) {
            return false;
        } else {
            return true;
        }
    }
    //Determina el numero de elementos que hay en la cola

    @Override
    public int Size() {
        return rear;
    }
    //Devuelve una representacion de la cola en forma de cadena

    @Override
    public String ToString() {
        String array=" ";
        for (int i = 0; i < Size(); i++) {
            array = array +"\n"+  queue[i];
        }
        return array;
    }
}
