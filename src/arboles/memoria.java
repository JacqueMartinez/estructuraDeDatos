/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.Scanner;

/**
 *
 * @author jacQu
 */
public class memoria {
//    private BinaryTreeNode<String> raiz;
//    private Scanner leer= new Scanner(System.in);
//   
//    public boolean si(String pregunta){
//        System.out.println(pregunta);
//        String resp = leer.nextLine();
//        return "si".equals(resp.toLowerCase());
//    }
//    public void ejecutar(String firstAnimal){
//        boolean bucle = true;
//        raiz = new BinaryTreeNode<String> (firstAnimal);
//        while (bucle) {            
//            if(!si("Estas pensando en un animal?")){
//                break;
//            }
//            BinaryTreeNode<String> arbol = raiz;            
//            while (arbol.left !=null) {                
//                if(si(arbol.element+ " ?")){
//                    arbol = arbol.left;
//                }else{
//                    arbol = arbol.right;
//                }
//            }          
//            //Adivinar (person)
//            String animal = arbol.element;
//            if(si("Es un"+ animal + " ?")){
//                System.out.println("Adivine!!");
//                continue;
//            }
//            //Obtenemos nueva informacion
//            System.out.println("Que animal era?");
//            String nuevo = leer.nextLine();
//            System.out.println("Que diferencia a un " + animal +  " de un " + nuevo + "?" );
//            String info= leer.nextLine();
//            String indicador = "Si el animal fuera un " + animal + " este tendria " + info + "?";
//            arbol.element= info;
//            if(si(indicador)){
//                arbol.left = new BinaryTreeNode<String> (animal);
//                arbol.right = new BinaryTreeNode<String> (nuevo);
//            }else{
//                arbol.right = new BinaryTreeNode<String> (animal);
//                arbol.left = new BinaryTreeNode<String> (nuevo);
//            }
//            
//            
//        }
//    }
    
    
    private BinaryTreeNode<String> raiz;
    private Scanner leer = new Scanner(System.in);

    public boolean si(String pregunta) {
        System.err.println(pregunta);
        String resp = leer.nextLine();
        return "si".equals(resp.toLowerCase());
    }

    public void ejecutar(String firstAnimal) {
        boolean bucle = true;
        raiz = new BinaryTreeNode<String>(firstAnimal);
        while (bucle) {
            if (!si("Estas pensando en un animal ?")) {
                break;
            }
            BinaryTreeNode<String> arbol = raiz;
            while (arbol.left != null) {
                if (si(arbol.element + "? ")) {
                    arbol = arbol.left;
                } else {
                    arbol = arbol.right;
                }
            }
            //adivina el animal
            String animal = arbol.element;
            if (si("es un  " + animal + "? ")) {
                System.out.println("Adivine");
                continue;
            }
            //obtenemos nueva informacion
            System.err.println("Que animal era? ");
            String nuevo = leer.nextLine();
            System.err.println("Que diferencia hay entre un " + animal + " y un " + nuevo + " ?");
            String info = leer.nextLine();
            String indicador = "Si el animal fuera un " + animal + " este " + info + "?";
            arbol.element = info; // El animal es remplazado por la informacion 
            if (si(indicador)) {
                arbol.left = new BinaryTreeNode<String>(animal);
                arbol.right = new BinaryTreeNode<String>(nuevo);
            } else {
                arbol.right = new BinaryTreeNode<String>(animal);
                arbol.left = new BinaryTreeNode<String>(nuevo);
            }
        }

    }
}
