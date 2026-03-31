public class MagicNumber {
    public static void main(String[] args){
        int n=8;
        System.out.println(magic(n));

    }
    static int magic(int n){
       // int count=0;
        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=base*last;
            base=base*5;
          //  count++;
        }
       // System.out.println(count);
        return ans;
    }
}
