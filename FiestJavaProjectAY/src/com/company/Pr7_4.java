package com.company;

public class Pr7_4 {
    static void pattern(int n){
        for (int i=n; i>=0; i--){
            for (int j=i-1; j>=0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern(5);
    }
}
