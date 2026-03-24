import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args){
        int[] arr={5, 3, 6, 2, 7, 1};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr){
        for(int  i=0 ; i<=arr.length-1 ; i++){
            for(int j=1 ; j<=arr.length-i-1 ; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
