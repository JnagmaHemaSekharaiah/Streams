package CoreJava.Comparator.Problem4;

import java.util.Comparator;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(23, 45, 12, 39, 30);

        Comparator<Integer> comp = (x, y)->
        {
            Integer p =x%10;
            Integer q =y%10;
            return p.compareTo(q);
        };

        System.out.println(stream.sorted(comp).toList());

    }

}
