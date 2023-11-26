package example.algorithms;

public class BinarySearch {

    private static int[] binarySearch(int[] intArray, int target) {
        int left = 0;
        int right = intArray.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (intArray[mid] == target) {
                return new int[]{mid};
            } else if (intArray[mid] < target) {
                left = mid + 1; //Search in right half
            } else {
                right = mid - 1; //seraph in left half
            }
        }

        return new int[]{-1};
    }
}
