package collections.slidingWindow.problem3;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo
{



    public static void main(String[] args) {

       List<List<String>>  list = Arrays.asList(List.of("Hello World")
       ,List.of("Java Streams"));

       List<String> list1=   list.stream()
               .flatMap(x->x.stream())
               .flatMap(s-> Arrays.stream(s.split(" ")))
               .collect(Collectors.toList());

        System.out.println(list1);

    }



}
