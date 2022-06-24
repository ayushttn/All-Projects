package com.company;

public class Pr7_3 {
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        else{
            return n + sumRec(n-1);
        }
    }
    public static void main(String args[]){
        int c = sumRec(5);
        System.out.println(c);
    }
}
