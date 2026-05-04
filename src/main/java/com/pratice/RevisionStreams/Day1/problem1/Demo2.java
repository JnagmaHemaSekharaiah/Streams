package com.pratice.RevisionStreams.Day1.problem1;

import java.util.*;
import java.util.stream.Collectors;

public class Demo2
{
    public static void main(String[] args)
    {
        List<Integer> list =  Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6);

        Set<Integer> set = new HashSet<>();

       Set<Integer> a = list.stream()
                       .filter( x->!set.add(x))
                       .collect(Collectors.toSet());

        a.forEach(x-> System.out.println(x));

//        Set<Integer> seen = new HashSet<>();
//        List<Integer> list = Arrays.asList(1,1,2);
//
//        for(int i =0;i<list.size();i++)
//        {
//            System.out.println(!seen.add(list.get(i)));
//        }



    }
}
