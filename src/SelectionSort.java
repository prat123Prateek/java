import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {2, 4, 8, 5, 7, 6};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionsort(int[] arr){
        for (int i = 0 ; i<arr.length-1 ; i++){
            int lastIndex =arr.length-i-1;
            int maxIndex=getmaxindex(arr, 0, lastIndex);
            swap(arr, maxIndex, lastIndex );
        }
    }
    static void swap(int[] arr, int maxindex,int lastindex){
        int temp=arr[maxindex];
        arr[maxindex]=arr[lastindex];
        arr[lastindex]=temp;
    }
    static int getmaxindex(int[] arr, int start, int end){
        int max=start;
        for(int i=0 ; i<=end ; i++){
            if(arr[max] < arr[i]){
                max=i;
            }
        }
        return max;
    }
}
