public class SimplePatterns {
    public static void main(String[] args) {
        pattern8(4);
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


        static void pattern2 ( int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }

        }

        static void pattern3(int n){
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n+1-i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        }

    static void pattern4 ( int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i=1 ; i<=n/2 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        for(int i=n/2+1 ; i<=n ; i++){
            for(int j=1 ; j<=n+1-i ; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    //MOST IMPORTANT PATTER [ DIAMOND PATTER ]
    static void pattern6(int n) {
        for (int i = 1; i <= n * 2 - 1; i++) {
            int stars = i <= n ? i : n * 2 - i;

            int spaces = n - stars;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }


            for (int j = 1; j <= stars; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    static void pattern7(int n){
        for(int i=1 ; i<n ; i++){
            for(int spaces=0 ; spaces<=n-i ; spaces++){
                System.out.print(" ");
            }
            for(int j=i ; j>=1 ; j--){
                System.out.print(j);
            }
            for(int j=2 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }

    static void pattern8(int n){
        for(int i=1; i<=n*2-1; i++){
            int c= (i<=n) ? i : n*2-i;

            for(int spaces=0 ; spaces<=n-c ; spaces++){
                System.out.print(" ");
            }
            for(int j=c; j>=1 ; j--){
                System.out.print(j);
            }
            for(int j=2 ; j<=c ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}



