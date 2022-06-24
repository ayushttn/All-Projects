package com.company;
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class Pr9_4 {
    public static void main(String[] args) {
        Rectangle myrec = new Rectangle(12,45);
        System.out.println(myrec.getLength());
        System.out.println(myrec.getBreadth());
    }
}
