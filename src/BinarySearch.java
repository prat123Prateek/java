public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 10, 12, 13, 14};
        int target = 14;
        int ans = orderagnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderagnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //check wheather arrays is in asc or dec..
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]==target){
               return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}


//    static int search(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            if (arr[mid] > target) {
//                end = mid - 1;
//            } else if (arr[mid] < target) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//        return -1;
//    }

