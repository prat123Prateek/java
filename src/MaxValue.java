

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {12, 35, 67, 57, 89};
        System.out.println(max(arr));

    }

    static int max(int[] arr) {
        int maxval = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxval < arr[i]) {
                maxval = arr[i];
            }
        }
        return maxval;
    }
}



