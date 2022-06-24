package com.ayush9threconthewayup;

import java.util.Scanner;

public class PrintStairPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintPath(n, "");
    }
    public static void PrintPath(int n, String path){
        if (n < 0){
            return;
        }
        if (n == 0){
            System.out.println(path);
            return;
        }
        PrintPath(n - 1, path + "1");
        PrintPath(n - 2, path + "2");
        PrintPath(n - 3, path + "3");
    }
}
