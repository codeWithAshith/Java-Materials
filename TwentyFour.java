import java.util.ArrayList;
import java.util.Arrays;

public class TwentyFour {
    public static void main(String[] args) {
        int arr[] = {1, 8, 3, 0, 2, 0, 1, 10, 13, 0};

        ArrayList<Integer> numbers = new ArrayList<>();
        int zeroCount = 0;
        for (int number : arr) {
            if (number == 0)
                zeroCount++;
            else
                numbers.add(number);
        }

        for (int i = 0; i < zeroCount; i++) {
            numbers.add(0);
        }

        System.out.println(numbers);
    }
}
