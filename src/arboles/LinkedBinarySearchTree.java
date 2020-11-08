/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.Iterator;
import org.omg.CosNaming.NamingContextPackage.NotEmpty;

/**
 *
 * @author jacQu
 */
public class LinkedBinarySearchTree<T> extends LinkedBinaryTree<T> implements BinarySearchTreeADT<T> {

    public LinkedBinarySearchTree() {
        super();
    }
    public LinkedBinarySearchTree(T element) {
        super(element);
    }

    @Override
    //Agregar un elemento al arbol
    public void addElement(T element) {
        BinaryTreeNode<T> temp = new BinaryTreeNode<>(element);
        Comparable<T> comparableElement = (Comparable<T> )element;
        if(isEmpty()){
            root = temp;
        }else{
            BinaryTreeNode<T> current = root;
            boolean added = false;
            while (!added) {                
                if (comparableElement.compareTo(current.element)<0) {
                    if (current.left==null) {
                        current.left=temp;
                        added=true;
                    }else{
                        current = current.left;
                    }
                }else{
                    if (current.right== null) {
                        current.right=temp;
                        added = true;
                    }else{
                        current = current.right;
                    }
                }
            }
        }
        count ++;
    }

    @Override
    //Elimina el primer elemento que coincide con el objetivo especificado
    public T removeElement(T element) {
         T result = null;
         if(!isEmpty()){
             if (((Comparable)element).equals(root.element)){
                 result = root.element;
                 root = replacement(root);
                 count --;
             }else{
                 BinaryTreeNode<T> current, parent= root;
                 boolean found = false;
                 if(((Comparable)element).compareTo(root.element)<0){
                     current = root.left;
                 }else{
                     current = root.right;
                 }
                 while (current != null && found) {                     
                     if(element.equals(current.element)){
                         found = true;
                         count--;
                         result = current.element;
                         if (current==parent.left) {
                             parent.left = replacement(current);
                         }else{
                             parent.right =replacement(current);
                         }
                     }else{
                         parent = current;
                         if(((Comparable)element).compareTo(current.element)<0){
                             current = current.left;
                         }else{
                             current = current.right;                                  
                         }
                     }
                 }
                 if(!found){
                     throw  new NullPointerException("binary tree");
                 }
             }
         }
         return result;
    }
    //Devuelve una referencia a un nodo que reemplazará al especificado para la eliminación.
    //En el caso donde el nodo eliminado tiene dos hijos, el sucesor inorder se utiliza como su reemplazo.
    protected BinaryTreeNode<T> replacement(BinaryTreeNode<T> node){
        BinaryTreeNode<T> result = null;
        if ((node.left==null) && (node.right==null))  {
            result=null;
        }else if((node.left !=null) && (node.right==null)){
            result= node.left;
        }else if ((node.left==null) && (node.right !=null)){
            result = node.right;
        }else { BinaryTreeNode<T> current = node.right;
            BinaryTreeNode<T> parent = node;
            while (current.left !=null) {                
                parent = current;
                current = current.left;  
            }
            if(node.right==current){
                current.left = node.left;
            }else{
                parent.left = current.right;
                current.right = node.right;
                current.left = node.left;
            }
            result = current;
         }
        return result;
    }

    @Override
    
    public void removeAllOcurrences(T element)  {
        try {
//            removeElement(element);
        while (contains(element)) {            
            removeElement(element);
        }
        } catch (Exception ElementNotFoundException) {
        }
        
    }

    @Override
    public T removeMin() {
       

      if (isEmpty()){
           throw  new NullPointerException("binary tree");
      }
         T result ;
         if (root.left == null) 
         {
            result = root.element;
            root = root.right;
         } //if
         else 
         {
            BinaryTreeNode<T> parent = root;
            BinaryTreeNode<T> current = root.left;
            while (current.left != null) 
            {
               parent = current;
               current = current.left;
            } //while
             if (current.right!= null) {
                  result =  current.element;
                parent.left = current.right;
             }else{
                 result = current.element;
                 parent.left=null;
             }
           
         } 

         count--;
       
 
      return result;
    }

    @Override
    public T removeMax() {
        T result = null;

      if (isEmpty())
            throw  new NullPointerException("binary tree");
      else 
      {
         if (root.right == null) 
         {
            result =  root.element;
            root = root.left;
         } //if
         else 
         {
              BinaryTreeNode<T> parent = root;
              BinaryTreeNode<T> current = root.right;

              while (current.right != null) 
              {
                 parent = current;
                 current = current.right;
              } //while

              result =  current.element;
              parent.right = current.left;
           } //else

         count--;
      } //else

      return result;
    }

    @Override
    //Devuelve el elemento con el menor valor en el árbol de búsqueda binario.
    //No elimina el nodo del árbol de búsqueda binario.
    public T finMin() {
         T result = null;

      if (isEmpty())
            throw  new NullPointerException("binary tree");
      else 
      {
         BinaryTreeNode<T> current = root;
        
         while (current.left != null)
            current = current.left;
       
         result = current.element;
      } //else

      return result;
    }

    @Override
    //Devuelve el elemento con el valor más alto en el árbol de búsqueda binario.
     //No elimina el nodo del árbol de búsqueda binario.
    public T finMax() {
       T result = null;

      if (isEmpty())
             System.out.println("vacio");
      else 
      {
         BinaryTreeNode<T> current = root;
      
         while (current.right != null)
            current = current.right;

        result = current.element;
      } //else
 
      return result;
    }
    private void ordenar_arbol(T temp ){
        LinkedBinarySearchTree<T> arbol = new LinkedBinarySearchTree<>(temp);
        Integer [] arreglo = new Integer[size()];
        Iterator a = arbol.iteratorInOrder();
        while (a.hasNext()) {            
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i]= Integer.parseInt(a.next().toString());
            }
        }
        
//
//
//        it = interatorinorder();
//        while (it) {            
//            matriz[a]= it.next ();
//        }
//        raiz = matriz.lenght/2
//        linkedbinaryserchtreearbol.addelement(matriz[raiz]);
//        //agregar a linkedbinary los demas
//        //de la matriz
//        //remplazar el arbola actual por linkedbinary 
//        */
        
    }
    

}
