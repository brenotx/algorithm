package ArraysAndStrings.OneAway;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    // Case 1: Wrong args
    @Test
    void testWrongArgs() {
        assertEquals(
                Solution.isOneAway(null, null),
                false,
                "Should have valid args");
    }

    /** CASE 2: Inserting a character
     *      start: "ire", "fire"
     *      end: "fir", "fire"
     *      middle: "fie", "fire"
     *      error: "fi", "bir"
     * The second string should be bigger than the initial one.
     */
    @Test
    void testInsert() {
        assertEquals(Solution.isOneAway("ire", "fire"), true, "insert at start");
        assertEquals(Solution.isOneAway("fir", "fire"), true, "insert at end");
        assertEquals(Solution.isOneAway("fie", "fire"), true, "insert at middle");
        assertEquals(Solution.isOneAway("fi", "bir"), false, "error insert at start");
        assertEquals(Solution.isOneAway("fi", "bir"), false, "error insert at end");
        assertEquals(Solution.isOneAway("fie", "ftge"), false, "error insert at middle");
    }

    /** CASE 3: Removing a character
     *      start: "fire", "ire"
     *      end: "fire", "fir"
     *      middle: "fire", "fie"
     *      error: "fire", "fig"
     */
    @Test
    void testRemoving() {
        assertEquals(Solution.isOneAway("fire", "ire"), true, "remove at start");
        assertEquals(Solution.isOneAway("fire", "fir"), true, "remove at end");
        assertEquals(Solution.isOneAway("fire", "fie"), true, "remove at middle");
        assertEquals(Solution.isOneAway("fire", "ird"), false, "error remove at start");
        assertEquals(Solution.isOneAway("fire", "fgr"), false, "error remove at end");
        assertEquals(Solution.isOneAway("fire", "fge"), false, "error remove at middle");
    }

    /** CASE 4: Replacing a character
     *      start: "fire", "bire"
     *      end: "fire", "fird"
     *      middle: "fire", "fice"
     *      error: "fi", "bir"
     * The second string should be bigger than the initial one.
     */
    @Test
    void testReplace() {
        assertEquals(Solution.isOneAway("fire", "bire"), true, "replace at start");
        assertEquals(Solution.isOneAway("fire", "fird"), true, "replace at end");
        assertEquals(Solution.isOneAway("fire", "fice"), true, "replace at middle");
        assertEquals(Solution.isOneAway("fire", "bide"), false, "error replace at start");
        assertEquals(Solution.isOneAway("fire", "fidt"), false, "error replace at end");
        assertEquals(Solution.isOneAway("fire", "fgge"), false, "error replace at middle");
    }
}
