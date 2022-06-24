package com.company;
class C1{
    public int x=5;
    protected int y=23;
    int z=6;
    private int a = 99;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
class C2{

}
class C3{
}
public class Access_modifiers {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.meth1();
    }
}
