package com.company;
class Employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("My id is " + id);
        System.out.println("And my name is" + name);
    }
}
public class customclass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Ayush = new Employee();
        Employee Disha = new Employee();
        Disha.id=12;
        Disha.name="Disha Swami";
        Ayush.id = 11;
        Ayush.name = "Ayush Tyagi";
       // System.out.println(Ayush.id);
       // System.out.println(Ayush.name);
        Ayush.printdetails();
        Disha.printdetails();

    }
}
