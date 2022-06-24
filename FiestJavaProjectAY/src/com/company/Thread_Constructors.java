package com.company;
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
      //  while (true){
      //      System.out.println("I am a Thread");
      //  }
    }
}
public class Thread_Constructors {
    public static void main(String[] args) {
        MyThr t = new MyThr("Ayush");
        t.start();
        System.out.println("The id of the thread is " + t.getId());
        System.out.println("The name of the thread is " + t.getName());
    }
}
