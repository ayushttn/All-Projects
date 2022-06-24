package com.company;

import java.util.Scanner;

public class Catchblocks {
    public static void main(String[] args) {
        int [] marks = new int[3];
        marks[0] = 23;
        marks[1] = 34;
        marks[2] = 55;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is=" + marks[ind]);
            System.out.println("The value of array-value/number is=" + marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bond exception");
        }
        catch (Exception e){
            System.out.println("Some other exception");
            System.out.println(e);
        }
    }
}
