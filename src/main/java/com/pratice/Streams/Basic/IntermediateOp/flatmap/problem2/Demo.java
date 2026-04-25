package com.pratice.Streams.Basic.IntermediateOp.flatmap.problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args)
    {


     List<String> list = List.of("Hello World", "Java Streams");


       List<String> list1=  list.stream().
               flatMap(x-> Arrays.stream(x.split(" ")))
               .collect(Collectors.toList());

        System.out.println(list1);

    }

}
