import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args){
        int[] arr={2,4,1,3,2};
        int[] ans=sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] sort(int[] arr){
        for (int i=0; i<arr.length; ){
            int correctindex=arr[i]-1;
            if(arr[i]!=arr[correctindex]){
                swap(arr, i, correctindex);
            }
            else{
                i++;
            }

        }
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=i+1){
                return new int[]{arr[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
