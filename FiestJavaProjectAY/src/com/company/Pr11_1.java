package com.company;
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Wtitting");
    }
    void refill(){
        System.out.println("Refilling");
    }
    void changenib(){
        System.out.println("Changing Nib");
    }
}
public class Pr11_1 {
    public static void main(String[] args) {
        FountainPen obj = new FountainPen();
        obj.changenib();
        obj.write();
    }
}
