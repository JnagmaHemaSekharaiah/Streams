package CoreJava.Comparator.Problem5;

import java.util.Comparator;
import java.util.stream.Stream;

public class Demo3
{
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(12, 45);

        Comparator comp = (a, b)->
        {
            Integer x =(Integer) a;
            Integer y =(Integer) b;
            return  (x < y) ? -1 : ((x == y) ? 0 : 1);


        };

        System.out.println( stream.sorted(comp).toList() );

    }
}
