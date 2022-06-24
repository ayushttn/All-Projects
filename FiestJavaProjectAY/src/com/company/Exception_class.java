package com.company;

import java.util.Scanner;

class MyException extends Exception{
    public String toString() {
        return "I am toString()";
    }
    public String getMessage(){
        return "I am getMessage()";
    }
}

public class Exception_class {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if (a<99){
            try {
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
