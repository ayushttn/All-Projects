package com.company;
class MyEmployee{
    private int id;
    private String name;
    public MyEmployee(int myid, String myname){
        id = myid;
        name = myname;
    }
    public MyEmployee(int myid){
        id = myid;
        name = "Hi";
    }
    public String getName() { return name; }
    public void setName(String n) { name=n; }
    public int getId() { return id; }
    public void setId(int i) { id = i; }
}
public class constr {
    public static void main(String[] args) {
        MyEmployee Ayush = new MyEmployee(34, "Ayush Tyagi");
       // Ayush.setName("Ayushtyagi");
        MyEmployee Ayush1 = new MyEmployee(34);
        System.out.println(Ayush1.getId());
        System.out.println(Ayush1.getName());
    }
}
