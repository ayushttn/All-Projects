package com.ayush3rdarray;

import java.util.Scanner;

public class RotateArray {
    public static void display(int [] arr){
        for (int val: arr){
            System.out.println(val);
        }
    }
    public static void reverse(int [] arr, int i, int j){
        int li = i;
        int ri = j;
        while (li < ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
    }
    public static void rotate(int [] arr, int k){
        k = k % arr.length;
        if(k < 0){
            k = k + arr.length;
        }
        // part one
        reverse(arr, 0 , arr.length-k-1);
        // part two
        reverse(arr, arr.length-k, arr.length-1 );
        //all
        reverse(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr =  new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr, k);
        display(arr);
    }
}
