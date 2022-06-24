package com.company;
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from enemy");
    }
    public void fire(){
        System.out.println("firing");
    }
}
public class Pr8_5 {
    public static void main(String[] args) {
        Tommy player = new Tommy();
        player.hit();
        player.fire();
        player.run();
    }
}
