package InterviewProblems;

import java.util.Arrays;

public class PermutationInStringRecursions {

        public static boolean isPermutationPresent(String s1, String s2) {
            if (s1.length() > s2.length()) {
                return false;
            }
            return checkRecursively(s1, s2, 0);
        }

        private static boolean checkRecursively(String s1, String s2, int start) {
            // Base case: If the start index is beyond the valid range
            if (start + s1.length() > s2.length()) {
                return false;
            }

            // Check if the substring is a permutation of s1
            String substring = s2.substring(start, start + s1.length());
            if (arePermutations(s1, substring)) {
                return true;
            }

            // Recursive step: Move to the next index
            return checkRecursively(s1, s2, start + 1);
        }

        private static boolean arePermutations(String s1, String s2) {
            // Helper method to check if two strings are permutations of each other
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        }

        public static void main(String[] args) {
            String s1 = "bca";
            String s2 = "uewyeeddjdhdhcba";

            boolean result = isPermutationPresent(s1, s2);
            System.out.println("Is a permutation of s1 present in s2? " + result);
        }


}
