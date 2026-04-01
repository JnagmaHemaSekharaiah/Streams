package com.pratice.FI.predicate;

import com.Demo.Demo;

public class Main
{
    public  void fun()
    {
     Predicate predicate = (int i) -> i>10;
     System.out.println(predicate.test(11));

    }

    public static void main(String[] args)
    {
        Main main = new Main();
        main.fun();
    }
}
