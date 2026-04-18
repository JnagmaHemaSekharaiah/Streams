package CoreJava.Comparator.Problem3;

import java.util.Comparator;
import java.util.stream.Stream;

public class Demo
{

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(5, 2, 8, 1);

        Comparator<Integer> comp = (x,y)->
        {
            Integer p =x;
            Integer q =y;
            return x.compareTo(y);
        };

        System.out.println(stream.sorted(comp.reversed()).toList() );

    }
}
