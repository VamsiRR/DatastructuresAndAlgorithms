package example.problems;

public class RotateAnArray
{
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};


        rotateArrayLeft(arr, 2);

        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }

    private static void rotateArrayRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Adjust for rotations more than the length of the array

        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
    }

    //{1, 2, 3, 4, 5}; ---> [3, 4, 5, 1, 2],
    private static void rotateArrayLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Adjust for rotations more than the length of the array

        reverseArray(arr, n-4, k-1 );
        reverseArray(arr, 0, k - 2);
        reverseArray(arr, k - 2 , 0);
    }

    // Function to reverse the elements of an array in a given range
    private static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
