package com.ayush9threconthewayup;

import java.util.Scanner;

public class PrintMazepath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePath(1,1, n, m, "");
    }
    public static void printMazePath(int sr, int sc, int dr, int dc, String psf){
        if (sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }
        if(sc < dc){
            printMazePath(sr, sc + 1 , dr, dc, psf + "h");
        }
        if(sr < dr){
            printMazePath(sr + 1, sc, dr, dc, psf + "v");
        }
    }
}
