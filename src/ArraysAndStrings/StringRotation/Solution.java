package ArraysAndStrings.StringRotation;

/**
 *  Assume you have a method isSubstring which checks if one word is a
 *  substring of another. Given two strings, s1 and s2, write code to check
 *  if s2 is a rotation of s1 using only one call to isSubstring.
 *
 *  Example:
 *      "waterbottle" is a rotation of "erbottlewat".
 */
public class Solution {

    /**
     * Duplicate the rotated string, if the substring being searched is a different
     * rotation of the string then it will be a substring of the new string. Both
     * strings must be the same length.
     *
     * N = |str1|
     * Time: O(N)
     * Additional space: O(N)
     *
     */
    static boolean isSubstring(String s1, String s2) {
        return (s1.length() == s2.length()) &&
                ((s1 + s1).indexOf(s2) != -1);
    }
}
