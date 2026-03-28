public class Palindrome {
    public static void main(String[] args){
        String str="12321";
        System.out.println(palin(str));
    }

    static boolean palin(String str){
        for(int i=0 ;i<str.length()/2 ;i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 -i);
            if (start == end) {
                return true;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
