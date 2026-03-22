public class SearchInRotatedSortedArray {
    public static void main(String[] args){
        int[] arr={2, 3, 4, 6, 8, 7, 5,1};
        int target=7;
        System.out.println(search(arr,target));

    }
     static int search(int[] num, int target){
        int pivot=findpivot(num);

        //if array is not sorted
        if(pivot==-1) {
            return binarySearch(num, target, 0, num.length-1);
        }

        //if pivot is found, then we have 2 asc sorted array
         if(num[pivot]==target){
             return pivot;
         }
         if(num[0]<target){
             return binarySearch(num,target,0,pivot-1);
         }
         return binarySearch(num,target,pivot+1,num.length-1);



     }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

       //this will find the pivot element
        static int findpivot(int[] num){
        int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(num[mid]>num[mid+1]){
                return mid;
            }// PIVOT will be mid
            if(num[mid]<num[mid-1]){
                return mid-1; //PIVOT will be mid-1
            }
            if(num[start]<=num[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;

     }
}


