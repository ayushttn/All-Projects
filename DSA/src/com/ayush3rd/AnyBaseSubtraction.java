package com.ayush3rd;

import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();
        int d = getsub(n1, n2, b);
        System.out.println(d);
    }
    public static int getsub(int n1, int n2, int b){
        int rv = 0;
        int car = 0;
        int p = 1;
        while (n2 > 0){
            int d1 = n1 % 10;
            n1 = n1 / 10;
            int d2 = n2 % 10;
            n2 = n2 / 10;
            int d = 0;
            d2 = d2 + car;

            if(d2 >= d1){
                car = 0;
                d = d2 - d1;
            }
            else {
                car = -1;
                d = d2 + b - d1;
            }
            rv = rv + d * p;
            p = p * 10;
        }
        return rv;
    }
}
