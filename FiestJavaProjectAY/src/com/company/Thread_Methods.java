package com.company;
class MyThrNew1 extends Thread{
    public MyThrNew1(String name){
        super(name);
    }
    public void run(){
        while (true){
            System.out.println("Thank you ");
            try {
                Thread.sleep(455);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class MythrNew2 extends Thread{
    public void run() {
        while (true){
            System.out.println("Hello");
        }
    }
}
public class Thread_Methods {
    public static void main(String[] args) {
        MyThrNew1 t1 = new MyThrNew1("Ayush");
        MythrNew2 t2 = new MythrNew2();
        t1.start();
     //   try{
     //       t1.join();
   //     }
     //   catch (Exception e){
    //        System.out.println(e);
     //   }

        t2.start();
    }
}
