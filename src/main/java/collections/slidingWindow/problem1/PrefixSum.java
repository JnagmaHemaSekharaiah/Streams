package collections.slidingWindow.problem1;

public class PrefixSum
{

    public static int hello1(int arr[],int k)
    {

        int prefix[] = new int[arr.length+1];

        int firstSum=0;

        for (int i = 0; i < arr.length ; i++)
        {
            firstSum =firstSum+arr[i];
            prefix[i+1] =firstSum;
        }

        for (int i = 0; i <prefix.length ; i++)
        {
       //     System.out.println(prefix[i]);
        }

        int count=0;
        int varSum=0;

        for (int i = 0; i <prefix.length; i++)
        {
            int R =i+1;
            System.out.println(prefix[R+1]-prefix[i]);
            if(prefix[R+1]-prefix[i]==k)
            {
                count++;
            }
        }

        System.out.println(count);

        return -1;

    }


    public static void main(String[] args)
    {
        int arr[] = {1,2,3};
        int k =3;
        System.out.println(PrefixSum.hello1(arr,k));
    }
}
