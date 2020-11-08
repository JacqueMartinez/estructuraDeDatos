/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayBinaryTree;

import java.util.Iterator;

/**
 *
 * @author jacQu
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
      ArrayBinarySearchTree arbol = new ArrayBinarySearchTree();
      arbol.addElement("juan");
      arbol.addElement("mario");
      arbol.addElement("alan");
      arbol.addElement("crus");
        
        
        Iterator a = arbol.iteratorInOrder();
        while (a.hasNext()) {            
            System.out.println( a.next());
        }
       
    }
    
}
