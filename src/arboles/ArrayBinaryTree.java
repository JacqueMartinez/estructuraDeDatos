/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author jacQu
 */
public class ArrayBinaryTree<T> implements BInaryTreeADT<T>{
    protected Object[][] tree = new Object[5][5];
    private int count;
    int n;

    public ArrayBinaryTree(){
       n=0;
    }
    public ArrayBinaryTree(T element,T right ,T left){
        n=0;
        tree[0][0] = element;
        count ++;
        tree[1][0] = "B"; 
        count ++;
        tree[2][0] = "C"; 
        count ++;
        tree[0][2*n+1] = left; 
        count ++;
        tree[0][2*(n+1)] = right;
        count ++;
    }
    
    @Override
    public void removeLeftSubstree() {
        if (tree[2*n+1][0] != null) {
            tree[2*n+1][0]=null;
        }
    }
    
    @Override
    public void removeRightSubstree() {
        if (tree[2*(n+1)][0] != null) {
            tree[2*(n+1)][0]=null;
        }
    }
   

    @Override
    public void removeAllElements() {
        for (int i = 0; i < tree.length; i++) {
            for (int j = 0; j < tree[0].length; j++) {
               tree[i][j]=null; 
            }  
        }
    }

    @Override
    public boolean isEmpty() {
        return count==0;
    }

    @Override
    public int size() {
        return count;
    }

   
    public boolean contains(T element) {
        boolean found = false;
        count=0;
        for (int i = 0; i < tree.length; i++) {
            for (int j = 0; j < tree[0].length; i++) {
                if(tree[i][j] != element) {
                    found=true;
                } 
            }
        }
        return found;
    }

    @Override
    public T find(T element) {
        T temp =null;
        boolean found = false;
        for (int i = 0; i < tree.length; i++) {
            for (int j = 0; j < tree[0].length; j++) {
               if (element.equals(tree[i][j])) {
                   temp = (T) tree[i][j];
                   System.out.println(true);
               }
            }
        }
        return temp;
    }
    
     
    @Override
    public Iterator<T> iteratorInOrder() {
       ArrayList<T> templist = new ArrayList<>();
       inorder(0, templist);
       return templist.iterator();
    }
    
     public void inorder(int Array, ArrayList templist){ 
        
        if(Array < tree.length){
            if (tree[Array][0]!= null) {
            inorder(2*(Array+1), templist); //izquierdo
            templist.add(tree[Array][0]);
            inorder(2*Array + 1, templist);
            templist.add(tree[0][Array]);
            
            }
        }
    }

    @Override
    public Iterator<T> iteratorPreOrder() {
       ArrayList<T> templist = new ArrayList<>();
       Preorder(0, templist);
       return templist.iterator(); 
    }
    
     public void Preorder(int Array, ArrayList templist){ 
        if(Array < tree.length){
            if (tree[Array][0]!= null) {
            templist.add(tree[Array][Array]);
            inorder(2*(Array+1), templist); //Izquierdo
            inorder(2*Array + 1, templist); //derecho
             
//            templist.add(tree[0][Array]);
            }
        }
    }
    
    

    @Override
    public Iterator<T> iteratorPosOrder() {
       ArrayList<T> templist = new ArrayList<>();
        Posorder(0, templist);
       return templist.iterator();  
    }
    
    public void Posorder(int Array, ArrayList templist){ 
        if(Array < tree.length){
            if (tree[Array][0]!= null) {
            inorder(2*(Array+1), templist);
            inorder(2*Array + 1, templist);
            templist.add(tree[Array][Array]);
            }
        }
    }

    
    @Override
    public Iterator<T> iteratorLevelOrder(){
        ArrayList<T> templist = new ArrayList<T>();
        for (int i = 0; i < tree.length; i++) {
            for (int j = 0; j < tree[0].length; j++) {
                if (tree[j][i] != null) {
                   templist.add((T) tree[j][i]);  
                } 
            }
        }
        return templist.iterator();
    }
    
}
