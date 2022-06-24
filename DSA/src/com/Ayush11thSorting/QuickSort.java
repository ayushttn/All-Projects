package com.Ayush11thSorting;

import java.util.Scanner;

public class QuickSort {
    public static void quicksort(int[] arr, int lo, int hi){
        if (lo >= hi){
            return;
        }
        int pivot = arr[hi];
        int pi = partition(arr, pivot, lo, hi);
        quicksort(arr, lo,  pi - 1);
        quicksort(arr, pi + 1, hi);
    }
    public static int partition(int[] arr, int pivot, int lo, int hi){
        //write your code here
        // 0 to j -> <= pivot
        // j to i-1 -> > pivot
        // i to end -> un
        int i = lo;
        int j = lo;
        while (i <= hi){
            if(arr[i] <= pivot){
                swap(arr, i, j);
                i++;
                j++;
            }
            else {
                i++;
            }
        }
        System.out.println("pivot index -> " + (j - 1));
        return (j - 1);
    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        quicksort(arr, 0, arr.length - 1);
        print(arr);
    }
}
