package org.example;
// Exception Handling Hierarchy
// Object Class -> Throwable class
//                 - 1) Error (IO Err , VMError (OutofMemory), Thread related)
//                 - 2) Exception
// Unchecked Errors
//                     - Runtime (NPE , Arithmetic , ArrayIndex)
// CHecked Errors
//                     - IO Exception (File / Network )
//                     - SQL Exception (JBDC)
class InvalidDigitException extends Exception{
    public InvalidDigitException(String message){

    }
}
public class CustomExceptionClassDemo {
    public static void main(String[] args) {
          int b = -5;
        try {

            if(b<0) throw new InvalidDigitException("Invalid Meessage");
        } catch (InvalidDigitException e) {
            throw new RuntimeException(e);
        }

    }
}
