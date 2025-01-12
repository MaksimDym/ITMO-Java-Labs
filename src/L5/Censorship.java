//Ex3

package L5;

public class Censorship {
    public Censorship() {
    }

    public static String censorWord(String text) {
        return text.replaceAll("бяка", "[вырезано цензурой]");
    }
}
