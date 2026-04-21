package com.pratice.Streams.collect.Grouping.Problem2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo
{
    public static void main(String[] args)
    {
        Stream<String> stream = Stream.of("a", "bb", "ccc", "dd");

       Map<Integer,Long> map = stream.collect(Collectors.groupingBy
                      (
                       x->x.length() ,Collectors.counting()
                       ));

        System.out.println(map);

    }
}
