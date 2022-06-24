package com.company;
interface Bicycle{
    int a = 45;
    void applybrake(int decrement);
    void speedup(int increment);
}
interface HornBicycle{
    void blowhornk3g();
    void blowhornmhn();
}
class Avoncycle implements Bicycle, HornBicycle{
    void blowhorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applybrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedup(int increment){
        System.out.println("Speeding up");
    }
    public void blowhornk3g() {
        System.out.println("poo poo");
    }
    public void blowhornmhn() {
        System.out.println("pee pee");
    }
}
public class Interfaces_intro {
    public static void main(String[] args) {
        Avoncycle cycle1 = new Avoncycle();
        cycle1.applybrake(1);
        System.out.println(cycle1.a);
        cycle1.blowhornmhn();
        cycle1.blowhornk3g();
    }
}
