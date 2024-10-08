package InterviewProblems;

import java.util.Stack;

public class DecryptAString {

    //Have to descrypt a String
    /*

    Example 1:
Input:  3[abc]4[ab]c
abc abc abc ab ab ab ab c
Output: abcabcabcababababc

Example 2:
Input: 3[ab2[c]]4[ab]c
Abcc abcc abcc  ab ab ab ab c
Output: Abccabccabccababababc

    * */

    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0'); // Form the number
            } else if (ch == '[') {
                countStack.push(k);
                resultStack.push(current);
                current = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                StringBuilder decodedString = resultStack.pop();
                int count = countStack.pop();
                for (int i = 0; i < count; i++) {
                    decodedString.append(current);
                }
                current = decodedString;
            } else {
                current.append(ch);
            }
        }
        return current.toString();
    }

    public static void main(String[] args) {
        String input1 = "3[abc]4[ab]c";
        String input2 = "3[ab2[c]]4[ab]c";

        System.out.println("Example 1:");
        System.out.println("Input: " + input1);
        System.out.println("Output: " + decodeString(input1));

        System.out.println("Example 2:");
        System.out.println("Input: " + input2);
        System.out.println("Output: " + decodeString(input2));
    }
}
