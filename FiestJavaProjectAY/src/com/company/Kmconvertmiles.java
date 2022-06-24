package com.company;
import java.util.Scanner;
public class Kmconvertmiles {
    public static void main(String args[]){
        System.out.println("Enter Value for Kms:");
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = km*0.621371;
        System.out.println("Miles="+miles);
    }
}
