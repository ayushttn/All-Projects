package com.company;
import java.util.Scanner;

public class Sumthreeno {
    public static void main(String args[]){
        System.out.println("Enter first number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter Third number:");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("The sum of the numbers is:"+sum);
    }
}
