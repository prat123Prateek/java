public class SumByRecursion {
    public static void main(String[] args){
       // summation(10);
        System.out.println(summation(10));
    }
    static int summation(int n){
        if (n<= 1){
            return 1 ;
        }
        return n + summation(n-1);
    }
}
