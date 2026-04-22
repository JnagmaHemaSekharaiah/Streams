package collections.Arrays.TopKFrequent;

import java.util.*;

import static com.pratice.MethodRefer.firstway.Main.fun;

public class Demo {


    public static Map<Integer,Integer> freq( int nums[])
    {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                 map.put(nums[i] , map.get(nums[i]) +1 );
            }
            else
            {
                map.put(nums[i],1);
            }
        }
        return map;
    }


    public static int [] fun(int nums[],int k)
    {

        Map<Integer,Integer> map   =  freq(nums);
        PriorityQueue<Map.Entry<Integer,Integer>> que =
                new PriorityQueue<>((a,b) -> a.getValue()- b.getValue() ) ;

       for  ( Map.Entry<Integer,Integer> entry  :  map.entrySet() )
       {
           que.add(entry);
           if(que.size() > k )
           {
           que.poll();
           }
       }

      List<Integer> list = new ArrayList<>();

       for (Map.Entry<Integer,Integer> entry  :  que )
        {
           list.add(entry.getKey());
        }

       Collections.sort(list);

        int x [] = new int[list.size()];
        for (int j = 0; j < list.size(); j++)
        {
              x[j] = list.get(j);
        }

        return x;

    }


    public static void main(String[] args) {

        int nums[]={1,1,1,2,2,3};
        int k =2;

        int arr [] =fun(nums,k);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

}
