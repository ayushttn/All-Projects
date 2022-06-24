package com.company;
class One{
    public void greet(){
        System.out.println("Good Morning Mr. Ayush Tyagi");
    }
    public void name(){
        System.out.println("My name is java");
    }
}
class two extends One{
    public void name(){
        System.out.println("My name is Java in class two");
    }
    public void swagat(){
        System.out.println("Apka swagat h!");
    }
}

public class Dynamic_methoddispatch {
    public static void main(String[] args) {
        One obj = new two();
        obj.name();
    }
}
