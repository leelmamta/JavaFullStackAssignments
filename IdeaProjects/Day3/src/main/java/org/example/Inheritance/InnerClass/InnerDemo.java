package org.example.Inheritance.InnerClass;
class InnverV1{
    String name ;
    public void Display(){
        System.out.println("Inside display");

    }
    // This is inner class
    static class InnverV2{
        public void show(){
            System.out.println("Inside inner show");
        }
    }
}
public class InnerDemo {

    public static void main(String[] args) {
        InnverV1 obj = new InnverV1();
        obj.Display();
        // One way of calling inner class
        // Note -> WE cant directly create inner class object we need outer class object for this
        InnverV1.InnverV2 innverObj = new InnverV1.InnverV2();
        innverObj.show();

    }
}
