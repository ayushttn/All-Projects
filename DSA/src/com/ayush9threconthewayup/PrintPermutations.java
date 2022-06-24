package com.ayush9threconthewayup;

import java.security.PublicKey;
import java.util.Scanner;

public class PrintPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        PrintPer(str, "");
    }
    public static void PrintPer(String str, String asf){
        if (str.length() == 0){
            System.out.println(asf);
            return;
        }
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String roql = str.substring(0, i);
            String roqr = str.substring(i + 1);
            String roq = roql + roqr;
            PrintPer(roq, asf + ch);
        }
    }
}
