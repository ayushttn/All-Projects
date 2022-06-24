package com.company;
public class Pr6_6 {
    public static void main(String args[]){
        int [] num = {4,6,5,3,45,34};
        int max = num[0];
        for (int i=0; i< num.length; i++){
            if (num[i] > max)
                max = num[i];
        }
        System.out.println(max);
    }
}
