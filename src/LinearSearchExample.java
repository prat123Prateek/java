public class LinearSearchExample {
    public static void main(String[] args){
        String str="prateek";;
        char target='e';
        boolean ans=linear(str,target);
        System.out.println(ans);
    }
    static boolean linear(String str ,char target){
        for(int i=0; i<str.length(); i++){
           // String element=str.charAt(i);
            if(str.charAt(i)==target){
                return true;
            }

        }
        return false;

    }


}
