package com.ayush3rdbinarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class Ceil_floor {
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
        int ceil = 0;
        int floor = 0;
        while (l <= h){
            int mid = (l+h)/2;
            if (d < arr[mid]){
                h = mid - 1;
                ceil = arr[mid];
            }
            else if(d > arr[mid]){
                l = mid + 1;
                floor = arr[mid];
            }
            else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
