package com.company;
import java.util.Scanner;
public class CGPA {
    public static void main(String args[]){
        System.out.println("Enter marks for English:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter marks for Maths:");
        int b = sc.nextInt();
        System.out.println("Enter marks for Science:");
        int c = sc.nextInt();
        int total = a+b+c;
        double per = (total*100/300);
        double CGPA = per/9.5;
        System.out.println("The CGPA is:"+CGPA);
    }
}
