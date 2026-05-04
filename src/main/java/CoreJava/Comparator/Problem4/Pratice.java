package CoreJava.Comparator.Problem4;

import java.util.Comparator;
import java.util.stream.Stream;

public class Pratice
{
    // Input: [23, 45, 12, 39, 30]
    public static void main(String[] args)
    {
        Stream<Integer> stream = Stream.of(23,45,12,39,30);

        Comparator<Integer> comp = (Integer a,Integer b) ->{

           Integer x = a/10;
           Integer y = b/10;
           if(x<y) return -1;
           else if (x>y)
           {
               return 1;
           }
            return 0;
        };


        System.out.println(  stream.sorted(comp).toList());


    }
}
