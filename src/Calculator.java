import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the operator:");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
        int ans = 0;
        while(true){
            char op =sc.next().trim().charAt(0);
//            System.out.println();
            if(op =='+'|| op =='-'|| op =='*'|| op =='%'|| op == '/'){
                System.out.println("enter a number:");
                int a=sc.nextInt();
                System.out.println("enter a number:");
                int b=sc.nextInt();
                if( op == '+'){
                    ans=a+b;
                }
                if(op == '-'){
                    ans=a-b;
                }
                if(op == '*'){
                    ans=a*b;
                }
                if(op == '%'){
                    ans=a%b;
                }
                if(op == '/'){
                    if(b!=0) {
                        ans = a / b;
                    }
                }
                System.out.println(ans);


                }
            else {
                System.out.println("invalid operator");
            }


        }
    }
}
