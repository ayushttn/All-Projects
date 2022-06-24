package com.company;
import java.util.Locale;
import java.util.Scanner;
public class string_methods {
public static void main(String args[]){
    String name = "Ayush";
    System.out.println(name);
    int value = name.length();
    System.out.println(value);
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());
    String name1 = "    Ayush     ";
    System.out.println(name1.trim());
    System.out.println(name.substring(1,4));
    System.out.println(name.replace('y','a'));
    System.out.println(name.replace("A","Aa"));
    System.out.println(name.startsWith("A"));
    System.out.println(name.endsWith("s"));
    System.out.println(name.charAt(4));
    System.out.println(name.indexOf('s'));
    System.out.println(name.indexOf('a',3));
    System.out.println(name.equals("ayush"));
    System.out.println(name.equalsIgnoreCase("ayush"));
    System.out.println("I am escape \"sequence\" \t Hi \n I am Ayush");
}
}
