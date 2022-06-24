package com.company;
import java.util.Scanner;
public class Switch_case {
    public static void main(String args[]){
        int age;
        System.out.println("Enter your are=");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age){
            case 10:
                System.out.println("You are a child:");
                break;
            case 18:
                System.out.println("You are an adult");
                break;
            case 28:
                System.out.println("You need to marry bro");
                break;
            default:
                System.out.println("Enjoy Your life");
        }

    }
}
