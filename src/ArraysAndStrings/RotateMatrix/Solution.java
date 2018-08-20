package ArraysAndStrings.RotateMatrix;

/**
 * Problem: Given an image represented by an NxN matrix, where
 * each pixel in the image is 4 bytes, write a method
 * to rotate the image by 90 degrees.
 *
 *  [  1,  2,  3, 4 ]       [ 10, 11, 12, 1 ]
 *  [ 12, 13, 14, 5 ]       [  9, 16, 13, 2 ]
 *  [ 11, 16, 15, 6 ]  ->   [  8, 15, 14, 3 ]
 *  [ 10,  9,  8, 7 ]       [  7,  6,  5, 4 ]
 *
 */
public class Solution {

    static int[][] rotateMatrix(int[][] matrix) {

        if (matrix.length == 0 || matrix.length != matrix[0].length)
            throw new IllegalArgumentException("Invalid matrix");

        int n = matrix.length;

        // You can think of layer as 'layer row' because
        // we iterate only on the first row of each layer.
        for (int layer = 0; layer < n / 2; layer++) {

            int first = layer;
            int last = n - 1 - layer;

            // Iterate over the current layer row
            for (int i = layer; i < last; i++) {

                // Offset in case we are not in the first layer.
                int offset = i - first;

                // [top][left]
                int top = matrix[layer][i];

                // [top][left] <- [bottom][left]
                matrix[first][i] = matrix[last-offset][first];

                // [bottom][left] <- [bottom][right]
                matrix[last-offset][first] = matrix[last][last - offset];

                // [bottom][right] <- [top][right]
                matrix[last][last - offset] = matrix[i][last];

                // [top][right]
                matrix[i][last] = top;

            }
        }

        return matrix;
    }
}
