package CoreJava.Comparator.Problem5;

import java.util.Comparator;
import java.util.stream.Stream;

public class Pratice1
{
    public static void main(String[] args)
    {
        // Sort even numbers first, then odd
        Stream<Integer> stream = Stream.of(12, 45, 23, 39, 30, 2, 4, 13);

        Comparator<Integer> comp = (Integer a,Integer b) ->
        {
         if((a%2==0 || b%2==0 ||a%2!=0 || b%2!=0 ))
         {
             if(a<b)
                 return -1;
             if(a>b)
                 return 1; //swap
         }
            return 0;


        };


        System.out.println(
        stream.sorted(comp).toList()
           );
    }
}
