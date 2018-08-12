package ArraysAndStrings.URLify;


/**
 *
 * Problem: Write a method to replace all spaces in a string with '%20 You may
 * assume that the string has sufficient space at the end to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: if
 * implementing in Java, please use a character array so that you can perform
 * this operation in place.) EXAMPLE Input: "Mr John Smith     ", 13 Output:
 * "Mr%20John%20Smith"
 *
 * Solution: Start from the end and work backwards
 *
 */
public class Solution {

    static String URLify(String s1, int len) {
        if (s1 == null) throw new IllegalArgumentException();

        return s1.trim().replace(" ", "%20");
    }
}
