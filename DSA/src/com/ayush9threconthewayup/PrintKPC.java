package com.ayush9threconthewayup;

import java.util.Scanner;

public class PrintKPC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printKPC(str, "");
    }
    static String[] codes = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKPC(String str, String asf){
        if (str.length() == 0){
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0);
        String roq = str.substring(1);
        String codesforch = codes[ch - '0'];
        for (int i = 0; i < codesforch.length(); i++){
            char cho = codesforch.charAt(i);
            printKPC(roq, asf + cho);
        }
    }
}
