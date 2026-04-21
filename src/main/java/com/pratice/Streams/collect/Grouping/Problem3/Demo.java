package com.pratice.Streams.collect.Grouping.Problem3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {

    public static void main(String[] args)
    {
        List<String> list = List.of("java", "go", "python", "js");


         Map<Integer,List<String>>  map=list.stream().collect(Collectors.groupingBy
                          (
                          x->x.length(),
                          Collectors.mapping(x->x.toUpperCase(), Collectors.toList())
                          )
                  );

        System.out.println(map);

    }

}
