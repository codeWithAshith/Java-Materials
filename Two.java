import java.util.ArrayList;

public class Two {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 12, 1, 9, 10, 0, 2};
        int[] validSubSet = {1, 3, 5, 9};
        int[] inValidSubSet = {6, 3, 8};

        boolean isValid = isValidSubset(array, inValidSubSet);
        System.out.println(isValid);
    }

    private static boolean isValidSubset(int[] array, int[] subset) {
        ArrayList<Integer> validSubset = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < subset.length; j++) {
                if (array[i]== subset[j]){
                    validSubset.add(subset[j]);
                    break;
                }
            }
        }
        return validSubset.size() == subset.length;
    }
}
