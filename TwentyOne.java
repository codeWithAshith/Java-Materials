public class TwentyOne {
    public static void main(String[] args) {
        String roman = "IV";

        int number = romanToInteger(roman);

        System.out.println("Number of Roman numeral " + roman + " is " + number);

    }

    private static int romanToInteger(String roman) {
        int number = 0;
        for (int i = roman.length(); i > 0; i--) {
            int value = getValue(roman.charAt(i - 1));
            int previousValue = 0;
            if (i != 1) {
                previousValue = getValue(roman.charAt(i - 2));
            }

            if (previousValue >= value || previousValue == 0) {
                number = number + value;
            } else {
                number = number - value;
            }

        }
        if (number < 0)
            number = -1 * number;

        return number;

    }

    private static int getValue(char symbol) {
        if (symbol == 'I' || symbol == 'i')
            return 1;
        if (symbol == 'V' || symbol == 'v')
            return 5;
        if (symbol == 'X' || symbol == 'x')
            return 10;
        if (symbol == 'L' || symbol == 'l')
            return 50;
        if (symbol == 'C' || symbol == 'c')
            return 100;
        if (symbol == 'D' || symbol == 'd')
            return 500;
        if (symbol == 'M' || symbol == 'm')
            return 1000;
        return -1;
    }

}
