package collections.Arrays.subArraypatterns.slidingWindow.problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo
{
    public static int subString(List<Character> list,int k)
    {
        int currentWindow=0;
        int maxVowelLastWindow=0;
        if(k>=list.size())
        {
            for (int i = 0; i < list.size(); i++)
            {
                if (isVowel(list.get(i)))
                {
                    currentWindow++;
                }
            }
            return currentWindow;
        }
        if(k<list.size())
        {
            for (int i = 0; i < k; i++) {
                if (isVowel(list.get(i)))
                {
                    currentWindow++;
                }
            }

            maxVowelLastWindow=currentWindow;

            for (int i = k; i < list.size(); i++)
            {
                if (isVowel(list.get(i - k)))
                {
                    currentWindow--;
                }

                if (isVowel(list.get(i)))
                {
                    currentWindow++;
                }
                if (maxVowelLastWindow < currentWindow)
                {
                    maxVowelLastWindow = currentWindow;
                }

            }
        }
        System.out.println(maxVowelLastWindow);

        return maxVowelLastWindow;
    }

    public static  boolean  isVowel(Character ch)
    {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }


    public static void main(String[] args)
    {
        String s = "weallloveyou";

        char []arr = s.toCharArray();
        List<Character> list = new  ArrayList<>();

        for (int i = 0; i < arr.length; i++)
        {
            list.add(arr[i]);
        }

        int k =7;
        subString(list,k);
    }
}
