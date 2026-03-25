import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args){
        int[] arr = {8,2,4,1,3,7,5,6};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Cyclic(int[] arr){
        for(int i=0 ; i<arr.length;){
            int correctindex = arr[i]-1;
           if( arr[i] != arr[correctindex]){
               swap(arr, i, correctindex);
           }
           else{
               i++;
           }

        }

    }
    static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
