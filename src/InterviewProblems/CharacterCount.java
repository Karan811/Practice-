package InterviewProblems;

public class CharacterCount {

    public static void main(String args[]){
        String s= "banana";
        char[] charArr = s.toCharArray();
        long count = s.chars().count();
        System.out.println(count);
    }


}
