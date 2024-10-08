package LeetCode;

import java.util.*;

public class ListOfDiffIntsInArray {


    public static void main(String args[]){
        int[] a= {1,2,3,3};
        int[] b={1,1,2,2};
        var result= ListOfDiffIntsInArray.findDifference(a,b);
        System.out.println(result);
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> result1 = new HashSet<>();

        Set<Integer> result2 = new HashSet<>();

        // Find elements in nums1 that are not in nums2
        for (int num : nums1) {
            if (!contains(nums2, num)) {
                result1.add(num);
            }
        }

        // Find elements in nums2 that are not in nums1
        for (int num : nums2) {
            if (!contains(nums1, num)) {
                result2.add(num);
            }
        }

        // Combine the two lists into a list of lists
        List<List<Integer>> result = new ArrayList<>();
        result.add(result1.stream().toList());
        result.add(result2.stream().toList());

        return result;
    }

    public static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}

