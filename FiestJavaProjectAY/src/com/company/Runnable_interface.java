package com.company;
class MyThreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
        System.out.println("I am a Thread not a Threat");
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
        System.out.println("I am a Thread 2 not a Threat");
    }
}
public class Runnable_interface {
    public static void main(String[] args) {
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
