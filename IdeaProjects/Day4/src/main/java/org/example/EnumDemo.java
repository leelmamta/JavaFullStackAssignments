package org.example;
// Now comes Enum into picture
// Basically ENum is a class that represents a group of Constants
enum AsssignmentStatus{
    NotStarted , InProgress , Completed
}
// This way we can assign the enum and

public class EnumDemo {
    public static void main(String[] args) {
        // Calling enum in main
        AsssignmentStatus as = AsssignmentStatus.Completed;
        System.out.println(as);
    }
}
