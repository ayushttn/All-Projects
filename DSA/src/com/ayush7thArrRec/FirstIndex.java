package com.ayush7thArrRec;

import java.util.Scanner;

public class FirstIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter data");
        int d = sc.nextInt();
        int fi = firstind(arr, 0, d);
        System.out.println(fi);
    }
    public static int firstind(int[] arr, int idx, int d){
        if (idx == arr.length){
            return -1;
        }
        if(arr[idx] == d){
            return idx;
        }
        else {
            int fi = firstind(arr, idx + 1, d);
            return fi;
        }
//        if (arr[idx] == d){
//            return idx;
//        }
//        else {
//            return fi;
//        }
    }
}
