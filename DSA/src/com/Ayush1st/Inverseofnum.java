package com.Ayush1st;

import java.util.Scanner;

public class Inverseofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inv = 0;
        int op = 1;
        while (n != 0){
            int od = n % 10;        //od = original digit op = original place id = inverted digit ip = inverted place
            int id = op;
            int ip = od;
            // make changes to inv using ip and id
            inv = inv + id * (int)Math.pow(10, ip - 1);

            n = n / 10;
            op++;
        }
        System.out.println(inv);
    }
}
