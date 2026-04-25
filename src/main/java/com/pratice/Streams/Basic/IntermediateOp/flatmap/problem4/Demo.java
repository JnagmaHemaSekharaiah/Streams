package com.pratice.Streams.Basic.IntermediateOp.flatmap.problem4;

import java.util.List;

public class Demo
{
    public static void main(String[] args)
    {

        List<List<Integer>> list = List.of(List.of(1,2,3),List.of(4,5),List.of(6));

        List<Integer> j=  list.stream().flatMap(x->x.stream().filter(i->i%2==0)).toList();

        System.out.println(j);

    }
}
