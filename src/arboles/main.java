/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author jacQu
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        BinaryTreeNode a = new BinaryTreeNode("A");
//        BinaryTreeNode b = new BinaryTreeNode("B");
//        BinaryTreeNode c = new BinaryTreeNode("C");
//        BinaryTreeNode d = new BinaryTreeNode("D");
//        BinaryTreeNode e = new BinaryTreeNode("E");
//           
//        a.left=b;
//        a.right=c;
//        b.left=d;
//        b.right=e;

//       
//        
//        LinkedBinaryTree D= new LinkedBinaryTree("D"); 
//        LinkedBinaryTree E= new LinkedBinaryTree("E");
//         LinkedBinaryTree B= new LinkedBinaryTree("B",D,E);
//          LinkedBinaryTree C= new LinkedBinaryTree("C");
//        LinkedBinaryTree A= new LinkedBinaryTree("A",B,C);
//
//        Iterator a = A.iteratorLevelOrder();
//        while (a.hasNext()) {            
//            System.out.println( a.next());
//        }
//        System.out.println(A.isEmpty());
//        System.out.println(A.find("E"));
//       memoria a = new memoria();
//       a.ejecutar("perro");
//        LinkedBinarySearchTree A = new LinkedBinarySearchTree();
//
//        A.addElement("juan");
//        A.addElement("maria");
//        A.addElement("paco");
//        A.addElement("sandra");
//        A.addElement("marcos");
//        A.addElement("emanuel");
//        A.addElement("soledad");
//        A.addElement("guadalupe");
//
//        System.out.println(A.removeMin());
//        System.out.println(A.removeMin());
//        System.out.println(A.removeMin());
//        System.out.println(A.removeMin());
//        System.out.println(A.removeMin());
//        System.out.println(A.removeMin());
//        System.out.println(A.removeMin());
//        System.out.println(A.removeMin());
//        Iterator n = A.iteratorInOrder();
//              System.out.println("LevelOrder");
//              //System.out.println(a.size());
//        
//        while (n.hasNext()) {
//            System.out.println(n.next() + " "); 
//        }
//        
//        BinarySearchTreeList S = new BinarySearchTreeList();
//        
//        S.Add(1);
//        S.Add(10);
//        S.Add(30);
//        S.Add(5);        
////      System.out.println(S.contains(1));
//
//         Iterator a = S.iteratorInOrder();
//        while (a.hasNext()) {            
//            System.out.println( a.next());
//        }
//        
        
        
//        System.out.println(S.isEmpty());
//        
//        System.out.println(S.Last());
//        System.out.println(S.remove(1));
//        System.out.println(S.First());
//        System.out.println(S.Last());
//        System.out.println(S.removeFirst());
//        System.out.println(S.removeLast());
//        System.out.println(S.size());



        //PREDETERMINADO,ARBOL INCLUIDO EN JAVA
//        TreeSet<Integer> a1= new TreeSet<>();
//        a1.add(5);
//        a1.add(15);
//        a1.add(25);
//        a1.add(50);
//        a1.add(800);
//        System.out.println(a1.first());
       //cada nodo son llaves y estan enlazados a un valor
       //Al exceder a un nodo hace referencia  a un valor.'
        //TreeMap
          
          
//        LinkedBinaryTree E= new LinkedBinaryTree("E"); 
//        LinkedBinaryTree F= new LinkedBinaryTree("F");
//         LinkedBinaryTree C= new LinkedBinaryTree("C");
//          LinkedBinaryTree D= new LinkedBinaryTree("D",F,null);
//        LinkedBinaryTree B= new LinkedBinaryTree("B",D,E);
//        LinkedBinaryTree A= new LinkedBinaryTree("A",B,C);


/*****************/
//        ArrayBinaryTree g = new ArrayBinaryTree("A","E","D");
//        
//        System.err.println(g.size());
//
//        Iterator z = g.iteratorInOrder();
//        Iterator n = g.iteratorLevelOrder();
//        Iterator zn = g.iteratorPosOrder();
//        Iterator nz = g.iteratorPreOrder();
//        
//        while (z.hasNext()) {
//               z.next();
//        }
//        
//        System.out.println("PosOrder");
//        while (zn.hasNext()) {
//            System.out.println(zn.next() + " "); 
//        }
//        System.out.println("PreOrder");
//        while (nz.hasNext()) {
//            System.out.println(nz.next());
//            
//        }
//          System.out.println("LevelOrder");
//        
//        while (n.hasNext()) {
//            System.out.println(n.next() + " "); 
//        }

      
//---------------------
            ArrayBinarySearchTree a = new ArrayBinarySearchTree();
            a.addElement("juan");
            a.addElement("alan");
            System.out.println(a.size());
            Iterator n = a.iteratorLevelOrder();
              System.out.println("LevelOrder");
              
              //System.out.println(a.size());
        
        while (n.hasNext()) {
            System.out.println(n.next() + " "); 
        }

    }
}
