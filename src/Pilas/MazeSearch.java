/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author jacQu
 */
public class MazeSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Maze maze= new Maze();
        System.out.println(maze);
        if(maze.traverse()){
            System.out.println("Terminado");
        }else{
            System.out.println("No se puede terminar");
        }
        System.out.println(maze);
    

//        LinkedStack linked = new LinkedStack();
//        
//        
//        linked.Push("juan");
//        linked.Push("maria");
//        linked.Push("pablo");
//        linked.Push("luis");
//        
//        //Devuelve el nodo
//        System.out.println(linked.toString());
//        System.out.println("----------------");
//        //Devuelve si se encuentra vacio
//        System.out.println(linked.isEmpty());
//        System.out.println("----------------");
//        //Devuelve el tamaño 
//        System.out.println(linked.size());
//        System.out.println("----------------");
//        //Elimina al primero de la lista
//        System.out.println(linked.Pop());
//        System.out.println("----------------");
//        //Examina al primero de la lista
//        System.out.println(linked.Peek());
//        System.out.println("----------------");
//        //Devuelve el nodo modificado
//        System.out.println(linked.toString());
       
      
//       ArraySet array = new ArraySet(3);
//       array.Push("juan");
//       array.Push("maria");
//       array.Push("juan");
//       
//        System.out.println(array.isEmpty());
//        System.out.println(array.size());
//        System.out.println(array.Peek());
//        System.out.println(array.Pop());
//        System.out.println(array.Peek());
    }

}
