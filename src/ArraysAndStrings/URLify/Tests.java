package ArraysAndStrings.URLify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Tests {

    @Test
    void testURLify() {
        try {
            Solution.URLify(null, 0);
            fail("should throw exception");
        } catch (IllegalArgumentException e) {};

        assertEquals(Solution.URLify("A B  ", 5), "A%20B", "TEST01");
        assertEquals(Solution.URLify("Mr John Smith ", 13), "Mr%20John%20Smith" );
    }

}
