package com.pratice.MethodRefer.orbitary.Easy;

// Convert Lambda → Method Reference
// Function<String, Integer> f = s -> s.length();

import com.pratice.MethodRefer.orbitary.example.Main11;

public class Main {

    public Integer findLenth(String x)
    {
        return x.length();
    }

    public  void method() {
        Main main = new Main();
        Demo demo = (Main main2, String x) -> this.findLenth(x);
        Integer x= demo.fun(main,"Hello");
        System.out.println(x);
    }

    public void method2()
    {
        Main main = new Main();
        Demo demo = Main::findLenth;
        System.out.println(demo.fun(main,"Hello"));
    }



    public static void main(String[] args) {
        Main main = new Main();
         main.method();
        main.method2();
    }

}
