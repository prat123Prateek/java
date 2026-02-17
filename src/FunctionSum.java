import java.util.Scanner;

public class FunctionSum {
    public static void main(String[] args){
        int ans = Sum();
        System.out.println(ans);
    }
    static int Sum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter 1st no:");
        int a=sc.nextInt();
        System.out.print("enter 2nd number:");
        int b=sc.nextInt();
        int summation= a + b;
        return summation ;


    }
}
