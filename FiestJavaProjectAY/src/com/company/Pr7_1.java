package com.company;

public class Pr7_1 {
    static void table(int n){
        for (int i=0; i<=10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }
    public static void main(String args[]){
        table(5);
    }
}
