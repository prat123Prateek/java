public class Factor {
    static void main(String[] args) {
        int n=20;
        factor2(n);
    }
        static void factor1(int n) {

        for (int i = 2; i <= n; i++) {
                if (n%i==0){
                    System.out.print(i + " ");
                }
            }
        }

    static void factor2(int n) {

        for (int i = 2; i*i <= n; i++) {
            if (n%i==0){
                if(n/i==i){
                    System.out.print(i);
                }
                else{
                    System.out.print(i + " " + n/i + " ");
//                    System.out.print(n/i + " ");
                }

            }
        }
    }

}
