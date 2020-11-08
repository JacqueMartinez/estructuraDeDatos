/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.Iterator;

/**
 *
 * @author jacQu
 */
public interface BInaryTreeADT<T> {
    public void removeLeftSubstree();
    public void removeRightSubstree();
    public void removeAllElements();
    public boolean isEmpty();
    public int size();
    //Determina si un elemento esta dentro del arbol
    public boolean contains(T element);
    //Devuelve el elemento si lo encuentra
    public T find(T element);
    public String toString();
    public Iterator<T> iteratorInOrder();//en arbol
    public Iterator<T> iteratorPreOrder();//descendente
    public Iterator<T> iteratorPosOrder();//ascendente
    public Iterator<T> iteratorLevelOrder();//por niveles


        

    
    
    
}
