package com.pratice.RevisionStreams.Day1.problem1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo
{
    public static void main(String[] args)
    {
        List<Integer> list =  Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);

        System.out.println
                (
                list.stream().filter(n->Collections.frequency(list,n) >1)
                        .collect(Collectors.toSet())

                );




    }
}
