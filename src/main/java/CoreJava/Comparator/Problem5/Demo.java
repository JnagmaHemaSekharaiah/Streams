package CoreJava.Comparator.Problem5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
      //  Stream<Integer> stream = Stream.of(23, 45, 12, 39, 30,2,4,13);


        List<Integer> list_even = Stream.of(23, 45, 12, 39, 30,2,4,13).filter(x->x%2==0).toList();
        List<Integer> list_odd   = Stream.of(23, 45, 12, 39, 30,2,4,13).filter(x->x%2!=0).toList();

        Comparator<Integer> comp = (a,b)->
        {
            Integer x = a;
            Integer y = b;
            return x.compareTo(y);
        };


        List<Integer> even=  list_even.stream().sorted(comp).toList();
        List<Integer> odd=    list_odd.stream().sorted(comp).toList();


         System.out.print( even +" "+odd );

    }

}

