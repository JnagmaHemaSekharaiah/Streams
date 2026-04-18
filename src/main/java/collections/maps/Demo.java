package collections.maps;

import java.util.HashMap;
import java.util.Map;

public class Demo
{

    public static void helo()
    {
        Map<Integer,Integer> map = new HashMap();
        map.put(1,1);
        map.put(2,1);
        System.out.println(map.get(2));
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue(1));
    }



    public static void main(String args[])
    {
    Demo.helo();
    }



}
