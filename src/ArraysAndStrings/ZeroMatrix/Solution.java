package ArraysAndStrings.ZeroMatrix;

/**
 *  Write an algorithm such that if an element in an MxN matrix is 0, its
 *  entire row and column are set to O.
 */
public class Solution {

    static int[][] setZeroMatrix(int[][] matrix) {

        if (matrix.length == 0 || matrix.length != matrix[0].length)
            throw new IllegalArgumentException("Invalid matrix");

        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        // Set row zeros
        for (int i = 0; i < row.length; i++) {
            if (row[i]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set column zeros
        for (int i = 0; i < column.length; i++) {
            if (column[i]) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }

        return matrix;
    }
}
