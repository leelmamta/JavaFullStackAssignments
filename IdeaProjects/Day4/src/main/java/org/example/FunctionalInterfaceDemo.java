package org.example;


// This is the One way through which we can use Func1 but
/**
class Func2 implements Func1{

    @Override
    public void display() {
        System.out.println("Implementinf FUn2 ");
    }
} **/
// Instead of using Func2 we can use ANonymous classes
interface Func3 {
    int add(int a, int b);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Functional Interface is a special type of Interface where only 1 method is allowed
        // Func1 ob  = new Func2()
        Func1 obj = new Func1() {
            @Override
            public void display() {
                System.out.println("here is anonymous FUnction");
            }
        };
        // This Anonymous class can be converted to Short and Sweet expression using -> Lambda Expression
        // LEts try this
  Func1 obj2 = () -> System.out.println("anonymous Obje2 ");

        // Now this the one way if we have arguments then how to pass them in lambda expression

      Func3 obj3;
        obj3 = Integer::sum;

        obj2.display();

     obj.display();
     System.out.println("FUnction 3 interface");
        obj3.add(6,7);
    }
}
