package com.company;
interface TVremote{
    void changechannel();
    void volumeup();
    void volumedown();
}
interface SmartTvRemote extends TVremote{
    void youtube();
    void twitter();
}
class TV implements SmartTvRemote{
    public void youtube(){
        System.out.println("Opening Youtube");
    }
    public void twitter(){
        System.out.println("Opening Twitter");
    }
    public void changechannel(){
        System.out.println("Changing channel");
    }
    public void volumeup(){
        System.out.println("Increasing volume");
    }
    public void volumedown(){
        System.out.println("Decreasing volume");
    }
        }
public class Pr11_4 {
    public static void main(String[] args) {
        TVremote obj = new TV();
    }
}
