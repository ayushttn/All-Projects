package com.company;
class circle{
    circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius=r;
    }
    public int radius;
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder1 extends circle{
    public int height;
    cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.height=h;

    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class PR10_1 {
    public static void main(String[] args) {
       // circle obj = new circle(12);
       // obj.area();
     //   System.out.println(obj.area());
        cylinder1 obj = new cylinder1(12,4);
    }
}
