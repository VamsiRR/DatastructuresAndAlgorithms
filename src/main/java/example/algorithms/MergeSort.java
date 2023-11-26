package example.algorithms;

public class MergeSort {

    public static void main(String[] args) {

        int[] array = {2, 3, 5, 6, 8, 4, 9, 10};

        //System.out.println("Before sort: ");
        //printArray(array);


        mergeSort(array, 0, array.length - 1);

        //System.out.println("After sort: ");
        //printArray(array);

    }

    private static void merge(int[] intArray, int left, int mid, int right) {
        //printArray(intArray);
        //System.out.println("left = " + left + ", mid = " + ", right = " + right);
        int leftArraySize = mid - left + 1;
        int rightArraySize = right - mid;

        //create temporary arrays for both halves
        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];

        //copy data to the temporary arrays
        System.arraycopy(intArray, left, leftArray, 0, leftArraySize);
        System.arraycopy(intArray, mid + 1, rightArray, 0, rightArraySize);

        //merge the two arrays

        //Initial index of two arrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = left;

        while (i < leftArraySize && j < rightArraySize) {
            if (leftArray[i] <= rightArray[j]) {
                intArray[k] = leftArray[i];
                i++;
            } else {
                intArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[], if there are any
        while (i < leftArraySize) {
            intArray[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[], if there are any
        while (j < rightArraySize) {
            intArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    private static void mergeSort(int[] intArray, int left, int right) {
        /**
         *
         * [2, 3, 5, 6, 8, 4, 9, 10];
         *  .
         *  .
         * [2, 3, 5, 6] [8, 4, 9, 10]
         *  .
         *  .
         * [2, 3] [5, 6] [8, 4] [9,10]
         *
         */

        if (left < right) {
            int mid = left + (right - left) / 2;

            System.out.println("left = " + left + ", mid = " + mid + ", right = " + right);

            // sort first half - from left to mid of the array
            mergeSort(intArray, left, mid);

            //sort second half of array - from mid to right of the array
            mergeSort(intArray, mid + 1, right);

            //Merge the sorted halves
            merge(intArray, left, mid, right);
        }

    }

    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);

            // Print comma and space for all elements except the last one
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
