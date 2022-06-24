package com.ayush5thString;

public class Stringuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        char ch = sb.charAt(0);
        System.out.println(ch);


        sb.setCharAt(1,'s');
        System.out.println(sb);

        sb.deleteCharAt(1);
        System.out.println(sb);

        sb.insert(1,'e');
        System.out.println(sb);

        sb.append('A');
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
