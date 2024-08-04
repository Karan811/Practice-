import java.sql.SQLOutput;

public class ReverseStringWords {


        String reverseWords(String S)
        {
            String[] stringArray = S.split("\\.");
            StringBuilder sb = new StringBuilder();
            for(int i=stringArray.length-1;i>=0;i--) {
                sb= sb.append(stringArray[i]).append(".");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println("Output is -"+sb);

            return sb.toString();
        }

        public static void main(String args[]){
            ReverseStringWords rs = new ReverseStringWords();
            System.out.println("Final output -"+rs.reverseWords("i.like.this.program.very.much"));
        }

}
