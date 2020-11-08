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
public class Arreglos {

    public void buscar() {
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

//*******************************************//
//        int b[][] = new int[10][5];
//        for (int m = 0; m< b.length; m++) {
//            for (int  n= 0; n < b[0].length; n++) {
//                b[m][n]=i;
//            }  
//        }
//            for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b[0].length; j++) {
//                System.out.println(b[i][j]);
//            }  
//        }
//***********************************************//
//        int [][][] c = new int[5][4][6];
//        for (int i = 0; i < c.length; i++) {
//            for (int j = 0; j < c[0].length; j++) {
//                for (int k = 0; k < c[0].length; k++) {
//                    c[i][j][k]=i;
//                }
//            }
//        }
//        
//        for (int i = 0; i <5; i++) {
//            for (int j = 0; j < 4; j++) {
//                for (int k = 0; k < 6; k++) {
//                    System.out.println( c[i][j][k]);
//                }
//            }
//        }
    
    
//***********************************************//
    //Se realizan 2 arreglos uno llamado Grid y otro arreglo, estos se inicializan con valores y 
    //el metodo buscar arreglo se encarga de contar cuantos 1 hay en estos arreglos.
    //Devuelve cuantos 1 encontro.
    private int[][] grid = {
        {1, 0, 1, 0, 0, 0},
        {1, 0, 1, 0, 1, 0},
        {1, 0, 1, 0, 1, 0},
        {0, 0, 0, 0, 0, 1}
    }; //Primer arreglo
    private int[] arreglo = {0, 1, 1, 0, 0, 1}; //Segundo arreglo

    public void buscarArreglo() { //metodo que busca 1 dentro del arreglo
        int cont = 0;
        for (int i = 0; i < arreglo.length; i++) { //ciclo que recorre el arreglo "arreglo"
            if (arreglo[i] == 1) {
                cont++;
            }
        }
        System.out.println("hay" + cont + "unos");

        int cont2 = 0;
        for (int i = 0; i < grid.length; i++) { //Ciclo que recorre el arreglo "grid"
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    cont2++;
                }
            }
        }
        System.out.println("hay" + cont2 + "unos");
    }

}
