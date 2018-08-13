package ArraysAndStrings.OneAway;

/**
 * Problem: There are three types of edits that can be performed on
 * strings: insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one
 * edit (or zero edits) away.
 *
 * EXAMPLE
 *      pale, ple -> true
 *      pales, pale -> true
 *      pale, bale -> true
 *      pale, bake -> false
 */
public class Solution {

    /**
     * Scan through both strings's at the same time, when a difference is
     * encountered:
     *      - if this is the first edit:
     *          - if strings are the same length then consider it a replacement
     *          - if strings are different lengths then consider it a insert from the small string
     *      - if this is the second edit then return false
     *
     * N = |str|
     * Time: O(N)
     * Additional space: O(1)
     */
    static boolean isOneAway(String s1, String s2) {
        if (s1 == null || s2 == null) return false;

        if (s1.length() == s2.length()) {
            return oneEditReplace(s1, s2);
        } else if (s1.length() + 1 == s2.length()) {
            return onEditInsert(s1, s2);
        } else if (s1.length() - 1 == s2.length()) {
            return onEditInsert(s2, s1);
        }
        return false;
    }

    private static boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    private  static boolean onEditInsert(String s1, String s2) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < s1.length() && index2 < s2.length()) {
            if (s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }
}
