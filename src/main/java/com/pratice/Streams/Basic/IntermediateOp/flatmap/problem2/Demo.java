package com.pratice.Streams.Basic.IntermediateOp.flatmap.problem2;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args)
    {


     List<List<String>> list = new ArrayList<>(List.of(List.of("Hello World")
             ,List.of("Java Streams")));




       List<String> list1=  list.stream().flatMap(x->x.stream().filter(u->u.charAt(0)=='H')).toList();

        System.out.println(list1);

    }

}
