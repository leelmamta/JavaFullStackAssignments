package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamV2Demo {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(65,76,89,31,55);
//        Integer re = values.stream()
//                .filter(k->k%2!=0)
//                .map(m->m*10)
//                .reduce(0, (p, q)->(p+q));

//        List of odd numbers from values

//        List<Integer>oddValues = null;
//                for(Integer i:values)
//                {
//                    if(i%2!=0)
//                        oddValues.add(i);
//
//                }
               List<Integer>odd;
        odd =   values.stream().filter(k->(k%2!=0)).map(p->p*2).collect(Collectors.toList());
        System.out.println(odd);
    }
}
