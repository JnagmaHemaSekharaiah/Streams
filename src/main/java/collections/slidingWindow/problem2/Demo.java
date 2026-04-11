package collections.slidingWindow.problem2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Demo {

    public static boolean slidingWindow(int []nums, int k)
    {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0 ; i < nums.length ; i++ )
        {
              if(set.size()==k && set.contains(nums[i]))
              {
                  return  true;
              }
              else if (set.size()==k &&!set.contains(nums[i]))
              {
                  set.remove(nums[i-k]);
                  set.add(nums[i]);
              }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args)
    {
      int arr[] ={1,2,3,4,5,2};
      int k=3;
      //System.out.println( usingMaps(arr,k));
      System.out.println( Demo.slidingWindow(arr,3));
    }

    public static boolean usingMaps(int[] nums, int k) {

        Map<Integer, Integer> maps = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++)
        {
            if (maps.containsKey(nums[i]))
            {
                if (i - maps.get(nums[i]) <= k)
                {
                    return true;
                }
            }
            maps.put(nums[i], i);
        }

       return false;
    }

}
