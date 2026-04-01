package com.pratice.Streams.Filters;

import java.util.List;
import java.util.stream.Stream;

public class Demo
{

    public static void main(String[] args) {
        List<String> names = List.of("Ram", "Sita", "Krishna", "Kiran");
        Stream<String> stream = names.stream();
        stream.filter((String x) -> { return x.charAt(0)=='K';} )
                .forEach(x -> { System.out.println(x); });
    }
}
