package ArraysAndStrings.ZeroMatrix;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    public void testZeroMatrix() {
        int[][] matrix2x2 = {{ 0, 2 },
                             { 4, 3 }};

        int[][] zero2x2 = {{ 0, 0 },
                           { 0, 3 }};

        int[][] x2 = new int[2][2];
        x2 = Solution.setZeroMatrix(matrix2x2);

//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(x2[i][j]);
//            }
//            System.out.println();
//        }

        assertArrayEquals(x2, zero2x2);


        // 4x4
        int[][] matrix4x4 = {{1, 2, 3, 4},
                             {2, 0, 4, 5},
                             {1, 6, 5, 0},
                             {0, 9, 8, 7}};

        int[][] zero4x4 = {{0, 0, 3, 0},
                           {0, 0, 0, 0},
                           {0, 0, 0, 0},
                           {0, 0, 0, 0}};


        int[][] x4 = new int[4][4];
        x4 = Solution.setZeroMatrix(matrix4x4);

        assertArrayEquals(x4, zero4x4);
    }
}
