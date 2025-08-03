package leetCode75;

public class mergeAlternately {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int len1 = word1.length();
        int len2 = word2.length();

        while (i < len1 || i < len2) {
            if (i < len1) sb.append(word1.charAt(i));
            if (i < len2) sb.append(word2.charAt(i));
            i++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));   // apbqcr
        System.out.println(mergeAlternately("ab", "pqrs"));   // apbqrs
        System.out.println(mergeAlternately("", "xyz"));      // xyz
    }
}
