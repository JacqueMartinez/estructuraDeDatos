/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenamientoBusqueda;
/**
 *
 * @author jacQu
 */
public class BinariaSearch<T extends Comparable>{
    //******************************//
   //BUSQUEDA BINARIA SIN COMPARETO //
    public int busquedaBinaria(int arreglo[],int elemento){ //Se pasa el arreglo y el numero  a buscar
        int centro,inicio,ultimo,valor; //variables 
        inicio=0; //inicializar
        ultimo=arreglo.length-1; //menos 1, ya que empieza en 0
        while(inicio<=ultimo){
            centro =(inicio + ultimo)/2;// encontrar el centro
            valor =arreglo[centro]; //el valor=centro;
//            System.out.println("comparando a" + elemento+
//                    "con"+ arreglo[centro]);
            if(elemento==valor){
                return centro; // Si el valor buscado es el centro, se retornara 
            }else if(elemento<valor){
                ultimo=centro-1; //Verifciar el lado izquierdo, el ultimo pasa a ser centro -1 asi la lista
                                 //quedaria a la mitad 0 --- 5-1 entonces el arreglo restarnte es de 0-4
            }else{
                inicio=centro+1;//Verificar el lado derecho, el inicio ya no seria 1 sino el centro + 1 para 
                                //comenzar una nueva lista a verificar.
            }
            
        }
        return -1;//en caso de que no se encuentre
    }
    
    //*************************************//
    //BUSQUEDA BINARIA CON COMPARETO//
    public int busquedaBinaria2(T[]arreglo,int elemento){ //Se pasa el arreglo y el numero  a buscar
        int centro,inicio,ultimo,valor; //variables 
        inicio=0; //inicializar
        ultimo=arreglo.length-1; //menos 1, ya que empieza en 0
        while(inicio<=ultimo){
            centro =(inicio + ultimo)/2;// encontrar el centro
           
//            System.out.println("comparando a" + elemento+
//                    "con"+ arreglo[centro]);
            if(arreglo[centro].equals(elemento)){
                return centro; // Si el valor buscado es el centro, se retornara 
            }else if(arreglo[centro].compareTo(centro)>elemento ){
                ultimo=centro-1; //Verifciar el lado izquierdo, el ultimo pasa a ser centro -1 asi la lista
                                 //quedaria a la mitad 0 --- 5-1 entonces el arreglo restarnte es de 0-4
            }else{
                inicio=centro+1;//Verificar el lado derecho, el inicio ya no seria 1 sino el centro + 1 para 
                                //comenzar una nueva lista a verificar.
            }
            
        }
        return -1;//en caso de que no se encuentre
    }
   


    
}
