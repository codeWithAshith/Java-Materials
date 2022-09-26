import java.util.Arrays;

public class TwentyThree {
    public static void main(String[] args) {
//        int[][] arr = {
//                {1, 0, 1},
//                {1, 1, 1},
//                {1, 0, 1}
//        };
        int[][] arr = {
                {1, 0, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        int[][] zeroArr = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                zeroArr[i][j] = 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    if (i > 0) {
                        if (arr[i][j] == 0 && arr[i - 1][j] != 0) {
                            for (int k = 0; k < arr[0].length; k++) {
                                zeroArr[i][k] = 0;
                                zeroArr[k][j] = 0;
                            }
                        } else {
                            zeroArr[i][j] = arr[i][j];
                        }
                    } else {
                        for (int k = 0; k < arr[0].length; k++) {
                            zeroArr[i][k] = 0;
                            zeroArr[k][j] = 0;
                        }
                    }
                }
            }
        }
        for (int m = 0; m < zeroArr.length; m++)
            System.out.println(Arrays.toString(zeroArr[m]));
    }
}
