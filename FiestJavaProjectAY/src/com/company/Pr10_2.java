package com.company;
class rectangle1{
    public int length;
    public int breadth;

    public rectangle1(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int area1(){
        return length*breadth;
    }
}
class cuboid1 extends rectangle1{
    public int height;

    public cuboid1(int l, int b, int height) {
        super(l, b);
        this.height = height;
    }
    public int area(){
        return length*breadth*height;
    }
}
public class Pr10_2 {
    public static void main(String[] args) {
        cuboid1 obj = new cuboid1(12,4,4);
        System.out.println(obj.area());
        System.out.println(obj.area1());
    }
}
