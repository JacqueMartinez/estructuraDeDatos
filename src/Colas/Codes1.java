/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

/**
 *
 * @author GS63VR
 */
public class Codes1 {

//    private int[] key={5, 12, -3, 3, 4, 2, 4, 2};
    private Integer keyValue;

    private String encode  = "";
    private int[] key;

    public String encryptar(String message, int[] palabra) {
        this.key = palabra;
        
        LinkedQueue<Integer> keyQueue1 = new LinkedQueue<Integer>();
        LinkedQueue<Integer> keyQueue2 = new LinkedQueue<Integer>();
        //cargar cola de claves
        for (int scan = 0; scan < key.length; scan++) {
            keyQueue1.enqueue(new Integer(key[scan]));
            keyQueue2.enqueue(new Integer(key[scan]));
        }

        //Codificar mensaje
        for (int scan = 0; scan < message.length(); scan++) {
            keyValue = keyQueue1.dequeue();
            encode += (char) ((int) message.charAt(scan) + keyValue.intValue());
            keyQueue1.enqueue(keyValue);
        }
        return encode;

    }

    public String descencryptar(String message, int[] palabraDesencriptar) {
        this.key = palabraDesencriptar;
        String descode = "";
        LinkedQueue<Integer> keyQueue1 = new LinkedQueue<Integer>();
        LinkedQueue<Integer> keyQueue2 = new LinkedQueue<Integer>();
        //cargar cola de claves
        for (int scan = 0; scan < key.length; scan++) {
            keyQueue1.enqueue(new Integer(key[scan]));
            keyQueue2.enqueue(new Integer(key[scan]));
        }

        //Codificar mensaje
        for (int scan = 0; scan < message.length(); scan++) {
            keyValue = keyQueue2.dequeue();
            descode += (char) ((int) encode.charAt(scan) - keyValue.intValue());
            keyQueue2.enqueue(keyValue);
        }
        return descode;

    }

//    public void Code() {
//        int[] key = {5, 12, -3, 3, 4, 2, 4, 2};
//        Integer keyValue;
//        String encode = "", descode = "";
//        String message = "Hola mundo";
//        LinckedQueue<Integer> keyQueue1 = new LinckedQueue<Integer>();
//        LinckedQueue<Integer> keyQueue2 = new LinckedQueue<Integer>();
//        //cargar cola de claves
//        for (int scan = 0; scan < key.length; scan++) {
//            keyQueue1.Enqueue(new Integer(key[scan]));
//            keyQueue2.Enqueue(new Integer(key[scan]));
//        }
//        
//        //Codificar mensaje
//        for (int scan = 0; scan < message.length(); scan++) {
//            keyValue = keyQueue1.Dequeue();
//            encode+= (char)((int) message.charAt(scan)+keyValue.intValue());
//            keyQueue1.Enqueue(keyValue);
//        }
//        System.out.println("Encode Msj: "+encode);
//        
//        
//        //desCodificar mensaje
//        for (int scan = 0; scan < message.length(); scan++) {
//            keyValue = keyQueue2.Dequeue();
//            encode+= (char)((int) encode.charAt(scan)-keyValue.intValue());
//            keyQueue2.Enqueue(keyValue);
//        }
//        System.out.println("Encode Msj: "+encode);
//    }
}
