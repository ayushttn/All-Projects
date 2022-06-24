package com.Ayush6thRecurssion;

import java.util.Scanner;

public class Powerlinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int sol = power(x,n);
        System.out.println(sol);
    }
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        int xpnm1 = power(x, n-1);
        int xpn = x * xpnm1;
        return xpn;
    }
}
