package org.example.Inheritance.WrapperClass;

public class WrapperDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = new Integer(a);// Boxing
        Integer a2 = a; // Auto Boxing
        System.out.println(a2);
        System.out.println(a1);
        int a3 = a1.intValue() ; // Unboxing
        int a4 = a1; // Auto Unboxing

    }
}
