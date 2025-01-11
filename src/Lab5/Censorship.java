//Ex3

package Lab5;

public class Censorship {
    public static String censorWord(String text) {

        return text.replaceAll("бяка", "[вырезано цензурой]");
    }

}
