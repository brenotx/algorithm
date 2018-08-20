package ArraysAndStrings.RotateMatrix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class Tests {

    @Test
    void testRotateMatrix() {
        // 2x2
        int[][] matrix2x2 = {{ 1, 2 },
                             { 4, 3 }};

        int[][] rotate2x2 = {{ 4, 1 },
                             { 3, 2 }};

        int[][] x2 = new int[2][2];
        x2 = Solution.rotateMatrix(matrix2x2);

        assertArrayEquals(x2, rotate2x2);

        // 3x3
        int[][] matrix3x3 = {{ 1, 2, 3},
                             { 8, 9, 4},
                             { 7, 6, 5}};

        int[][] rotate3x3 = {{ 7, 8, 1},
                             { 6, 9, 2},
                             { 5, 4, 3}};


        int[][] x3 = new int[3][3];
        x3 = Solution.rotateMatrix(matrix3x3);

        assertArrayEquals(x3, rotate3x3);


        // 4x4
        int[][] matrix4x4 = {{1, 2, 3, 4},
                             {12, 13, 14, 5},
                             {11, 16, 15, 6},
                             {10, 9, 8, 7}};

        int[][] rotate4x4 = {{ 10, 11, 12, 1},
                             { 9, 16, 13, 2},
                             { 8, 15, 14, 3},
                             { 7, 6, 5, 4}};


        int[][] x4 = new int[4][4];
        x4 = Solution.rotateMatrix(matrix4x4);

        assertArrayEquals(x4, rotate4x4);
    }
}
