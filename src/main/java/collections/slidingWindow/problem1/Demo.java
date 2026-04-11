package collections.slidingWindow.problem1;

public class Demo
{
    public static int hello(int [] arr,int k)
    {
        int first_window=0;
        if(arr.length<k) return -1;
        for(int i=0;i<k;i++)
        {
            first_window =first_window+=arr[i];
        }
        int second_window =0;

        for(int i=k;i< arr.length;i++)
        {
             second_window = first_window-arr[i-k]+arr[i]; // 700 - 300 + 500
            if(first_window < second_window)  // 500 < 700
            {
                first_window =  second_window ; // 500
            }
        }
        return second_window;
    }

    public static void main(String[] args) {
       int arr[] = {1,5,4,2,9,9,9};
       int k =3;
       System.out.println(Demo.hello(arr,k));
    }

}
