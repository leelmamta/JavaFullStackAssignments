package org.example;
// WE can define custom annotations too
class Vehicle{
    public void Gear(){
        System.out.println("Gear is working in vehicle ");
    }
}
class Car extends Vehicle{
    @Override
    public void Gear(){
        System.out.println("Gear is working in car");
    }
    @Deprecated
    public void Workin(){
        System.out.println("it is working of car");
    }
}
public class AnnotationsDemo {
    public static void main(String[] args) {
        Car ob = new Car();
      ob.Gear();
      ob.Workin();

    }
}
