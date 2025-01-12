package L5;

public class LongestWordFinder {
    public LongestWordFinder() {
    }

    public static String findLongestWord(String text) {
        String[] words = text.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split(" +");
        String longestWord = "";

        for(String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
