

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args){
        int[] arr= {3, 4, 5, 6, 6, 6, 6, 7};
        int target=6;
        int[] ans=(SearchRange(arr,target));
        System.out.println(Arrays.toString(ans));
    }

     public static int[] SearchRange(int[] arr, int target) {

         int[] ans = {-1, -1};
         int start=search(arr,target,true);
         int end=search(arr,target,false);

         ans[0]=start;
         ans[1]=end;

         return ans;
     }


     static int search(int[] arr, int target,boolean findfirst ){
         int start=0;
         int end=arr.length -1;
         int ans=-1;

        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if(findfirst){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }
        }
        return ans;

        }
    }

