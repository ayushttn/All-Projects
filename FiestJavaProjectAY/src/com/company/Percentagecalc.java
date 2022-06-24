package com.company;
import java.util.Scanner;

public class Percentagecalc {
    public static void main(String args[]) {
        System.out.println("This program calculates percentage of the student's marks");
        Scanner abc = new Scanner(System.in);
        System.out.println("Enter marks for English:");
        int a = abc.nextInt();
        System.out.println("Enter marks for Hindi:");
        int b = abc.nextInt();
        System.out.println("Enter marks for Maths:");
        int c = abc.nextInt();
        System.out.println("Enter marks for Science:");
        int d = abc.nextInt();
        System.out.println("Enter marks for Social Science:");
        int e = abc.nextByte();
        int total = a+b+c+d+e;
        int percentage = (total*100/500);
        System.out.print("The percentage is:");
        System.out.println(percentage);
    }
}
