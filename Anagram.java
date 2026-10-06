import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        char[] a = word1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] b = word2.replaceAll("\\s", "").toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println(word1 + " and " + word2 + " are Anagrams");
        } else {
            System.out.println(word1 + " and " + word2 + " are NOT Anagrams");
        }
    }
}
