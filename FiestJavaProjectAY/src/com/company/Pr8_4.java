package com.company;
class Rectan{
    int length;
    int breadth;
    public int area(){
        return length * breadth;
    }
    public int perimeter(){
        return 2 * (length + breadth);
    }
}
public class Pr8_4 {
    public static void main(String[] args) {
        Rectan re = new Rectan();
        re.length= 4;
        re.breadth= 5;
        System.out.println(re.area());
        System.out.println(re.perimeter());
    }
}
