/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author jacQu
 */
public class SerieFibnoacci {

//    public int tamaño;
//   
//
//    public SerieFibnoacci(int tamaño) {
//        this.tamaño = tamaño;
//    }
//
//    public int fibonacci(int n) {
//        
//        if (n > 1) {
//            return fibonacci(n - 1) + fibonacci(n - 2); 
//        } else if (n == 1) {  
//            return 1;
//        } else if (n == 0) {  
//            return 0;
//        } else { 
//            System.out.println("error");
//            return -1;
//        }
//    }
//    public void mostrarSerie() {
//       
//        for (int i = 0; i < tamaño; i++) {
//            System.out.print(fibonacci(i)+" ");
//        }
//        
//    }
    public int Fibnoacci(int num){
        int res=0;
        for (int i = 0; i < num; i++) {
             if (num>1) {
                return Fibnoacci(i-1)+ Fibnoacci(i-2);
            
        }else{
              res++;
        }
        }
    return 1;
       
    }   
    
    
     public void Fibonacci(int tamaño) {
       int a = 1, b = 0, c = 0;
       
       for (int i = 0; i < tamaño; i++) {
          if(tamaño==1){
              System.out.println(tamaño);
          }else{
               
          }
           
        }

    }
      public int Ejemplo(int num){
        int res=0;
        if (num == 0 || num ==1) {
            return num;
            
        }else{
              return Fibnoacci(num-1)+ Fibnoacci(num-2);
        }
       
  }
}
