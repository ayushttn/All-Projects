package com.ayush3rdarray;

import java.util.Scanner;

public class FindEleInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int idx = -1;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == d){
                idx = i;
            }
        }
        System.out.println(idx);
    }
}
