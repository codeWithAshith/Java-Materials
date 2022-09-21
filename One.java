import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array elements are: ");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }

        System.out.print("Enter the sum of array elements to check: ");
        int sum = scanner.nextInt();

        boolean isPresent = sumOfArray(array, sum);
        if (isPresent)
            System.out.println("Yes, The given sum is possible with the provided array");
        else
            System.out.println("No, THe given sum is not possible with the given array");
    }

    private static boolean sumOfArray(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    if (sum == array[i] + array[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
