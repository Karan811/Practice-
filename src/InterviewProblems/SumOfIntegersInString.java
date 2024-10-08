package InterviewProblems;

public class SumOfIntegersInString {

    public static void main(String[] args) {
       // sumOfIntegersInStringMethod("a10bb10de11");
       System.out.print(" Result "+ integerIsPalindrom(123454322));
    }

    public static void sumOfIntegersInStringMethod(String input){

        String temp="0";
        char[] chars = input.toCharArray();
        int result =0;
        for(int i=0;i<input.length();i++){
            if(Character.isDigit(chars[i])){
                temp = temp+chars[i];
            }else{
                result=result+Integer.parseInt(temp);
                temp ="0";
            }

        }
        result=result+Integer.parseInt(temp);
        System.out.println(result);
    }

    public static boolean integerIsPalindrom(int num) {

        boolean result = false;
        int backup = num;
        int temp = 0;
        int rev = 0;
        while (num > 0) {
            temp = num % 10;
            rev = (rev * 10) + temp;
            num=num/10;
        }
        if (rev == backup) {
            result = true;
        }

        return result;
    }
}
