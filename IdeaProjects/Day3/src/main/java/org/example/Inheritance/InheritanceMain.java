package org.example.Inheritance;

public class InheritanceMain {
public static void main(String[] args){
    calcV1 v1 = new calcV1();
    System.out.println(v1.addon(4,5));
//    Applying Method overriding using calcv2
    CalcV2 v2 = new CalcV2();
    System.out.println(v2.addon(10, 20));
    // In Java -> Diamond Problem (We are not allowed to do multiple Inheritance ) but we can do multilevel inheritance
    // Eg - Calcv3 cant extends calv1 and calv2 at the same time
    // But calv3 can extend one of calv1 or calv2 -> Multilevel inheritance
    calcv3 v3 = new calcv3();
    System.out.println(v3.division(10,2));
}
}
