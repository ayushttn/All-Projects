package com.Ayush11thSorting;

import java.util.Scanner;

public class SelectionSort {
    public static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            int min = i;
            for (int j = i + 1; j < arr.length; j++){
                if (isSmaller(arr, j, min)){
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }
    // used for swapping elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // return true if ith element is smaller then jth
    public static boolean isSmaller(int[] arr, int i, int j) {
        System.out.println("Comparing " + arr[i] + " and " + arr[j]);
        if (arr[i] < arr[j]) {
            return true;
        } else {
            return false;
        }
    }
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        selectionsort(arr);
        print(arr);
    }
}
