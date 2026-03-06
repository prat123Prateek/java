
import java.util.Arrays;
public class PassingarraysinFunction {
    public static void main(String[] args){
        int[] num= {1,2,4,5};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }
    static void change(int[] arr){
        arr[2]= 20;

        System.out.println(Arrays.toString(arr));
    }
}
