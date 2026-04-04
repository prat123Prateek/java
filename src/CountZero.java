public class CountZero {
    static void main(String[] args) {
        System.out.println (count(120706050));

    }
    static int count(int n){
        if(n==0){
            return 0;
        }
        int c=0;
        if(n%10==0){
           c++;
        }
        return c + count(n/10);
    }
}
