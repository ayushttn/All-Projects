package com.company;
import java.util.Scanner;
public class breakinjava {
    public static void main(String args[]) {
      /*  for (int i=0; i<5; i++){
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2)
            {
                System.out.println("Loop ends");
                break;
            }
        }*/
        int i = 0;
        do{
            System.out.println("Java");
            if (i==2){
                break;
            }i++;
        }while(i<5);
    }
}
