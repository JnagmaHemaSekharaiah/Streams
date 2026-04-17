package com.pratice.Streams.Medium.problem3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo
{
    public static void main(String[] args) {

      Stream<Integer> stream =  Stream.of(5, 1, 9, 3, 7);

         List<Integer> list = stream.sorted(Comparator.reverseOrder())
                                      .limit(4).
                                       collect(Collectors.toList());

        System.out.println(list);
    }
}
