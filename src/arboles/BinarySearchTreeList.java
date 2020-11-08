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
public class BinarySearchTreeList<T> extends LinkedBinarySearchTree<T> implements OrderListADT<T>{
    
    
    public BinarySearchTreeList() {
        super();
    }
    
    @Override
    public void Add(T element) {
         addElement (element);
    }

    @Override
    public T removeFirst() {
        return removeMin ();
    }

    @Override
    public T removeLast() {
       return removeMax();
    }

    @Override
    public T remove(T element) {
        return removeElement(element);
    }

    @Override
    public T First() {
        return finMin();
    }
    @Override
    public T Last() {
        return finMax();
    }
    
    
    
    
    /* agregado*/
     public Iterator<T> iterator()
   {
      return iteratorInOrder();
   }
}
