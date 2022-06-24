package com.company;
import java.util.Scanner;
public class Pr3_3 {
    public static void main(String args[]){
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Ayush");
        System.out.println(letter);
    }
}
