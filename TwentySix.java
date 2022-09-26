import java.util.ArrayList;
import java.util.Arrays;

public class TwentySix {
    public static void main(String[] args) {
        int[] array = {4, 7, 9, 9, 10, 11, 11};
        ArrayList<Integer> originalArray = new ArrayList<>();

        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (i == 0) {
                originalArray.add(array[i]);
            }
            if (array[i] != array[i + 1]) {
                originalArray.add(array[i + 1]);
            }
        }

        System.out.println(originalArray.size());

    }
}
