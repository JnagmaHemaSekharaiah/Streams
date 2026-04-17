package com.pratice.Streams.Medium.problem2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args)
    {

        Stream<Integer> stream = Stream.of(4, 2, 5, 2, 3, 4);
        List<Integer> list = stream.distinct()
                                    .sorted()
                                    .collect(Collectors.toList());

        System.out.println(list);


    }




}
