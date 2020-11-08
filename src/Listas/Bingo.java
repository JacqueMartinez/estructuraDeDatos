/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author jacQu
 */
public class Bingo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        final int NUM_BALLS = 75, NUM_PULS =10;
//        LinkedSet<BingoBall> bingoSet = new LinkedSet<>();
//        BingoBall ball;
//        for (int i = 1; i < NUM_BALLS; i++) {
//            ball = new BingoBall(i);
//            bingoSet.add(ball);
//        }
////        System.out.println(bingoSet);
//        System.out.println("Size"+ bingoSet.size());
//        for (int i =1; i <= NUM_PULS; i++) {
//                ball =bingoSet.RemoveRandom();
//                System.out.println(ball);
//        }
        
        
   LinkedSet<Integer> valores = new LinkedSet<>();
    valores.add(8);
    valores.add(4);
    valores.add(3);
    valores.add(4);
    LinkedSet<Integer> valores1 = new LinkedSet<>();
    valores1.add(1);
    valores1.add(2);
    valores1.add(5);
    
        System.out.println(valores.isEmpty()); 
        System.out.println(valores.size()); 
        System.out.println(valores.contains(4));
        valores.addAll(valores1);
        System.out.println(valores.equals(valores1));
                
        
       
        
    }
    
}
