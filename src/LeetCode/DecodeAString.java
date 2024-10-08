package LeetCode;

import java.util.Stack;

public class DecodeAString {

    public static void main(String args[]){
        System.out.println(DecodeAString.decodeStringFun("3[a2[c]]"));
    }

    public static String decodeStringFun(String s) {

        char[] charArr = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        int k=0;
        StringBuffer sbTemp = new StringBuffer();
        for(char a:charArr){

            if(Character.isDigit(a)){
                 k=a-'0';
            }else if(a=='['){
                stack.push(k);
            }else if(a==']') {
                Integer num = (Integer) stack.pop();
                while(k>0) {
                    sb.append(sbTemp);
                    k--;
                }
                sbTemp= new StringBuffer();
                System.out.println(sb.toString());
            }else{
                sbTemp.append(a);
            }

        }
        return sb.toString();
    }
}
