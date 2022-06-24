package com.company;
class Ekclass{
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int a){
        this.a = a;
    }
    public int return1(){
        return 1;
    }
}
class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("Mai ek constructor hoon");
    }
}
public class this_super {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(5);
        Doclass d = new Doclass(76);
        System.out.println(e.getA());
    }
}
