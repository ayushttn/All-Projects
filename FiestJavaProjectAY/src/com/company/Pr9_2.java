package com.company;
class Cyl{
    private int radius;
    private int height;
    public Cyl(int rad, int hei){
        radius = rad;
        height = hei;
    }
    public int getHeight(){
        return height;
    }
    public int getRadius(){
        return radius;
    }
    public double surfacearea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI* radius * radius * height;
    }
}
public class Pr9_2 {
    public static void main(String[] args) {
        Cyl mycylinder = new Cyl(9,12);
        System.out.println(mycylinder.getHeight());
        System.out.println(mycylinder.getRadius());
        System.out.println(mycylinder.surfacearea());
        System.out.println(mycylinder.volume());
    }
}
