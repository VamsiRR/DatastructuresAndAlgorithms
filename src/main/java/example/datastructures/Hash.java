package example.datastructures;

public class Hash {

    public static void main(String[] args) {

        String[] names_array = addElementToHashTable("abc");

        for (int i = 0; i < names_array.length; i ++)
        {
            if(names_array[i] != null)
            {
                System.out.println("Index: " + i + " element: " + names_array[i]);
            }
        }
    }

    public static String[] addElementToHashTable(String element) {
        String[] array = new String[10];

        int index = hashFunction(array.length, element);
        array[index] = element;
        return array;
    }

    private static int hashFunction(int arraySize, String key) {

        int asciiValue = 0;

        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);

            asciiValue += (int) c;
        }

        System.out.println("ASCII value of the key: " + asciiValue);

        return asciiValue % arraySize;
    }
}
