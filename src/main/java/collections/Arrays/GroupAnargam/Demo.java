package collections.Arrays.GroupAnargam;

import java.util.*;

public class Demo
{
    public static String[] sortString(String str)
    {


            return new String[]{str};
    }

    public static void main(String[] args)
    {

        String [] s = {"eat","tea","tan","ate","nat","bat"};
        Map<String, List<String>> map = new HashMap();

        for (String str:s)
        {
            Arrays.sort(str.toCharArray());


        }




    }


}
