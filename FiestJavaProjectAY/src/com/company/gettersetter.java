package com.company;
class myemp{
    private String name;
    private int id;
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}
public class gettersetter {
    public static void main(String[] args) {
        myemp Ayush = new myemp();
        Ayush.setName("Ayush Tygai");
        Ayush.setId(5);
        System.out.println(Ayush.getName());
        System.out.println(Ayush.getId());
    }
}
