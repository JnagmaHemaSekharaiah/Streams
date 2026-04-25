package com.pratice.Streams.Basic.IntermediateOp.flatmap.problem6;

import java.util.List;

public class Demo {

    public static void main(String[] args)
    {

     List<Integer> listA = List.of(1,2);
     List<Integer> listb = List.of(3,4);

        System.out.println(
     listA.stream().flatMap(x->
                       listb.stream()
                               .map(y -> x +","+y)
     ).toList());


       // [ (1,3) (1,4) ]

    }

}
