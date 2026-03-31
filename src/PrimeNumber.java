import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
//        for(int i=2 ; i<=n ; i++){
//                System.out.println( i + " " +  isprime(i));
//            }
        System.out.println( n + " " +  isprime(n));
        }
        static boolean isprime(int n){
        if(n<2){
            return false;
//            System.out.println(" not prime");
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
               // System.out.println("not prime");
            }
            c++;
        }
        return  true;//System.out.println("is prime");

        }
    }

