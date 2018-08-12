package ArraysAndStrings.PalindromePermutation;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 *    Problem: Given a string, write a function to check if it is a permutation
 *    of a palindrome. A palindrome is a word or phrase that is the same
 *    forwards and backwards. A permutation is a rearrangement of letters.
 *    The palindrome does not need to be limited to just dictionary words.
 *
 *    EXAMPLE
 *          Input: Tact Coa
 *          Output: True (permutations: "taco cat". "atco cta". etc.)
 */
public class Solution {

    static boolean isPalindromePermutation(String s) {
        if (s == null || s.length() == 0) return false;

        String noSpaces = s.replace(" ", "");

        Map<Character, Integer> charCount = new Hashtable<>();


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
