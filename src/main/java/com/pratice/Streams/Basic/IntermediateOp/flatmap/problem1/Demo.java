package com.pratice.Streams.Basic.IntermediateOp.flatmap.problem1;

import java.util.ArrayList;
import java.util.List;

public class Demo
{
    public static void main(String[] args)
    {
     List<List<Integer>> list = new ArrayList<>(
             List.of(List.of(1,2),
                     List.of(3,4),
                     List.of(5)
                    ));

     List<Integer> list1 = list.stream()
                               .flatMap(x->x.stream())
                               .toList();

     System.out.println(list1);



    }
}
