package com.company;
import java.util.Scanner;
public class Pr6_3 {
    public static void main(String args[]){
        int [] marks = {55,65,64,34,56,35,77,95};
        int sum = 0;
        for (int elements: marks){
            sum = sum + elements;
        }
        System.out.println("The average of marks is:"+ sum/ marks.length);
    }
}
