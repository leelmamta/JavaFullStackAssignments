package org.example;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Hashset , TreeSet, linkedHashSet ===> Are classes and Set , Collection are  ====> Interface

public class SetCollectionDemo {
    public static void main(String[] args) {
        // HashSet
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < 2; i++) {
            s.add(2);
        }
        s.add(1);
//        for(Integer i:s){
//            System.out.println(i);
//        }

        Set<Integer>s1 = new TreeSet<>();
        s1.add(5);
        s1.add(90);
        s1.add(9);

//        Iterator<Integer> itr = s1.iterator();
//        while (itr.hasNext()) System.out.println(itr.next());

        // WE can do this way too
        Set<Integer>s2 = new LinkedHashSet<>();
        // This doesnot sort , while treeset and Hashset do sorting too

        s2.add(90);
        s2.add(7) ;
        s2.add(1); s2.add(1);
        for(Integer it:s2){
            System.out.println(it);
        }

    }
}