package com.company;
import java.util.Scanner;

public class Integercheck {
    public static void main(String args[]) {
        System.out.println("Enter number=");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}