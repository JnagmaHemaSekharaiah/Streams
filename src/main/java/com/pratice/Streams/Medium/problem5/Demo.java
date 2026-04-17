package com.pratice.Streams.Medium.problem5;


import java.util.stream.Stream;

public class Demo
{

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(5, 12, 18, 3, 20);

        Long r= stream.filter(x->x>10).count();

        System.out.println(r);

    }
}
