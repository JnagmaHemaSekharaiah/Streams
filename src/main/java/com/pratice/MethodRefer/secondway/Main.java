package com.pratice.MethodRefer.secondway;

import java.util.function.Function;

public class Main
{
    private String s;
    Main()
    {

    }

    public void display(String x)
    {
        this.s=x;
        System.out.println(s);
    }

    public static void main(String[] args) {
        Demo fi = Main::new;
        Main main = fi.function();
        main.display("Hello");
    }

}
