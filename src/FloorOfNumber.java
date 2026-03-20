public class FloorOfNumber {
    public static void main(String[] args){
        int[] arr= {4, 5, 6, 8, 10, 12, 13, 15, 17};
        int target=10;
        int ans=floor(arr, target);
        System.out.println(ans);
    }
    static int floor(int[] arr,int target){
        if (target > arr[arr.length -1]){
            return -1;
        }

        int start=0;
        int end=arr.length-1;

        while(start<=end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }

        }
        return arr[end];
    }
}
