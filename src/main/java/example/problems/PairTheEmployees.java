package example.problems;

import java.util.ArrayList;
import java.util.List;

public class PairTheEmployees {

    public static void main(String[] args) {
        String[] employees = new String[]{"vamsi", "prasanna", "vagmi", "Hymi", "jhon", "amaya", "Nani"};

        List<List<String>> pairs = new ArrayList<>();

        List<String> pair = null;

        int len = employees.length - 1; //If even that means we have odd elements in the list. We need to prevent that being added to the pair.

        for (int i = 0; i < employees.length; i++) {
            if (i % 2 == 0)
            {
                if(pairExist(employees, i))
                {
                    pair = new ArrayList<>();
                    pair.add(employees[i]);
                    pairs.add(pair);
                }

            }
            else
            {
                pair.add(employees[i]);
            }
        }

        pairs.forEach(System.out::println);

    }

    private static boolean pairExist(String[] arr, int id)
    {
        if(arr[id] != null)
        {
            try
            {
                return arr[id + 1] != null;
            }
            catch (Exception e)
            {
                System.out.println("No pair found for " + arr[id] );
            }
        }
        return false;
    }
}
