package example.problems;

public class Test1 {
    public static void main(String[] args) {
        /**
         * If the numbers to are written out in words: one, two, three, four, five, then there are letters used in total.
         *
         * If all the numbers from one to one thousand (1000) inclusive were written out in words, how many letters would be used?
         */

        char[] num = "1000".toCharArray();

//        for (char c : num)
//        {
//            System.out.println(c);
//        }
//
//        System.out.println("length: " + num.length);
//
//        System.out.println(num[0] - '0');

        convertToStringAndGetLength(num);


    }

    private static void convertToStringAndGetLength(char[] num) {
        String[] singleDigits = new String[]{"one", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        String[] doubleDigits = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String[] tenMultiples = new String[]{"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety", "Eighteen", "Nineteen"};

        String[] tenPower = new String[]{"Hundred", "Thousand"};

        int len = num.length;

        if (len == 1) {
            System.out.println(singleDigits[num[0] - '1']);
        }

        int x = 0;

        //2000
        while (x < len) {
            if (len >= 3) {
                if (num[x] - '0' != 0) {
                    System.out.print(singleDigits[num[x] - '1'] + " ");
                    System.out.print(tenPower[len - 3] + " ");
                }
                --len;
            }
            else
            {

                if (num[x] - '0' == 1) {
                    int sum
                            = num[x] - '0' + num[x + 1] - '0';
                    System.out.println(doubleDigits[sum]);
                    return;
                } else if (num[x] - '0' == 2
                        && num[x + 1] - '0' == 0) {
                    System.out.println("twenty");
                    return;
                } else {
                    int i = (num[x] - '0');
                    if (i > 0)
                        System.out.print(tenMultiples[i] + " ");
                    else
                        System.out.print("");
                    ++x;
                    if (num[x] - '0' != 0)
                        System.out.println(singleDigits[num[x] - '0']);
                }
            }
            ++x;
        }

    }
}
