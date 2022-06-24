package com.company;
import java.util.Scanner;
public class Pr5_2 {
    public static void main(String[] args){
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n=");
        int n = sc.nextInt();
        int sum = 0;
        while (i<n){
            sum = sum + (2*i);
            i++;
        }
        System.out.println(sum);
    }
}
