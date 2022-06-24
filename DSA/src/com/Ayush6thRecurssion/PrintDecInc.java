package com.Ayush6thRecurssion;

import java.util.Scanner;

public class PrintDecInc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecrInc(n);
    }
    public static void printDecrInc(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        printDecrInc(n-1);
        System.out.println(n);
    }
}
