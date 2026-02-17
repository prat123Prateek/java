import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        int rev=0;
        while(n!=0){
            int ld=n%10;
            rev=rev*10;
            rev=rev+ld;
            n=n/10;

        }
        System.out.println("reverse no. is: " + rev);


    }
}
