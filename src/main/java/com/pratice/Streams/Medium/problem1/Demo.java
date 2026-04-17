package com.pratice.Streams.Medium.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo
{
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

          List<Integer> list = stream.filter(x->x%2==0)
                                     .map(x->x*x)
                                     .collect(Collectors.toList());

        System.out.println(list);
    }
}
