public class FibboByRecursion {
    public static void main(String[] args){
        int n=50;
        System.out.println(fibbonacci(n)); //NOT GOOD FOR LARGE NUMBERS
    }
    static int fibbonacci(int n){
        if(n<2){
            return n;
        }
        return fibbonacci(n-1)+fibbonacci(n-2);
    }
}
