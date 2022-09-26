public class TwentyFive {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 7, 3, 7};
        int max = findMax(arr);
        int secondMax = findSecondMax(arr, max);

        int maxPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                maxPos = i;
                break;
            }
        }

        int secondMaxPos = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == secondMax) {
                secondMaxPos = i;
                break;
            }
        }

        int a = secondMaxPos - maxPos;

        // area
        System.out.println(a * a);

    }

    private static int findSecondMax(int[] arr, int max) {
        int minMax = 0;
        for (int i : arr) {
            if (i < max)
                minMax = Math.max(minMax, i);
        }
        return minMax;
    }

    private static int findMax(int[] arr) {
        int max = 0;
        for (int j : arr) {
            max = Math.max(max, j);
        }
        return max;
    }

}
