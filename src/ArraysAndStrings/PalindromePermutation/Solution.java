package ArraysAndStrings.PalindromePermutation;


import java.util.*;

/**
 *    Problem: Given a string, write a function to check if it is a permutation
 *    of a palindrome. A palindrome is a word or phrase that is the same
 *    forwards and backwards. A permutation is a rearrangement of letters.
 *    The palindrome does not need to be limited to just dictionary words.
 *
 *    CASES:
 *          EVEN inputs length string: AA BBCC
 *          ODD input length string: ACA CIVIC
 *
 *    EXAMPLE
 *          Input: Tact Coa
 *          Output: True (permutations: "taco cat". "atco cta". etc.)
 */
public class Solution {

    /**
     * Go through characters in string and set flag to indicate if there is an
     * odd number of that character. If there is more than one character with an
     * odd number of occurrences then it cannot be a palindrome.
     *
     * N = |str|
     * Time: O(N)
     * Additional space: O(N)
     *
     * @param  phrase String to check as a character array
     * @return        True if input string is a permutation of a palindrome (ignoring spaces), otherwise false
     */
    static boolean isPalindromePermutation(String phrase) {
        if (phrase == null) return false;

        Set<Character> chars = new HashSet();

        for (char c : phrase.toCharArray()) {
            if (c != ' ') {
                if (chars.contains(c)) {
                    chars.remove(c);
                } else {
                    chars.add(c);
                }
            }
        }
        return chars.size() <= 1;
    }
}
