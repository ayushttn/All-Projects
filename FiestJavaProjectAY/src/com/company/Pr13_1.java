package com.company;
class Print1 extends Thread{
    public void run(){

            System.out.println("Good Morning");

    }
}
class Print2 extends Thread{
    public void run(){

           System.out.println("Welcome");

    }
}
public class Pr13_1 {
    public static void main(String[] args) {
        Print1 t1 = new Print1();
        Print2 t2 = new Print2();
        t1.setPriority(6);
        t2.setPriority(9);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(Thread.currentThread().getState());
        t1.start();
        t2.start();
    }
}
