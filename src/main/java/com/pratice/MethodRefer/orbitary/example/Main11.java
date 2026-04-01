package com.pratice.MethodRefer.orbitary.example;


public class Main11
{
    public Character fun(String str,int i)
    {
         return str.charAt(i);
    }

    public void fun2()
    {
       // Main main = new Main();

        Demo demo = (Main11 main,String str, int i) ->
                main.fun(str,i);

        System.out.println(demo.apply(this,"hello",0));

    }

    public void fun3()
    {
        Demo demo =Main11::fun;

    }


    public static void main(String[] args) {
        Main11 main = new Main11();
        main.fun2();
    }
}




