package JAVA_8;
interface myinterface3{
    default void print(){
        System.out.println("Printing");
    }
}
class A implements myinterface3{
    public void sayHi(){
        System.out.println("HI Everyone");
    }
}
class B implements myinterface3{
    @Override
    public void print() {
        System.out.println("Printing in Class B");
    }
}
public class Q5 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.print();
        a.sayHi();
        b.print();
    }
}
