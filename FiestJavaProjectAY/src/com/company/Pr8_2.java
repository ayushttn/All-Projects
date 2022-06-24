package com.company;
class Cellphone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void vibrate(){
        System.out.println("Vibrating");
    }
    public void CallFriend(){
        System.out.println("Calling Friend");
    }
}
public class Pr8_2 {
    public static void main(String[] args) {
        Cellphone Apple = new Cellphone();
        Apple.CallFriend();
        Apple.vibrate();
        Apple.ring();
    }
}
