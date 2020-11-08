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
public class LinkedQueue<T> implements QueueADT<T> {

    private LinearNode<T> rear;
    private LinearNode<T> front;
    private int count;

    public LinkedQueue() {
        rear = null;// apunra al ultimo elemento que se va agregando al nodo
        count = 0;//siempre apunta al primer elemento agregado
        front = rear;
    }

    @Override
    public void enqueue(T element) {
        LinearNode<T> node = new LinearNode<>(element);
        if (isEmpty()) {
            front = node;
        } else {
            rear.setNext(node);
        }
        rear = node;
        count++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T result = front.getElement();
        front = front.getNext();
        count--;
        if(isEmpty()){
            rear=null;
        }
        return result;
    }

    @Override
    public T first() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T result = front.getElement();
        return result;
    }

    @Override
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int Size() {
        return count;
    }

    @Override
    public String ToString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
