package com.pratice.Streams.TerminalOp.reduce;

import java.util.List;

public class Demo
{
    public void sum()
    {
        List<Integer> numbers = List.of(1,2,3,4,5);
        int sum = numbers.stream()
                .reduce(0,(a,b) -> a+b);

        System.out.println(sum);
    }

    public void findMax()
    {
        List<Integer> numbers = List.of(1,2,3,4,5);
        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE,(a,b)-> a>b ?a:b);
    }

    public static void main(String[] args)
    {
      Demo demo = new Demo();
      demo.sum();



    }
}
