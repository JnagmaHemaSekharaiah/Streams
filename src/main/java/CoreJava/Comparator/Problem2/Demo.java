package CoreJava.Comparator.Problem2;

import java.util.Comparator;
import java.util.stream.Stream;

public class Demo
{
    public static void main(String[] args) {

     Stream<String> stream= Stream.of("java", "go", "python", "js");

            Comparator<String> comp = (x,y) ->
            {
                Integer s = x.length();
                Integer k = y.length();
                return s.compareTo(k);
            };

            System.out.println( stream.sorted(comp).toList());


    }
}
