package ArraysAndStrings.CheckPermutation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    void testCheckPermutation() {
        assertEquals(Solution.checkPermutation(null, null), false);
        assertEquals(Solution.checkPermutation("breno", "bren"), false, "test1");
        assertEquals(Solution.checkPermutation("breno", "nobre"), true, "test2");
        assertEquals(Solution.checkPermutation("breno", "erica"), false, "test3");
        assertEquals(Solution.checkPermutation("BRENO", "breno"), false, "test4");
        assertEquals(Solution.checkPermutation("asdf", "asgh"), false, "test5");
        assertEquals(Solution.checkPermutation("asdf", "fdsa"), true, "test6");
        assertEquals(Solution.checkPermutation("", ""), true, "test7");
        assertEquals(Solution.checkPermutation("", " "), false, "test8");
    }
}
