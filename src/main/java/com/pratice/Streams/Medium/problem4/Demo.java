package com.pratice.Streams.Medium.problem4;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo
{

    public static void sloutionOfMe()
    {
        Stream<String> stream = Stream.of("java", "go", "python", "js");

        stream.map(x->x.toUpperCase()).
                forEach(
                        x ->
                        {
                            if(x.length()>3)
                            {
                                System.out.print(x + " ");
                            }
                        }
                );
    }


    public static void main(String[] args)
    {
        Stream<String> stream = Stream.of("java", "go", "python", "js");

        List<String> list     = stream.filter(x->x.length()>3)
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());

        System.out.println(list);

    }

}
