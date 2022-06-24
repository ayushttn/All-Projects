package com.company;
import java.util.Scanner;
public class Pr5_5 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number=");
        int num = sc.nextInt();
        int fac = 1;
        for (int i = 1; i<=num; i++)
        {
            fac *=i;
        }
        System.out.println(fac);
    }
}
