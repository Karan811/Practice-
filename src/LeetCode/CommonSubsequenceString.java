package LeetCode;

import java.net.SocketOption;

public class CommonSubsequenceString {

    public static void main(String[] arg){
        String result= CommonSubsequenceString.gcdOfStrings("ababab","abab");
        System.out.println("String common divisor: "+result);
    }
    public static String gcdOfStrings(String t1, String t2) {
        if (!(t1+t2).equals(t2+t1)){
            return "";
        }

        return t1.substring(0,gcp(t1.length(),t2.length()));
    }

    private static int gcp(int a,int b){
        if(b==0){
            return a;
        }else{
          return gcp(b,a%b);
        }
    }
}
