package ArraysAndStrings.IsUnique;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    void testIsUnique() {
        assertEquals(Solution.isUnique(null), false);

        assertEquals(Solution.isUnique("A"), true);

        assertEquals(Solution.isUnique("Breno"), true, "Breno");
        assertEquals(Solution.isUnique("aa"), false, "aa");
        assertEquals(Solution.isUnique("ab"), true, "ab");
        assertEquals(Solution.isUnique("acc"), false, "acc");
        assertEquals(Solution.isUnique("cdaef"), true, "cdaef");

    }
}

