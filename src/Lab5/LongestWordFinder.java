//Ex1

package Lab5;

public class LongestWordFinder {
    public static String findLongestWord(String text) {

        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\s+");
        String longestWord = "";

        for (String word : words) {

            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
