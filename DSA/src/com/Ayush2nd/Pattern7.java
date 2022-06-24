package com.Ayush2nd;


import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 0;
//        for (int i = 0; i < n; i++){
//            for (int j = 1; j <= sp; j++){
//                System.out.print("\t");
//            }
//            System.out.println("*");
//            sp++;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == j){
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
