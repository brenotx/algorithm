package ArraysAndStrings.StringCompression;


/**
 * Problem: Implement a method to perform basic string compression using the
 * counts of repeated characters. For example, the string aabcccccaaa would
 * become a2b1c5a3. If the "compressed" string would not become smaller than
 * the original string, your method should return the original string. You can
 * assume the string has only uppercase and lowercase letters (a - z).
 */
public class Solution {

    /**
     * Takes an input string and counts contiguous sequences of the same character
     * and replaces them with XC (X = count, C = character).
     *
     * @param str
     * @return
     */
    static String compress(String str) {

        int strLen = str.length();

        if (strLen < 3) return str;

        int currentCharCount = 1;
        Character currentChar = null;
        String compressedStr = "";

        for (int i = 0; i < strLen; i++) {
            if (currentChar == null) {
                currentChar = str.charAt(i);
            }
            if (str.length() > i + 1 && str.charAt(i) == str.charAt(i + 1)) {
                currentCharCount++;
            } else {
                compressedStr = compressedStr.concat(currentChar.toString()).concat(String.valueOf(currentCharCount));
                currentChar = null;
                currentCharCount = 1;
            }
        }

        if (str.length() <= compressedStr.length()) return str;

        return compressedStr;
    }
}
