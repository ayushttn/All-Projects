package com.ayush7thArrRec;

import java.util.Scanner;

public class Disarrrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        display(arr, 0);
    }
    public static void display(int[] arr, int idx){
        if (idx == arr.length){
            return;
        }
        display(arr, idx + 1);
        System.out.println(arr[idx]);
    }
}
