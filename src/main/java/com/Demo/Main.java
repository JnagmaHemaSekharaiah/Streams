package com.Demo;

public class Main
{
    public  void add()
    {
        Demo demo = (int a, int b) -> a+b;;
        System.out.println( demo.fun(3,4));
    }
    public static void main(String[] args)
    {
      Main main = new Main();
      main.add();
    }

}



