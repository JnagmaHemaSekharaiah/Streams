package com.pratice.Streams.Basic;

import java.util.List;
import java.util.stream.Stream;

public class Demo
{
    public static void main(String[] args)
    {
       List<String> names = List.of("Ram","Sekhar","Ranga");
       Stream<String> stream = names.stream();

       stream.forEach( (String x) ->
       {
           System.out.println(x);
       }
       );
    }
}
