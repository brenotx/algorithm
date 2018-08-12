package ArraysAndStrings.PalindromePermutation;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
     * Eliminates the empty spaces.
     * Creates a HashMap with the number of occurrences for each char.
     * Iterates over the HashMap and remove the chars withs a even occurrences.
     * If the remaining HashMap has more the one value we don't have a palindrome
     * permutation, otherwise it is a a value string input and we return true.
     *
     * COMPLEXITY:
     *      TIME: O(N)
     * @param phrase phrase to be validated
     * @return true if we have a valid palindrome permutation
     */
    static boolean isPalindromePermutation(String phrase) {
        if (phrase == null || phrase.length() == 0) return false;

        String noSpaces = phrase.replace(" ", "");

        Map<Character, Integer> charCount = new HashMap<>();

        // Creates hasmap with the count number of each chat.
        for (int i = 0; i < noSpaces.length(); i++) {
            char charAtCurrentIndex = noSpaces.charAt(i);

            if (!charCount.containsKey(charAtCurrentIndex)) {
               charCount.put(charAtCurrentIndex, 1);
            } else {
                charCount.put(charAtCurrentIndex, charCount.get(charAtCurrentIndex) + 1);
            }
        }

        Iterator<Map.Entry<Character, Integer>> iter = charCount.entrySet().iterator();

        while (iter.hasNext()) {
            Map.Entry<Character, Integer> entry = iter.next();
            if (entry.getValue() % 2 == 0) {
               iter.remove();
            }
        }


        if (charCount.keySet().size() > 1) {
            return false;
        }

        return true;
    }
}
