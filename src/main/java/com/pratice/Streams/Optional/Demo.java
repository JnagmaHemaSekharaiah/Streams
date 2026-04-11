package com.pratice.Streams.Optional;

import java.util.Optional;

public class Demo
{

    public void fun1()
    {

        Optional<String> op = Optional.ofNullable(null);

        op.ifPresent(x-> System.out.println(x) );


    }


    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.fun1();
    }

}
