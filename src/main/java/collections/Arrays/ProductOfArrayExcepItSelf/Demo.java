package collections.Arrays.ProductOfArrayExcepItSelf;

import java.util.ArrayList;
import java.util.List;

public class Demo
{
    public static int [] main(String[] args) {

       int nums[] = {1, 2, 3, 4};
       int product = 1;

       // 24  12  4  1

       // 1    1  2  12

       // 24/24 24/2 24/3

        List<Integer> list_L,List_R;

        for (int i = 0; i < nums.length; i++) {
        product =product*nums[i];
        }

        List<Integer> list = new ArrayList<>();
        int x []= new int [nums.length];

        for (int i = 0; i < nums.length; i++)
        {
           x[i] = product/nums[i];
        }

        return x;

    }
}
