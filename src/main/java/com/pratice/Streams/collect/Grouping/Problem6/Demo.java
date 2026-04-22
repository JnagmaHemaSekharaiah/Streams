package com.pratice.Streams.collect.Grouping.Problem6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo
{
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("apple", "ant", "bat", "ball");

       Map<Character,List<Integer>> map = stream.collect(Collectors.groupingBy(x->x.charAt(0),
                Collectors.mapping(x->x.length(),Collectors.toList())  ));

        System.out.println(map);

    }

}
