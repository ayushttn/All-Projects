package com.company;

public class Pr6_1 {
    public static void main(String args[]){
        float [] flo = {0.1f, 0.2f, 0.3f, 0.002f, 0.34f};
        float sum = 0;
        for (float element:flo)
        {
            sum = sum + element;
        }
        System.out.println("The value is="+ sum);

    }
}
