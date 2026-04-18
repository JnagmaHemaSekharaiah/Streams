package CoreJava.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo
{


    public static void main(String[] args)
    {

        List<Integer> list = Arrays.asList(5, 2, 8);

        Comparator<Integer> comp = (a,b) -> {
            Integer key1 =a;
            Integer key2=b;
            return a.compareTo(b);
        };

        list.sort(comp);

        System.out.println(list);
    }

}
