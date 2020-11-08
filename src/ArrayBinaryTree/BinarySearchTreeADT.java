/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayBinaryTree;

import arboles.*;

/**
 *
 * @author jacQu
 */
public interface BinarySearchTreeADT<T> extends BInaryTreeADT<T>{
    
    public void addElement (T element);
    public T removeElement (T element);
    //Remueve elementos repetidos
    public void removeAllOcurrences (T element);
    //remueve el elemento minimo del arbol
    public T removeMin();
     //remueve el elemento maximo del arbol
    public T removeMax();
     //busca el elemento minimo del arbol
    public T finMin();
    //busca el elemento maximo del arbol
    public T finMax();
}
