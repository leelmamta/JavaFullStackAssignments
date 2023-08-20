package org.example.Inheritance.AccessSpecifiers;

public class AccessSpecifiersDemo {
    private  int samePri = 10;
    public  int samePub = 20;
    protected  int samePro = 30;
    public static void main(String[] args) {
//         There are Four types of Access Specifiers
        // On CLasses -> Only DEfault or public will work
        // Data Members and Methods -> Private , Public, Protected , default will work
        // Now lets see the usage of access specifiers -> Where can we access a particular AccessSpecfier and where not
        // ----- 1. Inside Same class
        // Private -> accessible , Public -> accessible , protected -> Accessible , default - > accessible
        //        samePri , samePub, samePro inside SameClassUsage
        // ----- 2. Same Package Subclass
        // Private ->

    }
    void SameClassUsage(){
        AccessSpecifiersDemo a1 = new AccessSpecifiersDemo();
        System.out.println(a1.samePri);
        System.out.println(a1.samePro);
        System.out.println(a1.samePub);
    }


}
