package com.company;

public class Method_call {
    int logic(int x, int y){
        int z;
        z = x + y;
        return z;
    }
    public static void main(String args[]){
        int a=32;
        int b=44;
        int c;
        Method_call obj = new Method_call();
        c = obj.logic(a, b);
        System.out.println(c);
    }
}
