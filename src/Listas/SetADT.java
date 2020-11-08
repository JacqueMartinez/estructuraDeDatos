/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.Iterator;

/**
 *
 * @author jacQu
 */
public interface SetADT<T> {
    public void add(T element);
    public void addAll(SetADT<T> set);
    public T RemoveRandom();
    public T Remove (T elemento);
    public SetADT<T> union (SetADT<T> set);
    public boolean contains(T target);
    public boolean equals(SetADT<T> set);
    public boolean isEmpty();
    public int size();
    public Iterator<T> iterator();
    public String toString();
}
