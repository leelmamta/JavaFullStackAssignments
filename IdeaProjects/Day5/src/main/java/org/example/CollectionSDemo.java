package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionSDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(45);
        c.add(56);
        c.add(89);
        System.out.println(c);
        Collection<Integer> c1 = new ArrayList<Integer>();
        // Integer is object type we are defining
        c1.add(67);
        c1.add(90);
        System.out.println(c1);
        List<Integer>c2 = new ArrayList<Integer>();
        c2.add(90);
        c2.add(2);
        c2.add(67);
        System.out.println(c2.get(0));
        for (int i:c2){
            System.out.println(i);
        }
    }
}
