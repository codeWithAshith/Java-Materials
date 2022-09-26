import java.util.Arrays;

public class TwentyTwo {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 9, 21, 43, 24};

        int[] waveForm = convertToWaveForm(arr);

        System.out.println(Arrays.toString(waveForm));
    }

    private static int[] convertToWaveForm(int[] arr) {
        Arrays.sort(arr);
        int waveArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i = i + 2) {
            if (i + 1 != arr.length) {
                waveArr[i] = arr[i + 1];
                waveArr[i + 1] = arr[i];
            } else {
                waveArr[i] = arr[i];
            }
        }
        return waveArr;
    }
}
