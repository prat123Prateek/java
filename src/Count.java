import java.util.Scanner;

public class Count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter a number:");
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            if(n%10==5) {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
