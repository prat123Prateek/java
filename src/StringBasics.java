import java.util.Arrays;

public class StringBasics {
   public static void main(String[] args) {
       String series="  ";
       for (int i=0; i<26; i++){
           char ch=(char)('a'+i);
           series= series + "  " + ch;
       }
       System.out.println(series);

       String str="prateek kumar verma";
       System.out.println(Arrays.toString(str.toCharArray()));

       System.out.println("prateek".strip());
       System.out.println(Arrays.toString(str.split(" ")));


    }
}
