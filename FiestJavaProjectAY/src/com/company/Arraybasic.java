package com.company;
import java.util.Scanner;
public class Arraybasic {
    public static void main(String args[]){
        int [] marks = new int[5];
        marks[0]=100;
        marks[1]=96;
        marks[2]=76;
        marks[3]=67;
        marks[4]=55;
        String [] name = {"Ayush", "Tyagi", "hi"};
        System.out.println(marks[4]);
        System.out.println(marks.length);
        System.out.println(name.length);
        System.out.println(name[0]);
        for (int i= marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
    }
}
