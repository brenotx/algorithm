package ArraysAndStrings.StringCompression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    void testCompress() {
        assertEquals(Solution.compress("a"), "a", "a -> a");
        assertEquals(Solution.compress("aa"), "aa", "aa -> aa");
        assertEquals(Solution.compress("ab"), "ab", "ab -> ab");
        assertEquals(Solution.compress("aaa"), "a3", "aaa -> a3");
        assertEquals(Solution.compress("aabb"), "aabb", "aabb -> aabb");
        assertEquals(Solution.compress("aaabb"), "a3b2", "aaabb -> a3b2");
        assertEquals(Solution.compress("aabcccccaaa"), "a2b1c5a3", "aabcccccaaa -> a2b1c5a3");


    }

    /**
     * CASES:"
     *      a -> a1
     *      ab -> a1b1
     *      aa -> a2
     *      aabb -> a2b2
     *      aaaabbbcc -> a4b3c2
     *
     *
     *      a : len 1 char 1
     *      aa : len 2 char 2
     *      aaa : len 3 char 3
     *
     *      Only worth compress when we have chars with tree or more repeated chars.
     *
     *      aabb: len 4 -> a2b2 len 4
     *      aaccbb: len 6 -> a2c2b2 len 6
     *      aaacc: len 5 -> a3c2 len 4
     */
}
