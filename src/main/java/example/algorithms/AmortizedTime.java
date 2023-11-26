package example.algorithms;

import java.util.ArrayList;

public class AmortizedTime {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Perform a series of operations (additions)
        for (int i = 0; i < 10; i++) {
            dynamicArray.add(i);
            printAmortizedTime(dynamicArray);
        }

        dynamicArray.add(20);
        printAmortizedTime(dynamicArray);

        dynamicArray.add(22);
        dynamicArray.add(22);
        dynamicArray.add(22);
        dynamicArray.add(22);
        dynamicArray.add(22);


        printAmortizedTime(dynamicArray);
    }

    // A method to get the capacity of the ArrayList using reflection
    private static int getCapacity(ArrayList<Integer> array) {
        try {
            var elementDataField = ArrayList.class.getDeclaredField("elementData");
            elementDataField.setAccessible(true);
            return ((Object[]) elementDataField.get(array)).length;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            return -1;
        }
    }

    // A method to print the size and capacity of the ArrayList
    private static void printAmortizedTime(ArrayList<Integer> array) {
        System.out.println("Size: " + array.size() + ", Capacity: " + getCapacity(array));
    }

}
