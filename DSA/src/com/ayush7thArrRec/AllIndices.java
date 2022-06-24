package com.ayush7thArrRec;

import java.util.Scanner;

public class AllIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter no");
        int d = sc.nextInt();
        int [] arr2 = allindices(arr, d, 0, 0);
        if ( arr2.length == 0){
            System.out.println();
        }
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
    public static int[] allindices(int[] arr, int d, int idx, int fsf){
        if(idx == arr.length){
            return new int[fsf];
        }
        if(arr[idx] == d) {
            int[] arr2 = allindices(arr, d, idx + 1, fsf + 1);
            arr2[fsf] = idx;
            return arr2;
        }
        else {
            int[] arr2 = allindices(arr, d, idx + 1, fsf);
            return arr2;
        }
    }
}
