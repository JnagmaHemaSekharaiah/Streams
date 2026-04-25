package com.pratice.Streams.IntStreamProblms.Problem1;

import java.util.stream.IntStream;

public class Demo
{

    private static void sumMethod()
    {
        int sum  = IntStream.rangeClosed(0,100)
                .filter(x->x%2==0)
                .sum();
        System.out.println(sum);
    }


    public static void maxValue()
    {
         IntStream st= IntStream.of(4,6,7,-3,5,33);
        // System.out.println(st.max().orElse(0));
        // System.out.println(st1.min().orElse(0));
         System.out.println(st.mapToObj(s->Integer.valueOf(s)).toList());

    }



    public static void main(String[] args)
    {
        //sumMethod();
        maxValue();
    }


}
