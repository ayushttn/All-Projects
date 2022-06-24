package com.company;
abstract class parent3{
    public parent3(){
        System.out.println("I am constructor of base");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class child2 extends parent3{
    public void greet(){
        System.out.println("Good morning");
    }
}
abstract class child3 extends parent3{
    public void th(){
        System.out.println("I am good");
    }
}
public class abstract_class {
    public static void main(String[] args) {
       child2 c = new child2();
    }
}
