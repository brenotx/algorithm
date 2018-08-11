package ArraysAndStrings.URLify;

public class Solution {

    static String URLify(String s1, int len) {
        if (s1 == null) throw new IllegalArgumentException();

        return s1.trim().replace(" ", "%20");
    }
}
