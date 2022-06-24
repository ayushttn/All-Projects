package com.ayush3rd;

import java.util.Scanner;

public class Anybasetoanybase {
    public static int converttodec(int n , int b1){
        int dec = 0;
        int p = 1;
        while (n > 0){
            int dig = n % 10;
            n = n / 10;

            dec += dig * p;
            p = p * b1;
        }
        return dec;
    }
    public static int converttoother(int dec, int b2){
        int rv = 0;
        int p = 1;
        while (dec > 0){
            int dig = dec % b2;
            dec = dec / b2;

            rv += dig * p;
            p = p * 10;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int dec = converttodec(n , b1);
        int b = converttoother(dec, b2);
        System.out.println(b);
    }
}
