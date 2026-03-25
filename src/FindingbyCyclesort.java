import java.util.Arrays;

public class FindingbyCyclesort {
    public static void main(String[] args){
        int[]arr={1,2,5,3,0,2,5,7,};
        find(arr);

        System.out.println(Arrays.toString(arr));

       int ans=missing(arr);
       System.out.println(ans);

    }
    static void find(int[]arr){
        for(int i=0;i<arr.length;){
            int correctindex = arr[i] ;
            if(arr[i]<arr.length && arr[i]!=arr[correctindex]){
                swap(arr, i, correctindex );
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[]arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int missing(int[] arr){
        for (int i=0;i<arr.length;i++){
        if(arr[i]!=i){
            return i;
        }
//        else{
//            return arr[arr.length];
//        }
       }
        return arr[arr.length];

    }

}
