package collections.slidingWindow.problem1;

public class pratice
{

    public static int hello1(int arr[],int k)
    {

        if(arr.length>k)
        {
            int firstWindow = 0;
            for (int i = 0; i < k; i++) {
                firstWindow = firstWindow + arr[i];
            }

            int ActualSum=0;
            int currentWindow=firstWindow;
            for (int i = k; i <arr.length ; i++)
            {
            currentWindow =currentWindow-arr[i-k]+arr[i];

            if(ActualSum<currentWindow)
            {
                ActualSum=currentWindow;
            }

            }
            return ActualSum;
        }

        return -1;
    }


    public static void main(String[] args)
    {
        int arr[] = {100, 200, 300, 400};
        int k =2;
        System.out.println(pratice.hello1(arr,k));
    }
}
