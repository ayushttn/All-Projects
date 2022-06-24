package com.company;
import java.util.Scanner;
public class Pr6_5 {
    public static void main(String args[]){
        int [] arr = {2,3,4,5,6,7};
        int l = arr.length;
        int n = Math.floorDiv(arr.length, 2);
        int temp;
        for (int i=0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element: arr){
            System.out.println(element);
        }
    }
}
