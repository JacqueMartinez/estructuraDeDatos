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
public class MetodosFibnoacci {

    public int tamaño;

    public MetodosFibnoacci(int tamaño) {
        this.tamaño = tamaño;
    }

    public void Fibonacci() {
        int a = 1, b = 0, c = 0;
       for (int i = 1; i <= tamaño; i++) {
            b = c;
            c = a + b;
            a = b;
            System.out.println(c);
        }

    }
 

}
