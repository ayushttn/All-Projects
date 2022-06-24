package com.ayush5thString;

import java.util.Scanner;

public class PalindromicString {
    public static boolean isPalindrom(String s){
        int i = 0;
        int j = s.length() - 1;
        while (i <= j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (ch1 != ch2){
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }
    public static void solution(String s){
        for (int i = 0; i < s.length(); i++){
            for (int j = i + 1; j <= s.length(); j++){
                String  ss = s.substring(i, j);
                if(isPalindrom(ss) == true){
                    System.out.println(ss);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        solution(s);
    }
}
