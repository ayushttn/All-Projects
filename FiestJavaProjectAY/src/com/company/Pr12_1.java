package com.company;

import java.util.Scanner;

class Print{
    public void Repeat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message=");
        String abc = sc.nextLine();
        System.out.println("Your entered message is " + abc);
    }

}
public class Pr12_1 {
    public static void main(String[] args) {
        Print obj = new Print();
        obj.Repeat();
    }
}
