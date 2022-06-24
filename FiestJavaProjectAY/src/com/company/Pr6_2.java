package com.company;
import java.util.Scanner;
public class Pr6_2 {
    public static void main(String args[]) {
        int [] num = {1, 2, 3, 4, 5, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to search in array:");
        int n = sc.nextInt();
        boolean isInArray = false;
        for (int element: num){
         if(n == element){
             isInArray = true;
             break;
         }
        }
        if (isInArray){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}