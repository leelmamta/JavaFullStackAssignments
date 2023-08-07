package org.example;

public class MultipleCatchStatementsDemo {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int arr[] = new int[3];
        try {
            b = 12/a;
//            System.out.println(b);
            System.out.println(arr[4]);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Outside of the MultipleCatchStatement");
    }
}
