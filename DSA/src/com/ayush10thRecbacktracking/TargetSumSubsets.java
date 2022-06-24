package com.ayush10thRecbacktracking;

import java.util.Scanner;

public class TargetSumSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target");
        int tar = sc.nextInt();
        printTargetSum(arr, 0, "", 0, tar);
    }
    public static void printTargetSum(int[] arr, int idx, String set, int sos, int tar){
        if (idx == arr.length){
            if (sos == tar){
                System.out.println(set + ".");
            }
            return;
        }
        printTargetSum(arr, idx + 1, set + arr[idx] + ",", sos + arr[idx], tar);
        printTargetSum(arr, idx + 1, set, sos, tar);
    }
}
