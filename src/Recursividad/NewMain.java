/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

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
        Scanner teclado = new Scanner(System.in);
//         int b[][] = new int[2][2];
//         int valor =0;
//           for (int m = 0; m< b.length; m++) {
//            for (int  n= 0; n < b[0].length; n++) {
//                System.out.println("Que valor desea agragar");
//                valor = teclado.nextInt();
//                b[m][n]=valor;
//             
//            }  
//        }
//           for (int m = 0; m< b.length; m++) {
//            for (int  n= 0; n < b[0].length; n++) {
//                System.out.println(b[m][n]);
//             
//            }  
//        }
//           
        //Diseñar un programa que te formauna matriz de dimensiones nxm. Si las dimnesiones
        //son n=m=1 entonces tu programa debera indicar que corresponde a una escalar
        //Si n,m>2 debera permitirteformar la matriz.
        //Tu programa debera permitir solo matrices de dimensiones no mayorsa 10 tanto en filas 
        //como en columnas ademas darte la 
        //oportunidad de llenar cadaindice de la amtriz

        int a[][] = new int[0][0];
        int count = 0;
        System.out.println("Ingreseel valor en m");
        int valor1 = teclado.nextInt();
        System.out.println("Ingreseel valor en n");
        int valor2 = teclado.nextInt();
        if (valor1 == 1 && valor2 == 1) {
            System.out.println("es un escalar");

        } else if (valor1 >= 2 && valor2 >= 2  && valor1<=10 && valor2<=10 ) {
            
            a = new int[valor1][valor2];
            System.out.println("matriz creada con tamaños"+ valor1+valor2);
           
        }else{
            System.out.println("no es una matriz");
        }
         for (int m = 0; m < a.length; m++) {
                
                for (int n = 0; n < a[0].length; n++) {
                    count++;
                }

        }
          if (count >= 4 ) {
                System.out.println("dese agragar valor a la matriz");
                int respuesta= teclado.nextInt();
                if (respuesta == 1) {
                    for (int m = 0; m < valor1; m++) {
                        for (int n = 0; n < valor2; n++) {
                            System.out.println("Ingrese el valor en la posicion" + m + n);
                            int numero = teclado.nextInt();
                            a[m][n] = numero;
                        }
                    }
                }

            }
           for (int m = 0; m < valor1; m++) {
                        for (int n = 0; n < valor2; n++) {
                            System.out.println(a[m][n]);
                        }
                    }
       
        
        

        
    }

}
