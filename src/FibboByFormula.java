public class FibboByFormula {
    public static void main(String[] args){
        int n=10;
        for(int i=0;i<=n;i++){
            System.out.print(fibbo(i) + " ");
        }



    }
    static int fibbo(int n){


      return (int) (Math.pow(((1 + Math.sqrt(5)) / 2) , n) / Math.sqrt(5));
    }
}
