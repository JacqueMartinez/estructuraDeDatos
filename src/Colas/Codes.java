/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

import java.util.ArrayList;

/**
 *
 * @author jacQu
 */
public class Codes { 
    Integer[] key;
    Integer keyValue;
    String encoded2;
    String encoded = "", decoded = "";
    String message = "";
  ArrayQueue<Integer> keyQueue1= new ArrayQueue<Integer>();
  ArrayQueue<Integer> keyQueue2= new ArrayQueue<Integer>();
  
        
//    LinkedQueue<Integer> keyQueue1 = new LinkedQueue<Integer>();
//    LinkedQueue<Integer> keyQueue2 = new LinkedQueue<Integer>();

    public void clave(String clave) {
        key = new Integer[clave.length()];
         for (int scan = 0; scan < clave.length(); scan++) {
            char caracter = clave.charAt(scan);
            int assci = (int) caracter;
             for (int i = 0; i < key.length; i++) {
                 key[i]= assci;
             }
        }
    }
    public String encriptar(String message) {
        String encoded="";
        this.message = message;
        //cargar cola de claves
        for (int scan = 0; scan < key.length; scan++) {
            keyQueue1.enqueue(new Integer(key[scan]));
            keyQueue2.enqueue(new Integer(key[scan]));
        }
        //codifica mensaje
        for (int scan = 0; scan < message.length(); scan++) {
            keyValue = keyQueue1.dequeue();
           encoded += (char) ((int) message.charAt(scan) + keyValue.intValue());
            keyQueue1.enqueue(keyValue);
        }
        
        return encoded;
       
    }

    public String desincriptar(String message) {
        String descode = "";
       
        for (int scan = 0; scan < message.length(); scan++) {
            keyValue = keyQueue2.dequeue();
            descode += (char) ((int) message.charAt(scan) - keyValue.intValue());
            keyQueue2.enqueue(keyValue);
        }
        return descode;
    }
    public void limpiar(){
        decoded="";
        encoded="";
        

    }
   
}
