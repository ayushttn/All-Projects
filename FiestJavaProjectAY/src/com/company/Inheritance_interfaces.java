package com.company;
interface sampleinterface{
    void meth1();
    void meth2();
}
interface childsampleinterface extends sampleinterface{
    void meth3();
    void meth4();
}
class Mysampleclass implements childsampleinterface{
    public void meth1(){
        System.out.println("Method1");
    }
    public void meth2(){
        System.out.println("Method2");
    }
    public void meth3(){
        System.out.println("Method3");
    }
    public void meth4(){
        System.out.println("Method4");
    }
}
public class Inheritance_interfaces {
    public static void main(String[] args) {
        Mysampleclass A = new Mysampleclass();
        A.meth1();
        A.meth2();
        A.meth3();
        A.meth4();
    }
}
