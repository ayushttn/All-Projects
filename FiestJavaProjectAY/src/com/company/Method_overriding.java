package com.company;
class M{
    public int Ayush(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of Class M");
    }
}
class N extends M{
    public void meth3(){
        System.out.println("I am method 3 of class N");
    }
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class N");
    }
}
public class Method_overriding {
    public static void main(String[] args) {
        M a = new M();
        a.meth2();

        N b = new N();
        b.meth2();
    }
}
