package com.ayush3rdarray;

import java.util.Arrays;
import java.util.Scanner;

public class sumofarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in array 1");
        int n1 = sc.nextInt();
        int [] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter no of elements in array 2");
        int n2 = sc.nextInt();
        int [] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }
        int[] sum =new int[ n1 > n2? n1: n2];
        int i = 0;
        int j = 0;

        for (int k = 0; k < sum.length; k++){
            sum[i] = arr1[i] + arr2[j];
            i++;
            j++;
        }
        for( int val:sum){
            System.out.println(val);
        }
    }
}
