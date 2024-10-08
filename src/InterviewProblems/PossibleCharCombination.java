package InterviewProblems;


//Using recursion return possible combinations of chars

import java.util.List;

public class PossibleCharCombination {
   public static void main(String args[]){
       char[] arr = {'a','b'};
       int k= 3;
       String result = possibleCombs(arr,"",k);

   }

   public static String possibleCombs(char[] ch,String s,int k){
      if(s.length()==k){
          System.out.println(s);
          return s;
      }

      for(int i=0;i<ch.length;i++){
          possibleCombs(ch,s+ch[i],k);
      }

    return s;
   }


}
