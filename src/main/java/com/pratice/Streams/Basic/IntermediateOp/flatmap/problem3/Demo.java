package com.pratice.Streams.Basic.IntermediateOp.flatmap.problem3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo
{
    public static void main(String[] args) {

        List<String> list= Arrays.asList("abc", "de", "fa");

        System.out.println
                (
                list.stream()
                        .flatMap(s->s.chars().mapToObj(x->(char)x))
                        .distinct()
                        .collect(Collectors.toList())
                );
    }
}
