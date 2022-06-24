package com.company;
import java.util.Scanner;
public class Pr4_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for English:");
        int a = sc.nextInt();
        System.out.print("Enter marks for Maths:");
        int b = sc.nextInt();
        System.out.print("Enter marks for Science:");
        int c = sc.nextInt();
        int total = a+b+c;
        double per = (total*100/300);
        if (per>=40 && a>=33 && b>=33 && c>=33){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
