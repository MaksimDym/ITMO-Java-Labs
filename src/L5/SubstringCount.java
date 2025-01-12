//Ex4

package L5;

public class SubstringCount {
    public SubstringCount() {
    }

    public static int countOccurrences(String str, String subStr) {
        int count = 0;

        int fromIndex;
        for(fromIndex = 0; (fromIndex = str.indexOf(subStr, fromIndex)) != -1; fromIndex += subStr.length()) {
            ++count;
        }

        return count;
    }
}