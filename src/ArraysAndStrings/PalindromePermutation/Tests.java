package ArraysAndStrings.PalindromePermutation;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Tests {


    @Test
    void testNullInput() {
        assertEquals(
                Solution.isPalindromePermutation(null),
                false,
                "Method should handle null input."
        );
    }

    @Test
    void testSingleCharInput() {
        assertEquals(
            Solution.isPalindromePermutation("A"),
            true,
            "Single char input should return true"
        );
    }

    @Test
    void testMultipleValidInputs() {
        List<String> strings = Arrays.asList("AA", "ABB", "CCC", "CAC", "C C", "rediv ider", "dei fied", "civic", "radar", "lev el", "rotor", "kayak", "reviver", "racecar", "redder", "madam");
        strings.stream().forEach(u -> {
            assertEquals(
                    Solution.isPalindromePermutation(u),
                    true,
                    u + "=> Should return true"
            );
        });
    }

    @Test
    void testMultipleInvalidInputs() {
        List<String> strings = Arrays.asList("Atd", "fidl", "df ig", "yhdh");
        strings.stream().forEach(u -> {
            assertEquals(
                    Solution.isPalindromePermutation(u),
                    false,
                    u + "=> Should return true"
            );
        });
    }
}
