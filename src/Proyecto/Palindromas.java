/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import Colas.*;
import Pilas.*;

/**
 *
 * @author jacQu
 */
public class Palindromas {

     ArrayQueue<Character> cola = new ArrayQueue<>();
    LinkedStack<Character> pila = new LinkedStack<>();

    public void guardar(String palabra) {
        int tamano = palabra.length();
       
        for (int x = 0; x < tamano; x++) {
            char letra = (char) (palabra.charAt(x));
            if (letra != ' ') {
            cola.enqueue(letra);
            pila.Push(letra);
            }
        }
    }
    
      public boolean comparar() {
        boolean resultado = true;
        for (int i = 0; i < cola.Size() && resultado; i++) {
            resultado = cola.dequeue().equals(pila.Pop());
        }
        return resultado;
    }
 
    
     

    
    

}
