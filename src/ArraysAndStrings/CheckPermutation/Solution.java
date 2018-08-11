package ArraysAndStrings.CheckPermutation;

/*
*  Given two strings, write a method to decide if one is a permutation of the
*  other.
*/

public class Solution {

    static boolean checkPermutation(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (!s2.contains(String.valueOf(s1.charAt(i)))) return false;
        }

        return true;
    }
}
