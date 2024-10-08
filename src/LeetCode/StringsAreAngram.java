package LeetCode;


import java.lang.reflect.Array;
import java.util.Arrays;

//Given two strings, check if both are anagrams
//Silent and listen are anagrams
class StringsAreAnagram {

    public static void main(String arg[]){
        StringsAreAnagram.isAnagram("listen","silent");
    }
    public static boolean isAnagram(String str1, String str2){

        if(str1.length()!=str2.length()){
            return false;
        }
        // Convert strings to char arrays
        char[] str1arr = str1.toCharArray();
        char[] str2arr = str2.toCharArray();

        // Sort both char arrays
        Arrays.sort(str1arr);
        Arrays.sort(str2arr);

        // Compare sorted arrays
        return Arrays.equals(str1arr, str2arr);
    }

}
