package com.ayush3rdbinarysearch;

import java.util.Scanner;

public class First_LastIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int l = 0;
        int h = arr.length-1;
        int fi = -1;
        while (l <= h){
            int mid = (l+h) / 2;
            if (d < arr[mid]){
                h = mid - 1;
            }
            else if (d > arr[mid]){
                l = mid + 1;
            }
            else{
                fi = mid;
                h = mid - 1;
            }
        }
        System.out.println(fi);
        l = 0;
        h = arr.length-1;
        int li = -1;
        while (l <= h){
            int mid = (l+h) / 2;
            if (d < arr[mid]){
                h = mid - 1;
            }
            else if (d > arr[mid]){
                l = mid + 1;
            }
            else{
                li = mid;
                l = mid + 1;
            }
        }
        System.out.println(li);
    }
}
