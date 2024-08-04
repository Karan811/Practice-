package LeetCode;

public class MergeStringsAlternatively {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();
        int maxLength = Math.max(length1, length2);

        for (int i = 0; i < maxLength; i++) {
            if (i < length1) {
                mergedString.append(word1.charAt(i));
            }
            if (i < length2) {
                mergedString.append(word2.charAt(i));
            }
        }

        return mergedString.toString();

    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));  // Output: "apbqcr"

        word1 = "ab";
        word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));  // Output: "apbqrs"

        word1 = "abcd";
        word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));  // Output: "apbqcd"
    }
}
