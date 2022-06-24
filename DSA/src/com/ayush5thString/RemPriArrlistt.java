package com.ayush5thString;

import java.util.ArrayList;
import java.util.Scanner;

public class RemPriArrlistt {
    public static boolean isPrime(int val){
        for (int div = 2; div * div <= val; div++){
            if(val % div == 0){
                return false;
            }
        }
        return true;
    }
    public static void solution(ArrayList<Integer> list){
        for (int i = list.size()-1; i >= 0; i--){
            int val = list.get(i);
            if(isPrime(val) == true){
                list.remove(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        solution(list);
        System.out.println(list);
    }
}
