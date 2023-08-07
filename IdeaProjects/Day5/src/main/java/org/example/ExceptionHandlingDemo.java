package org.example;


public class ExceptionHandlingDemo {
    public static void main(String[] args) {
     int a =0 ;
     // This is R
        int b = 0;// /by zero exception

        try{
            b = 12/a;
            System.out.println(b);

        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Her eis ");

    }
}
