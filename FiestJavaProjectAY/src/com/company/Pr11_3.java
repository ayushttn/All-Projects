package com.company;
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class Smartphone extends Telephone{
    public void ring(){
        System.out.println("Ringing");
    }
    public void lift(){
        System.out.println("Lifting");
    }
    public void disconnect(){
        System.out.println("Disconnecting phone");
    }
}
public class Pr11_3 {
    public static void main(String[] args) {
        Telephone obj = new Smartphone();
        obj.ring();
    }
}
