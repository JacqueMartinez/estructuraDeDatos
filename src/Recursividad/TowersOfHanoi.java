/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author jacQue
 */
public class TowersOfHanoi {
    private int totalDIsk;
    
    public TowersOfHanoi(int disk){
        totalDIsk= disk;
    }
    private void moveTower(int numDisks, int start,int temp,int end){
        if(numDisks==1){
            moveOneDisk(start, end);
        }else{
            moveTower(numDisks-1, start, end, temp);
            moveOneDisk(start, end);
            moveTower(numDisks-1, temp, start, end);
        }
    }
    
    public void solve(){
        moveTower( totalDIsk, 1,2,3);
    }
    private void moveOneDisk(int start, int end){
        System.out.println("Move one disk from"+ start + "to"+ end);
    }
}
