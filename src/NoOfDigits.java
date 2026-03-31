public class NoOfDigits {
    public static void main(String[] args){
        int n=8;
        int b=10;
        int ans= (int)(Math.log(n) / Math.log(b)) +1 ; //THIS MEANS=log of n with base b
        System.out.println(ans);
    }
}
