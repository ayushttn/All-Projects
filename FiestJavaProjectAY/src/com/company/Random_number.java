package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int num;
    public int inputnumber;
    public int noOfguesses;

    public int getNoOfguesses() {
        return noOfguesses;
    }

    public void setNoOfguesses(int noOfguesses) {
        this.noOfguesses = noOfguesses;
    }

    Game(){
        Random Rand = new Random();
        this.num = Rand.nextInt(100);
    }
    void takeuserinpur(){
        System.out.println("Guess the correct number=");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }
    boolean iscorrectnumber(){
        if(inputnumber==num){
            return true;
        }
        else if(inputnumber<num){
            System.out.println("Too low....");
        }
        else if (inputnumber>num){
            System.out.println("Too high....");
        }
        return false;
    }
}
public class Random_number {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b=false;
        while(!b) {
            g.takeuserinpur();
            b = g.iscorrectnumber();
            System.out.println(b);
        }
    }
}
