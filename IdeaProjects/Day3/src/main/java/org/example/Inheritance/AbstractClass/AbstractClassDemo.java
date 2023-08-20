package org.example.Inheritance.AbstractClass;
abstract class vehicle {
//    Creating an abstract method -> If i am creating any abstract method i had to make class as abstract
    // Abstract method provides Everyones own implementation functionalities
    // abstract class dont have any body
    public abstract void startEngine();
    public void PerformReverse(){
        System.out.println("applying reverse gear");
    }

}
class Honda extends vehicle{
    public void startEngine(){
        System.out.println("honda Implementation");
    }
}

class Maruti extends vehicle{
    public void startEngine(){
        System.out.println("Maruti Implementation");
    }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
        // = > Honda() decides which object method should be called
        vehicle v1 = new Honda();
        v1.startEngine();
    }
}
