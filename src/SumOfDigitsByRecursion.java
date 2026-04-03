public class SumOfDigitsByRecursion {
    public static void main(String[] args){
        int n=1567;

        System.out.println(sum(n ));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        int ld=n%10;

       return ld + sum(n/10 );
    }
}
