package com.company;
interface Camera{
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
interface wifi{
    String[] getnetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callnumber(int phonenumber){
        System.out.println("Calling..." + phonenumber);
    }
    void pickcall(){
        System.out.println("Connecting");
    }
}
class Mysmartphone extends MyCellPhone implements Camera, wifi{
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
public class Interface_defaultmethods {
    public static void main(String[] args) {
        Mysmartphone ms = new Mysmartphone();
        ms.record4kvideo();
        String[] ar = ms.getnetworks();
        for(String item: ar){
            System.out.println(item);
        }
    }
}
