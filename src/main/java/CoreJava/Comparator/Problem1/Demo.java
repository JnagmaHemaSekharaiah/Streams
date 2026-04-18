package CoreJava.Comparator.Problem1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {

         Stream<Integer> stream =  Stream.of(5, 2, 8, 1, 3);

         List<Integer> list = stream.sorted(Comparator.reverseOrder()).toList();

         System.out.println(list);


    }

}
