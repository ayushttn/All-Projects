package com.company;

public class Try_catch {
    public static void main(String[] args) {
        int a = 7000;
        int b = 0;
        try{
            int c = a/b;
        }
        catch(Exception e)
        {
            System.out.println("We failed to divide");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
