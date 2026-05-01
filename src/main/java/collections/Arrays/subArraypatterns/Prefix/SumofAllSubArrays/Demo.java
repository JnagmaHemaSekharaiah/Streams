package collections.Arrays.subArraypatterns.Prefix.SumofAllSubArrays;

public class Demo
{

    public static void sunOfAllSubArrays(int[] arr)
    {
        int n =arr.length;
        int prefix[] = new int[arr.length+1];

        for (int i = 0; i < arr.length ; i++) {
            prefix[i+1] =prefix[i]+arr[i] ;
        }

        for (int i = 0; i < prefix.length ; i++)
        {
            System.out.println(prefix[i]);
        }
        int R=0;
        int L=0;
        int totalSum=0;

        for (int i = 0; i < n; i++)
        {
            for (int j = i; j < n; j++)
            {
               int cuurentSum =0;
               cuurentSum = prefix[j+1]-prefix[i];
               totalSum=totalSum+cuurentSum;
            }
        }
        System.out.println(totalSum);
    }

    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3};
        sunOfAllSubArrays(arr);
    }


}
