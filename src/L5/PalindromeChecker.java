//Ex2

package L5;

public class PalindromeChecker {
    public PalindromeChecker() {
    }

    public static boolean isPalindrome(String word) {
        String cleanedWord = word.replaceAll("[^a-zA-Zа-яА-Я0-9]", "").toLowerCase();
        String reversedWord = (new StringBuilder(cleanedWord)).reverse().toString();
        return cleanedWord.equals(reversedWord);
    }
}
