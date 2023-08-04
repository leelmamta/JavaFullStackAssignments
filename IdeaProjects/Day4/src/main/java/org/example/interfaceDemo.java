package org.example;

// we have worked over abstract classes -> And in abstract classes if we declare a m
// Abstract Classes provide functionality to chilclasses that they can define their own particular method

// Lets seee a case where should we use Interfaces->
/**
abstract  class CPU {
    abstract void processorConfig();
    abstract void brand();
}
 **/
// -> ABove CPU class has all its methods as abstract so it llook ajeeb -> Lets use Interface Instead
interface CPU {
    // All the methods are abstract in interface
    long age = 40; // In interfaces all the variables will be final and static So they can be directly accessible
    void processorConfig();
    void Brand();
}
// If we are using interface then we dont have to declare class as abstract
// Interfaces are the only way to create multiple inheritance in Java.

// Problem Can we use interface for normal class(That is not abstract class  ) ? -> No

class AppleCpuMF implements CPU {
    // To Use interface implements is used
    public void processorConfig() {
        System.out.println("Apple CPU config is implemented ");
        // TO use ProcessorCOnfig function in main class we have to do Override
        // Or to use interface methods in main method we have to override that particular function in class
        //
    }
    public void Brand() {
        System.out.println("Brand is apple");
    }
        // All the abstract methods of Interfaces need to be overrided , if we want to implement only 1
    // in that case APpleCpuMF should be declared as abstract
}



public class interfaceDemo {
    public static void main(String[] args) {
            CPU c1 = new AppleCpuMF();
            c1.Brand();
            c1.processorConfig();
            System.out.println("Age of CPU is : _ "+CPU.age);
        }
    }
