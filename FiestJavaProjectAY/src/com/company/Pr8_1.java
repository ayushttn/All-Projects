package com.company;
class Emp{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class Pr8_1 {
    public static void main(String[] args) {
        Emp Ayush = new Emp();
        Ayush.setName("Ayush Tygai");
        System.out.println(Ayush.getName());
    }
}
