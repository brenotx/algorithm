package twoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class Tests {


    @Test
    public void test1() {
        Solution solution = new Solution();
        int[] myArray = new int[]{ 2,7,11,15 };
        int[] newArray = new int[]{ 0, 1 };

        assertArrayEquals(newArray, solution.twoSum(myArray, 9));

    }
}
