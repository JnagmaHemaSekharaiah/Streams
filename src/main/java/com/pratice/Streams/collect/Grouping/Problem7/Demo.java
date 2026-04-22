package com.pratice.Streams.collect.Grouping.Problem7;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo
{
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4);

       Map map=  list.stream().collect(Collectors.groupingBy(
                x->x%2==0,Collectors.mapping(x->x*x,Collectors.summingInt(x->x))
        ));

        System.out.println(map);

    }
}
