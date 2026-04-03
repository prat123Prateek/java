public class GCD_HCF {
    public static void main(String[] args){
        int a=45, b=105;
        System.out.println(gcd(a,b));

    }
    static int gcd(int a, int b){
        if(a==0){
            return b;
        }

        return gcd((b%a),a);
    }
}
