package com.ayush8threcwithArrLis;

import java.util.ArrayList;
import java.util.Scanner;

public class Mazepathwithjump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> paths = getMazepath(1, 1, n, m);
        System.out.println(paths);
    }
    public static ArrayList<String> getMazepath(int sr, int sc, int dr, int dc){
        if (sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();
        for (int h = 1; h <= dc- sc; h++){
            ArrayList<String> hpaths = getMazepath(sr, sc + h, dr, dc);
            for (String hpath: hpaths){
                paths.add("h" + h + hpath);
            }
        }
        for (int v = 1; v <= dr - sr; v++){
            ArrayList<String> vpaths = getMazepath(sr + v, sc, dr, dc);
            for (String vpath: vpaths){
                paths.add("v" + v + vpath);
            }
        }
        for (int d = 1; d <= dr - sr && d <= dc - sc; d++){
            ArrayList<String> dpaths = getMazepath(sr + d, sc + d, dr, dc);
            for (String dpath: dpaths){
                paths.add("d" + d + dpath);
            }
        }
        return paths;
    }
}
