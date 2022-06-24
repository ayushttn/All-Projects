package com.company;
import java.util.Scanner;
public class Pr4_3 {
    public static void main(String args[]) {
        float tax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income:");
        float income = sc.nextFloat();
        if (income<2.5f){
            tax = tax +0;
        }
        else if (income>=2.5f && income<5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income>=5f && income<10f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if (income>=10f && income<20f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.f);
        }
        System.out.println("Total tax to be paid by the employee is: " + tax);
    }
}
