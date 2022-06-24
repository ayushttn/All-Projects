package com.company;
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("jumping");
    }
    public void bite(){
        System.out.println("Biting");
    }
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Sir");
    }
    public void eat(){
        System.out.println("Eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}
public class Pr11_2 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.jump();
        Monkey m1 = new Human();
        m1.bite();
        BasicAnimal lovish = new Human();
        lovish.eat();
    }
}
