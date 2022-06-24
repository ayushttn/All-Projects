package com.ayush7thArrRec;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter data");
        int d = sc.nextInt();
        int li = lastind(arr, 0, d);
        System.out.println(li);
    }
    public static int lastind(int[] arr, int idx, int d){
        if (idx == arr.length){
            return -1;
        }
        int lisa = lastind(arr, idx + 1, d);
        if (lisa == -1){
            if(arr[idx] == d){
                return idx;
            }
            else {
                return -1;
            }
        }
        else {
            return lisa;
        }
    }
}
