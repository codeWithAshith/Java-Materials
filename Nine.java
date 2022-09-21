public class Nine {
    public static void main(String[] args) {
        int array[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        spiralMatrixPrint(array);
    }

    private static void spiralMatrixPrint(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Defining the boundaries of the matrix.
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        // Defining the direction in which the array is to be traversed.
        // 1 -> towards right
        // 2 -> towards down
        // 3 -> towards left
        // 4 -> towards top
        int dir = 1;
        while (top <= bottom && left <= right) {

            if (dir == 1) {
                // moving left->right
                for (int i = left; i <= right; ++i) {
                    System.out.print(arr[top][i] + " ");
                }
                // Since we have traversed the whole first
                // row, move down to the next row.
                top += 1;
                dir = 2;
            } else if (dir == 2) {
                // moving top->bottom
                for (int i = top; i <= bottom; ++i) {
                    System.out.print(arr[i][right] + " ");
                }
                // Since we have traversed the whole last
                // column, move left to the previous column.
                right -= 1;
                dir = 3;
            } else if (dir == 3) {
                // moving right->left
                for (int i = right; i >= left; --i) {
                    System.out.print(arr[bottom][i] + " ");
                }
                // Since we have traversed the whole last
                // row, move up to the previous row.
                bottom -= 1;
                dir = 4;
            } else if (dir == 4) {
                // moving bottom->up
                for (int i = bottom; i >= top; --i) {
                    System.out.print(arr[i][left] + " ");
                }
                // Since we have traversed the whole first
                // col, move right to the next column.
                left += 1;
                dir = 1;
            }
        }
    }
}
