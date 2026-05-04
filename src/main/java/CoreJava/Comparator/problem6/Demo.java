package CoreJava.Comparator.problem6;

import java.util.Comparator;
import java.util.List;

public class Demo
{

    //Sort strings by last character
    // "cat", "dog", "bat" → based on last letter

    public static void main(String[] args)
    {
        List<String> str = List.of("cat", "dog", "bat");

        Comparator<String> comp= (String a,String b)
        ->
        {
          Integer x = (int) a.charAt(a.length()-1);
          Integer y = (int) b.charAt(b.length()-1);

          if(x<y)
          {
              return -1;
          }
          else if (x>y)
          {
              return 1;
          }
          return 0;
        };

        System.out.println
                (
        str.stream().sorted(comp).toList()
        );
    }
}
