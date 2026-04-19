package com.pratice.Streams.Medium.problem6;

import java.util.stream.Stream;

public class Demo
{

    public static void fun(Stream<Integer> stream)
    {
        Long count =   stream.filter(x->x>10).count();

        System.out.println(count);
    }

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(5, 12, 18, 3, 20);

        fun(stream);

    }

}
