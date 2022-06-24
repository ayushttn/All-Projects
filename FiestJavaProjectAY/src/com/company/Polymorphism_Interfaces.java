package com.company;
interface Camera2{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("good morning");
    }
    default void record4kvideo(){
        greet();
        System.out.println("Recording 4k video");
    }
}
interface wifi2{
    String[] getnetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callnumber(int phonenumber){
        System.out.println("Calling..." + phonenumber);
    }
    void pickcall(){
        System.out.println("Connecting");
    }
}
class Mysmartphone2 extends MyCellPhone2 implements Camera2, wifi2{
    public void takesnap(){
        System.out.println("Taking snap");
    }
    public void recordvideo(){
        System.out.println("Recording video");
    }
    public String[] getnetworks(){
        System.out.println("Getting list of Networks");
        String[] networkList = {"Harry", "Ayush", "Doll"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class Polymorphism_Interfaces {
    public static void main(String[] args) {
        Camera2 cam1 = new Mysmartphone2();
        cam1.record4kvideo();
        cam1.takesnap();
    }
}
