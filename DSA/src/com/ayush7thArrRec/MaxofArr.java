package com.ayush7thArrRec;

import java.util.Scanner;

public class MaxofArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = maxofarr(arr, 0);
        System.out.println(max);
    }
    public static int maxofarr(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int misa = maxofarr(arr, idx + 1);
        if(misa > arr[idx]){
            return misa;
        }
        else {
            return arr[idx];
        }
    }
}
