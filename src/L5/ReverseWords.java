//Ex5

package L5;

public class ReverseWords {
    public ReverseWords() {
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for(String word : words) {
            String reversedWord = (new StringBuilder(word)).reverse().toString();
            reversedString.append(reversedWord).append(" ");
        }

        return reversedString.toString().trim();
    }
}
