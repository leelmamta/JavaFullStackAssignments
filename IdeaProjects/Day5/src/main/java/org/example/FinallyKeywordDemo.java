package org.example;

public class FinallyKeywordDemo {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            b = 12/a;
            System.out.println(b);
        }
        finally {
            // Anything in this will be printed even if the error is not handled
            // Used to release DB cleanup logic
            // And release network connectin
            System.out.println("This is finnaly ");
        }
    }
}
