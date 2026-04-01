package com.pratice.MethodRefer.firstway;

public class Main
{
    public static void fun()
    {
        System.out.println("This is static method");
    }

    public static void main(String[] args) {
        Demo demo = ()-> fun();
        Demo demo1 = Main::fun;

        demo.hello();
        demo1.hello();

    }
}
