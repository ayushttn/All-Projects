package com.ayush3rd;

import java.util.Scanner;

public class Anybaseaddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();
        int d = getsum(n1, n2, b);
        System.out.println(d);
    }

    public static int getsum(int n1, int n2, int b) {
        int car = 0;
        int rv = 0;
        int p = 1;
        while (n1 > 0 || n2 > 0 || car > 0) {
            int d1 = n1 % 10;
            int d2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;
            int d = d1 + d2 + car;
            car = d / b;
            d = d % b;
            rv += d * p;
            p = p * 10;
        }
        return rv;
    }
}
