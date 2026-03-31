public class PowOfTwo {
    public static void main(String[] args){
        int n=30;
        System.out.println(powof2(n));

    }
    static boolean powof2(int n){
        boolean ans=(n & (n-1))==0;
        return ans;
    }
}
