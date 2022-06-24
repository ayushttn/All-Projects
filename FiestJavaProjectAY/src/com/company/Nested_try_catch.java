package com.company;

import java.util.Scanner;

public class Nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 23;
        marks[1] = 34;
        marks[2] = 55;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the value=");
            int ind = sc.nextInt();
            try {
                System.out.println("Nested try catch");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index doesn't exists");
                    System.out.println("Exception is level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception is level 1");
            }
        }
    }
}
