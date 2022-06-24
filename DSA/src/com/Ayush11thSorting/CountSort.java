package com.Ayush11thSorting;

import java.util.Scanner;

public class CountSort {
    public static void countSort(int[] arr, int min, int max) {
        //write your code here
        int range = max - min + 1;
        int[] freq = new int[range];
        for (int i = 0; i < arr.length; i++){
            int idx = arr[i] - min;
            freq[idx]++;
        }
        for (int i = 1; i < freq.length; i++){
            freq[i] = freq[i] + freq[i - 1];
        }
        int[] ans = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--){
            int val = arr[i];
            int pos = freq[val - min];
            int idx = pos - 1;
            ans[idx] = val;
            freq[val - min]--;
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = ans[i];
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr,min,max);
        print(arr);
    }
}
