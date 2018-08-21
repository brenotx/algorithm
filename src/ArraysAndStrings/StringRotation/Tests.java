package ArraysAndStrings.StringRotation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    void testIsSubstring() {
        assertEquals(Solution.isSubstring("ABCD", "CDAB"), true);
        assertEquals(Solution.isSubstring("waterbottle", "erbottlewat"), true);
        assertEquals(Solution.isSubstring("waterbottle", "erbofffewat"), false);
    }
}
