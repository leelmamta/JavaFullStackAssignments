package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(65, 32, 78, 91, 37);
        Consumer<Integer>consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer*5);
            }
        };
//        values.forEach(consumer);

        Stream<Integer> stream = values.stream();
        values.forEach( k-> System.out.println(k*2));

        Stream<Integer>streamodd = stream.filter(p->(p%2!=0));

        Stream<Integer>mp = stream.map(k->k*10);
        stream.forEach(s->System.out.println(s));


    }
}

