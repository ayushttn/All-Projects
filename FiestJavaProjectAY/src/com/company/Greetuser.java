package com.company;
import java.util.Scanner;
public class Greetuser {
    public static void main(String args[]){
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print("Hello "+name);
        System.out.println(", have a good day.");
    }
}
