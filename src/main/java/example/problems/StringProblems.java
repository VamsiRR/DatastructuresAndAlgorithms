package example.problems;

import java.util.Arrays;

public class StringProblems {
    public static void main(String[] args) {


       // System.out.println(hasUniqueCharcters(new String[]{"v","v","m","s","i"}));

        //System.out.println(arePermutation(new String("ABC"), new String("ECA")));

        //aaaabbdddeeeggsff --> a4b2d3e3g2s1f2
        System.out.println(compressString("aaaabbdddeeeggsff"));

    }

    //Implement an algorithm to determine a string has all unique characters. ["v","a","m","s", "i]
    private static boolean hasUniqueCharcters(String[] arr)
    {
        String temp = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(temp.equals(arr[i]))
            {

                return false;
            }
            else
            {
                temp = arr[i];
            }
        }
       return true;
    }

    //Given two strings check if one is permutation of other

    private static boolean arePermutation(String str1, String str2)
    {
        //check if the length of both strings are same
        if(str1.length() != str2.length())
        {
            return false;
        }

        //Convert the strings to char array and sort and compare
        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        return Arrays.equals(charArr1, charArr2);
    }

    //compress string ex: aaaabbdddeeeggsff --> a4b2d3e3g2s1f2

    private static String compressString(String str)
    {
        StringBuilder compressedStr = new StringBuilder();

        char[] charArr = str.toCharArray();

        int count = 1;
        char temp = charArr[0];

        for (int i = 1; i < charArr.length; i++)
        {
            if (charArr[i] == temp)
            {
                count++;
            }
            else
            {
                compressedStr.append(temp).append(count);
                temp = charArr[i];
                count = 1;

            }
        }

        compressedStr.append(temp).append(count);

        return compressedStr.toString();
    }
}
