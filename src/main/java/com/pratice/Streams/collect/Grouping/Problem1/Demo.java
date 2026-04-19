package com.pratice.Streams.collect.Grouping.Problem1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo
{
    public static void main(String[] args) {
        List<String> list = List.of("java", "go", "python", "js");

        Map<Integer,List<String>> result =
                list.stream().collect(Collectors.groupingBy(x->x.length()));

    }
}
