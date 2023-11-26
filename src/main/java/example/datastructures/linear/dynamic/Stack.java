package example.datastructures.linear.dynamic;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Stack {


    public static void main(String[] args) {

        //Add element
        java.util.Stack<Integer> intStack = new java.util.Stack<>();

//        intStack.push(5);
//        intStack.push(89);
//        intStack.push(58);
//        intStack.push(6);
//        intStack.push(7);

        //Add multiple elements into a stack.

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Order of elements in the list");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println("Index: " + i + " Value: " + intList.get(i));
        }

        intStack.addAll(intList);

        intStack.pop();

        System.out.println("Order of elements in the stack");
        for (int i = 0; i < intStack.size(); i++) {
            System.out.println("Index: " + i + " Value: " + intStack.get(i));
        }


        System.out.println("element position in stack: " + intStack.search(1));


//        //Delete element
//        intStack.pop();
//
//        //remove specified element
//        intStack.removeElement(6);
//
//        System.out.println(intStack.search(6));


    }
}
