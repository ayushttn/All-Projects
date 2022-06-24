package com.company;

public class recursion {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int factorial_itt(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            int product=1;
            for (int i=1;i<=n;i++){
                product *=i;
            }
            return product;
        }
    }
    public static void main(String args[]){
        int x=4;
        System.out.println(factorial_itt(x));
    }
}
