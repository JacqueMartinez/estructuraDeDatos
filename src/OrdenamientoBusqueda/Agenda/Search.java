/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenamientoBusqueda.Agenda;

/**
 *
 * @author jacQu
 */
public class Search<T extends Comparable> {
     //*********************************//
    //BUSQUEDA LINEAL ORIGINAL //
    public boolean linearSearch (T[] data,int min,int max, String target){
        int index=min; //posicion del arreglo index=0
        boolean found=false; 
        while (!found && index<= max) { // mientras found = verdadero & index <=3            
            if(data[index].toString().equals(target)){ //si arreglo en la pisicion[index,0].llamdo al metodo
                                                  //target es el alumno que se le esta pasando
                                                  //el retorno viene de la clase alumno
                found=true;             //cuando el retorno devuelva 0 sera verdadero
            }
            index++;//posicion del arreglo
        }
        return found;// retorna falso o verdadero
    
    }
    
    
   //*****************************//
    //BUSQUEDA BINARIA ORIGINAL//
   public boolean binarySearch(T[] data,int min,int max, T target){
       boolean found= false; //variable que dira si es verdadero o falso
       int midpoint= (min+max)/2;// determina la mitad del arreglo
       if(data[midpoint].compareTo(target)==0){
           found = true;
       }else if(data[midpoint].compareTo(target)>0){
           if(min<= midpoint-1){
               found = binarySearch(data, min, midpoint-1, target);
           }
        }else if(midpoint+1<=max){
               found= binarySearch(data, midpoint-1, max, target);
           }
           return found;
       }
   
  //***********************************//
   //Busqueda lineal de arreglo para la clase contact
       public int busqueda(Contact[] arreglo2,String variable){
        int min=0;
        int max= arreglo2.length-1;
          int index=min; //posicion del arreglo index=0
        boolean found=false; 
        while (!found && index<= max) { // mientras found = verdadero & index <=3            
            if(arreglo2[index].getFirstName().equals(variable)){ //si arreglo en la pisicion[index,0].llamdo al metodo
                                                  //target es el alumno que se le esta pasando
                                                  //el retorno viene de la clase alumno
                return index;
                //cuando el retorno devuelva 0 sera verdadero
            }
            index++;//posicion del arreglo
        }
        return 0;
    }
    //*********************************
       //Busqueda binaria para la clase contact 
//        public int busquedaBinaria(Contact[] arreglo2,int min,int max, String variable){
//       boolean found= false; //variable que dira si es verdadero o falso
//       int midpoint= (min+max)/2;// determina la mitad del arreglo
//       if(arreglo2[midpoint].getFirstName().compareTo(variable)==0){
//           found = true;
//           return midpoint;
//       }else if(arreglo2[midpoint].getFirstName().compareTo(variable)>0){
//           if(min<= midpoint-1){
//               midpoint=busquedaBinaria(arreglo2, min, midpoint-1,variable);
//           }
//        }else if(midpoint+1<=max){
//               midpoint=busquedaBinaria(arreglo2, midpoint-1, max, variable);
//           }
//           return midpoint;
//       }
//        
       
       
  public  int busquedaBinaria(Contact[] arreglo2, String variable){
  int centro,primero,ultimo;
  primero=0;
  ultimo=arreglo2.length-1;
   while(primero<=ultimo){
     centro=(primero+ultimo)/2;
   
     if(arreglo2[centro].getFirstName().compareTo(variable)==0){  //arreglo2[centro].getFirstName().compareTo(variable)==0
         return centro;
     }else if(arreglo2[centro].getFirstName().compareTo(variable)>0){ //arreglo2[centro].getFirstName().compareTo(variable
       ultimo=centro-1;
     }else{
         primero=centro+1;
     }
    }
    return -1;
   }
  
     public int binarySearch2(Contact[] arreglo2,int min,int max, String variable){
       boolean found= false; //variable que dira si es verdadero o falso
       int midpoint= (min+max)/2;// determina la mitad del arreglo
       if(arreglo2[midpoint].getFirstName().compareTo(variable)==0){
           return midpoint;
       }else if(arreglo2[midpoint].getFirstName().compareTo(variable)<0){
           if(min<= midpoint-1){
               max=midpoint-1;
              found=true;
           }
        }else if(midpoint+1<=max){
            min=midpoint+1;
               found=false;
           }
           return midpoint;
       }
   
  

}