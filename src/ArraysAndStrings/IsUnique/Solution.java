package ArraysAndStrings.IsUnique;

/*
* Implement an algorithm to determine if a string has all unique characters.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * Returns true if the giving string has only unique characters, otherwise return false.
     *
     * Complexity:
     *      Time: O(n)
     *      Space: 0(1)
     *
     * @param s
     * @return boolean
     */
    static boolean isUnique(String s) {
        if (s == null) {
            return false;
        }

        // We are considering only the ASCII 128 normal characters.
        // Use 256 if you want to consider the extended ASCII characters.
        boolean[] char_set = new boolean[128];

        for (int i = 0; i < s.length(); i++) {
            if (char_set[s.charAt(i)]) return false;
            char_set[s.charAt(i)] = true;
        }

        return true;
    }

}
