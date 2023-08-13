package org.example;

import java.util.HashMap;
import  java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // Key - value pair

        Map<String, Integer> employeeReview = new HashMap<>();

        employeeReview.put("Mamta", 3);
        employeeReview.put("adarsh", 4);

        System.out.println(employeeReview);

        for (String name:employeeReview.keySet()){
            System.out.println(name+" : "+employeeReview.get(name));
        }


    }
}
