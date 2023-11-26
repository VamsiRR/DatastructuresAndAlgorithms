package example.problems;

public class NumberToWords {
    private static final String[] units = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] tens = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String convertToWords(int number) {
        if (number == 1000) {
            return "onethousand";
        }

        String result = "";

        if (number >= 100) {
            result += units[number / 100] + "hundred";
            number %= 100;
            if (number > 0) {
                result += "and";
            }
        }

        if (number > 0) {
            if (number < 20) {
                result += units[number];
            } else {
                result += tens[number / 10] + units[number % 10];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 1000; i++) {
            String words = convertToWords(i);
            sum += words.length();
        }

        System.out.println("The total number of letters used is: " + sum);
    }
}
