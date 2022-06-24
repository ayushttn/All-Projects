package com.company;
class cylinder{
    private int rad;
    private int hei;
    public void setRad(int d) { rad = d; }
    public int getRad() { return rad; }
    public void setHei(int h) { hei = h; }
    public int getHei() { return hei; }
    public double surfacearea(){
        return 2* Math.PI* rad * rad + 2*Math.PI*rad*hei;
    }
    public double volume(){
        return Math.PI* rad * rad * hei;
    }
}
public class Pr9_1 {
    public static void main(String[] args) {
        cylinder mycylinder = new cylinder();
        mycylinder.setHei(12);
        System.out.println(mycylinder.getHei());
        mycylinder.setRad(9);
        System.out.println(mycylinder.getRad());
        System.out.println(mycylinder.surfacearea());
        System.out.println(mycylinder.volume());
    }
}
