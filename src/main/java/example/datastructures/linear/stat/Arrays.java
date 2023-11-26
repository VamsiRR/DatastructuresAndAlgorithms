package example.datastructures.linear.stat;

public class Arrays
{
    public static void main(String[] args) {

        int[] scores = new int[10];
        scores[0] = 25;
        scores[1] = 200;
        scores[2] = 4;
        scores[3] = 99;
        scores[4] = 25;
        scores[5] = 500;
        scores[6] = 4;
        scores[7] = 91;
        scores[8] = 40;
        scores[9] = 99;

//        java.util.Arrays.sort(scores);
//
//        for (int i = 0; i < scores.length; i++)
//        {
//            System.out.println("Sorted Array: " + i + " " +scores[i]);
//        }
//
//        String[] names = {"Vamsi", "Albert", "Ben"};
//
//        java.util.Arrays.sort(names);
//
//        for (int i = 0; i < names.length; i++)
//        {
//            System.out.println("Sorted Array: " + i + " " +names[i]);
//        }



        //printArray(scores);

        //reverseArray(scores);

        //deleteElementInArray(scores, 2);

        //System.out.println(getElementInAnArray(1, scores));

        //modifyArray(10, 4, scores);

        //copyArray(scores);

        //filterTheBiggestNumber(scores);
    }

   public static void copyArray(Integer[] sourceArray)
   {
       Integer[] destArray = new Integer[sourceArray.length];

       System.arraycopy(sourceArray, 0, destArray, 0, destArray.length);

       for (int i = 0; i < destArray.length; i++)
       {
           System.out.println("Copied Array: " + i + " " +destArray[i]);
       }
   }

    public static void modifyArray(int indexOfElement, Integer elementOfAnArray, Integer[] arrayToModify)
    {
        if(elementOfAnArray > arrayToModify.length)
        {
            System.out.println("No element found to modify");
            return;
        }
        for (int i = 0; i < arrayToModify.length; i++)
        {
            if(i == indexOfElement)
            {
                arrayToModify[i] = elementOfAnArray;
            }

            System.out.println("Modified Array: " + i + " " +arrayToModify[i]);
        }
    }

    public static int getElementInAnArray(int index, Integer[] array)
    {
        return array[index];
    }

    public static void deleteElementInArray(Integer[] intArray, int elementIndex)
    {
        Integer[] elementRemovedArray = new Integer[intArray.length - 1];

        for (int i = 0; i < intArray.length; i++)
        {
            if(i != elementIndex)
            {
                elementRemovedArray[i] = intArray[i];
                System.out.println("elementRemovedArray Array: " + i + " " +elementRemovedArray[i]);
            }
            else {
                System.out.println("Skipping element with index: " + i);
            }
        }
    }

    public static void printArray(Integer[] scores) {
        int count = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] != null) {
                count++;
            } else {
                System.out.println("No element found at index: " + i);
            }
        }

        System.out.println("Length of array: " + scores.length);
        System.out.println("No of elements in scores array: " + count);
    }

    public static void reverseArray(Integer[] arrayToReverse) {
        String[] reversedArray = new String[arrayToReverse.length];

        int reversedArrayIndex = arrayToReverse.length;

        for (Integer element : arrayToReverse) {
            reversedArrayIndex--;

            reversedArray[reversedArrayIndex] = String.valueOf(element);
        }

        for(int j = 0; j < reversedArray.length; j++)
        {
            System.out.println("Reversed Array: " + j + " " +reversedArray[j]);
        }
    }

    /**
     * Time Complexity: O(n)
     * Space Cmplexity: O(1)
     * @param array
     */
    public static void filterTheBiggestNumber(Integer[] array) {
        int highestNumber = 0;

        for (Integer element : array) {
            if (highestNumber < element) {
                highestNumber = element;
            }
        }
        System.out.println("Biggest Number: " + highestNumber);
    }

    /**
     * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
     *
     * If target is not found in the array, return [-1, -1].
     *
     * You must write an algorithm with O(log n) runtime complexity.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [5,7,7,8,8,10], target = 8
     * Output: [3,4]
     * Example 2:
     *
     * Input: nums = [5,7,7,8,8,10], target = 6
     * Output: [-1,-1]
     * Example 3:
     *
     * Input: nums = [], target = 0
     * Output: [-1,-1]
     */


}
