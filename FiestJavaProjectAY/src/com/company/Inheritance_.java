package com.company;
class Base{
    int x;
    public void printme(){
        System.out.println("I am Constructor");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance_ {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        Derived d = new Derived();
        d.setX(5);
        d.setY(6);
        System.out.println(d.getX());
        System.out.println(d.getY());
    }
}
