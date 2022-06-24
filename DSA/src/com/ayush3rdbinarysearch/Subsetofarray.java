package com.ayush3rdbinarysearch;

import java.util.Scanner;

public class Subsetofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int limit = (int)Math.pow(2 , arr.length);
        for (int i = 0; i < limit; i++){
            // convert i to binary and use 0 for blank and 1 for number
            String set = "";
            int temp = i;
            for (int j = arr.length-1; j >= 0; j--){
                int r = temp % 2;
                temp = temp / 2;
                if(r==0){
                    set = "-\t" + set;
                }
                else {
                    set = arr[j] + "\t" + set;
                }
            }
            System.out.println(set);
        }
    }
}

