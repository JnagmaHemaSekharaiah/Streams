package CoreJava.Comparator.Problem2;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class pratice1
{
    public static void main(String[] args)
    {
      //  Input: ["java", "go", "python", "js"]
        List<String> str= new ArrayList<>();
        str.add("java");
        str.add("go");
        str.add("python");
        str.add("js");

        Comparator<String> comp = (String a,String b) ->
        {
            Integer i =a.length();
            Integer j =b.length();

           if(i<j)
               return -1;
           else
           {
              if(i>j) return 1;
           }
           return 0;

        };

        System.out.println
                (
                        str.stream().sorted(comp).toList()
                );

    }
}
