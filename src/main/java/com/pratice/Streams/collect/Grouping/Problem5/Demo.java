package com.pratice.Streams.collect.Grouping.Problem5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);


        Map<Boolean,List<Integer> > map=list.stream()
                .collect(Collectors.groupingBy
                     (
                        x-> x%2==0,
                        Collectors.mapping(x->x*x, Collectors.toList())
                      )
        );
        System.out.println(map);
    }

}
