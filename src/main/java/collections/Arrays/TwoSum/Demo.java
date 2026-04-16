package collections.Arrays.TwoSum;

import java.util.*;


public class Demo
{
        public static <K, V> K getKeyByValue(Map<K, V> map, V value)
        {
            for (Map.Entry<K, V> entry : map.entrySet())
            {
                if (Objects.equals(entry.getValue(), value)) {
                    return entry.getKey();
                }
            }
            return null;
        }


    public static int[] intTwoSum(int nums[], int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int arr [] = new int[2];


        for (int i = 0; i < nums.length; i++)
        {
            if (map.containsValue(target - nums[i]))
            {
                list.add(getKeyByValue(map, target - nums[i]));
                list.add(i);
                arr[0]=list.get(0);
                arr[1]=list.get(1);
            } else
            {
                map.put(i, nums[i]);
            }
            if(list.size()==2)
            {
                break;
            }
        }
        return  arr;
    }

    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5, 6};
        int target =7;
        System.out.println(intTwoSum(arr,target));
    }


}


