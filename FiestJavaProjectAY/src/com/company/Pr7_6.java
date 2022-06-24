package com.company;

public class Pr7_6 {
    static int avg(int n,int ...arr){
        int result = 0;
        int average = 0;
        for(int a : arr){
            result += a;
        }
        return average = result/n;
    }
    public static void main(String args[]){
        System.out.println(avg(3,6,4,2));
    }
}
