package com.company;
public class Pr6_7 {
    public static void main(String args[]){
        int [] num = {4,6,5,3,45,34};
        int min = num[0];
        for (int i=0; i< num.length; i++){
            if (num[i] < min)
                min = num[i];
        }
        System.out.println(min);
    }
}
