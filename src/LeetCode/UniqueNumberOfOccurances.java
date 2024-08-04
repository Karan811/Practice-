package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurances {
    public static boolean uniqueOccurrences(int[] arr) {

            HashMap<Integer,Integer> occurrenceMap = new HashMap<>();

        for (int num : arr) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> occurrences = new HashSet<>();

        // Check for unique occurrences
        for (int count : occurrenceMap.values()) {
            if (!occurrences.add(count)) {
                return false; // If we cannot add to the set, the occurrence is not unique
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1, 1, 3};
        System.out.println(uniqueOccurrences(arr1));  // Output: true

        int[] arr2 = {1, 2};
        System.out.println(uniqueOccurrences(arr2));  // Output: false

        int[] arr3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println(uniqueOccurrences(arr3));  // Output: true
    }

}
