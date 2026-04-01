package com.Demo;

public class Main1
{

    public void x()
    {
        System.out.println("hello");
    }

    public static void main(String[] args)
    {
        Demo1 demo1 = (String x) ->
        {
            return new Main1();
        };

         Main1 main1 =  demo1.fun("Hello");
         main1.x();
    }
}
