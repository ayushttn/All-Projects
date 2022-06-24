package com;
import java.util.*;
class Student{
    int rollno;
    String name;
    String dob;
    public Student(String name, String dob, int rollno){
        this.name = name;
        this.dob = dob;
        this.rollno = rollno;
    }
}
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        Student obj = new Student("Ayush", "28.04.1998", 234);
    }

    public static void reverse(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}