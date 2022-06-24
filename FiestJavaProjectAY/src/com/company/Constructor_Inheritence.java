package com.company;
class Consinh{
    Consinh(){
        System.out.println("I am a Constructor");
    }
    Consinh(int x){
        System.out.println("I am an overloaded constructor with value of a: " + x);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Der extends Consinh{
    Der(){
      //  super(0);
        System.out.println("I am a Derived class Constructor");
    }
    Der(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of derived class with value of x and y" + y);
    }
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class ChildofDer extends Der{
    ChildofDer(){
        System.out.println("I am constructor of derived constructor");
    }
    ChildofDer(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of child class with value of z" + z);
    }
}
public class Constructor_Inheritence {
    public static void main(String[] args) {
        Consinh b = new Consinh();
       // Der d = new Der(14, 8);
        ChildofDer c = new ChildofDer(3,5,6);

    }
}
