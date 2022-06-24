package com.company;
import java.util.Scanner;
public class Pr4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Website=");
        String web = sc.next();
        if (web.endsWith(".org")){
            System.out.println("It is an organizational website");
        }
        else if (web.endsWith(".com")){
            System.out.println("It is a commercial website");
        }
        else if (web.endsWith(".in")){
            System.out.println("It is an indian website");
        }
    }
}
