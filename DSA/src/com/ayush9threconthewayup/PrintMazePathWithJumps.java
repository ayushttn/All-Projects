package com.ayush9threconthewayup;

import java.util.Scanner;

public class PrintMazePathWithJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        mazepath(1, 1, n, m,"");
    }
    public static void mazepath(int sr, int sc, int dr, int dc, String psf){
        if (sc > dc && sr > dr){
            return;
        }
        if (sc == dc && sr == dr){
            System.out.println(psf);
            return;
        }
        for (int h = 1; h <= dc - sc; h++){
            mazepath(sr, sc + h , dr, dc, psf + "h");
        }
        for (int v = 1; v <= dr - sr; v++){
            mazepath(sr + v, sc  , dr, dc, psf + "v");
        }
        for (int d = 1; d <= dc - sc && d <= dr - sr; d++){
            mazepath(sr + d, sc + d , dr, dc, psf + "d");
        }
    }
}
