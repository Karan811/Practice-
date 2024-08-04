package LeetCode;

import java.net.StandardSocketOptions;

public class ReverseWordsString {
    public static String reverseWords(String s) {
        String trimmedInput = s.trim(); // Trim leading and trailing spaces
        System.out.println(trimmedInput);
        String[] strArray = trimmedInput.split("\\s+");
        
        StringBuilder result = new StringBuilder();

        for(int i=strArray.length-1;i>=0;i--){
            result.append(strArray[i].trim());
            if (i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String args[]){
        String s= " Here is the sky ";
        System.out.println(reverseWords(s));
    }
}
