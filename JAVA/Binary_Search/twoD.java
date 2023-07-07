// BINARY SEARCH IN A 2D MATRIX SORTED BOTH COLUMN WISE AND ROW WISE

import java.util.Arrays;

public class twoD {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 49 },
                { 32, 33, 39, 50 }
        };
        System.out.println(Arrays.toString(search(arr, 20)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[] { r, c };
            }
            if (matrix[r][c] > target) {
                c--;
            } else {
                r++;
            }
        }
        return new int[] { -1, -1 };
    }
}
