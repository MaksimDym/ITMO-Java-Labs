//Ex4

package Lab5;

public class SubstringCount {

    public static int countOccurrences(String str, String subStr) {
        int count = 0;
        int fromIndex = 0;


        while ((fromIndex = str.indexOf(subStr, fromIndex)) != -1) {
            count++;
            fromIndex += subStr.length();
        }

        return count;
    }

}
