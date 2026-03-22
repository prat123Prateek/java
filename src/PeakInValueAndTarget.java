public class PeakInValueAndTarget {
    public static void main(String[] args){
        int[] arr ={1,2,3,5,6,7,5,3,2};
        int target=7;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int peak=PeakIndexInMountainInArray(arr);
        int start=0;
        int firsttry=OrderAgnostic(arr, target, start , peak);
        if(firsttry!= -1){
            return firsttry;
        }
        else{
            return OrderAgnostic(arr, target, peak, arr.length-1);
        }
    }
    static int PeakIndexInMountainInArray(int[] arr){
        int start=0;
        int end=arr.length -1;

        while(start<end){
            int mid=start +( end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;


    }
    static int OrderAgnostic(int[] arr, int target, int start, int end){
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if(arr[mid]>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(arr[mid]>target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }

        }
        return -1;
    }


}
