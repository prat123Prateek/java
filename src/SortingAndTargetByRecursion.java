public class SortingAndTargetByRecursion {
    static void main(String[] args) {
        int[] arr = {2,4,6,7,9,10};
        int target=9;
        int  index=0;
//        System.out.println(sort(arr,index));
        System.out.println(target(arr,target,index));
        System.out.println(targetIndex(arr,target,index));

    }
    static boolean sort(int[] arr , int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sort(arr ,index+1);
    }
    static boolean target(int[] arr, int target, int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || target(arr,target,index+1);
    }
    static int targetIndex(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return targetIndex(arr,target,index+1);
        }
    }

