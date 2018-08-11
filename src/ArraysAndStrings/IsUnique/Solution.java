package ArraysAndStrings.IsUnique;

/*
* Implement an algorithm to determine if a string has all unique characters.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {

    static boolean isUnique(String s) {
        if (s == null) {
            return false;
        }

        List<String> chars = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (chars.contains(s.substring(i, i + 1))) {
                return false;
            }
            chars.add(s.substring(i, i + 1));
        }

        return true;
    }

}
