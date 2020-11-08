/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.ArrayList;
import java.util.Iterator;
import Colas.*;
import java.util.Arrays;
/**
 *
 * @author jacQu
 */
public class LinkedBinaryTree<T> implements BInaryTreeADT<T>{
    protected int count;
    
    protected BinaryTreeNode<T> root;
    
    public LinkedBinaryTree(){
        count=0;
        root=null;
    }
    public LinkedBinaryTree(T element){
        count=1;
        root = new BinaryTreeNode(element);
    }   
    public LinkedBinaryTree(T element, LinkedBinaryTree<T> leftSubtree,
            LinkedBinaryTree rightSubstree){
        
        root= new BinaryTreeNode<T>(element);
        count= 1 ;
        if(leftSubtree != null){
            count = count + leftSubtree.size();
            root.left= leftSubtree.root;
        }else
        {
            root.left = null;
        }
        if(rightSubstree != null){
            count = count + rightSubstree.size();
            root.right = rightSubstree.root;
        }else{
            root.right= null;
        }       
    }
    
    @Override
    public void removeLeftSubstree() {
        if(root.left != null){
            count= count - root.left.numChildren();
            root.left= null;
        }
    }
    @Override
    //*
    public void removeRightSubstree() {
        if(root.right != null){
            count= count - root.right.numChildren();
            root.right= null;
        }
    }

    @Override
    ///*
    public void removeAllElements() {
        if(root.right != null && root.left!= null){
            count= count - root.right.numChildren()- root.left.numChildren();
            root.right= null;
            root.left= null;
        }
    }

    @Override
    public boolean isEmpty() {
       return count==0;
       
    }

    @Override
    //*
    public int size() {
//        int children=0;
//        if(root.left!= null){
//            children =children+ 1+ root.left.numChildren();
//        }
//        if(root.right != null){
//            children =children+ 1 +root.right.numChildren();
//        }
//        return children;
           return count;
    }

    @Override
    //*
    //Determina si un elemento esta dentro del arbol
    public boolean contains(T element){
//        BinaryTreeNode<T> current= findagain(element,root);
//        if(current == null){
//            return false;
//        }
//        return true;
        try {
           return  find(element) != null;
            
        } catch (Exception e) {
            return false;
        }

    }

    @Override
    
     //Devuelve el elemento si lo encuentra
    public T find(T element) throws NullPointerException{
        BinaryTreeNode<T> current= findagain(element,root);
        System.out.println(element);
        if(current == null){
            throw new NullPointerException("binarytree");
        }
        return (current.element);
    }
    
    private BinaryTreeNode<T> findagain(T element, BinaryTreeNode<T> next){
        if(next== null){
            return null; //no tiene hijos
        }
        if(next.element.equals(element)){
            return  next;
        }
        BinaryTreeNode<T> temp=findagain(element, next.left);
        if(temp == null){
            temp= findagain(element, next.right);
        }
        return temp;
    }

    @Override
    public Iterator<T> iteratorInOrder() {// en arbol
        ArrayList<T> templist = new ArrayList<>();
        inorder(root,templist);
        return templist.iterator();
    }
    
    public void inorder(BinaryTreeNode<T> node,ArrayList<T> templist){
        if(node !=null){
            inorder(node.left, templist);
            templist.add(node.element);
            inorder(node.right, templist);
        }
    }
    
    @Override
    public Iterator<T> iteratorPreOrder() { //descendente
        ArrayList<T> temList = new ArrayList<>();
        preorder(root,temList);
        return temList.iterator();
    }
    private void preorder(BinaryTreeNode<T> node,ArrayList<T> temList){
        if(node!= null){
            temList.add(node.element);
            preorder(node.left, temList);
            preorder(node.right, temList);
     
        }
    }

    @Override
    public Iterator<T> iteratorPosOrder() {//ascendente
        ArrayList<T> temList = new ArrayList<>();
        postorder(root,temList);
        return temList.iterator();
    }
    private void postorder(BinaryTreeNode<T> node,ArrayList<T> templist){
        if(node!= null){
             postorder(node.left, templist);
             postorder(node.right, templist);
             templist.add(node.element); 
        }
    }
    
    @Override
    public Iterator<T> iteratorLevelOrder() {
        ArrayQueue<BinaryTreeNode> nodos = new ArrayQueue<>();
        ArrayList<T> resultados = new ArrayList<>();;
        nodos.enqueue(root);
        
        while (nodos.isEmpty()) {   
            root = (BinaryTreeNode<T>) nodos.first();
            nodos.dequeue();
                 if(root != null ){
                     resultados.add(root.element);
                     nodos.enqueue(root.left);
                     nodos.enqueue(root.right);
              }
        }
        return resultados.iterator();
        //Iterator < T >)
    }  
   

}   
    


