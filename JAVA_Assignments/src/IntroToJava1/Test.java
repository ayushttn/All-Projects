package IntroToJava1;

import java.io.*;
import java.lang.reflect.AnnotatedArrayType;
import java.net.ConnectException;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//class Per implements Comparable<Per>{
//    private String Name;
//    public Per(String Name){
//        this.Name = Name;
//    }
//    public String toString(){
//        return Name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Per per = (Per) o;
//        return Name.equals(per.Name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(Name);
//    }
//
//    @Override
//    public int compareTo(Per per) {
//        return Name.compareTo(per.Name);
//    }
//}
public class Test {
    public static void main(String[] args) throws InterruptedException {
        int [] a = new int[4];
        System.out.println(a[3]);
    }
}
