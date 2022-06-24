package com.company;

public class Method_overloading {
    static void foo(){
        System.out.println("Good morning bro!");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new word!\n" + "Plagiarism");
    }
    public static void main(String args[]){
        //int [] marks = {53,54,76,87,45};
        //change2(marks);
        //System.out.println(marks[0]);
        foo(200);
        foo();
    }
}
