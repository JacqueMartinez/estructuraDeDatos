/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import static java.util.concurrent.ThreadLocalRandom.current;

/**
 *
 * @author jacQu
 */
public class ArrayBinarySearchTree<T> extends ArrayBinaryTree<T> implements BinarySearchTreeADT<T>{
   protected int maxIndex;
   protected int count=0;
   int pos;
    public ArrayBinarySearchTree() {
        super(); 
        maxIndex=0;
       
    }
    @Override
   public void addElement(T element) {  

        Comparable<T> tempelement = (Comparable<T>)element;
       if (isEmpty()) {
         tree[0][0] = element;
      } 
      else 
      {
         boolean added = false;
         int currentIndex = 0;
         while (!added) 
         {
            if(tree[pos][0].hashCode() <= element.hashCode()){
               // go left
               if (tree[2*pos+1][0] == null) 
               {
                  tree[maxIndex][0] = element;
                  added = true;
                  if (currentIndex > maxIndex)
                     maxIndex = 2*pos+1;
               }
               else
                  currentIndex = 2*pos+1;
            
                 count ++; 
            }else{
               // go right
               if (tree[(2*(pos+1))][0]== null) 
               {
                  tree[(2*(pos+1))][0] = element;
                  added = true;
                  if ((2*(pos+1)) > maxIndex)
                     maxIndex = (2*(pos+1));
               }
               else
                  currentIndex = (2*(pos+1));
                 count ++;  
            }     
         }
      }
  
      
    }

    @Override
    public T removeElement(T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeAllOcurrences(T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T removeMin() {
         
      T result = null;

      if (isEmpty())
            System.err.println("");
      else 
      {
         int currentIndex = 1;
         int previousIndex = 0;
         while (tree[currentIndex] != null && currentIndex <= tree.length) 
         {
            previousIndex = currentIndex;
            currentIndex = currentIndex * 2 + 1;
         } //while
         result = (T) tree[previousIndex] ;

      } //else

      count--;

      return result;
    }

    @Override
    public T removeMax() {
        T result = null;

      if (isEmpty())
            System.err.println("");
      else 
      {
         int currentIndex = 2;
         int previousIndex = 0;
         while (tree[currentIndex] != null && currentIndex <= maxIndex) 
         {
            previousIndex = currentIndex;
            currentIndex = currentIndex * 2 + 2;
         } //while
         result = (T) tree[previousIndex] ;
      } //else

      count--;

      return result;
    }

    @Override
    public T finMin() {
        T result = null;

      if (isEmpty())
            System.err.println("");
      else {
         int currentIndex = 0;
         while ((currentIndex*2+1 <= maxIndex) && (tree[currentIndex*2+1] != null))
            currentIndex = currentIndex*2+1;
         result = (T) tree[currentIndex] ;
      }
      return result;
    }

    @Override
    public T finMax() {
         T result = null;

      if (isEmpty())
            System.err.println("");
      else {
         int currentIndex = 0;
         while ((currentIndex*2+2 <= maxIndex) && (tree[currentIndex*2+2] != null))
            currentIndex = currentIndex*2+2;
         result = (T) tree[currentIndex] ;
      }
      return result;
    }

    private void replace(int previousIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
