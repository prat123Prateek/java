//public class FindallMissingNobyCyclicsort {
    import java.util.Arrays;

    public class FindMissingNumbers {

        public static void main(String[] args) {
            int[] nums = {4,3,2,7,5,2,3,1};

            find(nums);
            System.out.println(Arrays.toString(nums));

            int[] result = getMissing(nums);

            System.out.println("Missing numbers: " + Arrays.toString(result));
        }

        // Step 1: Cyclic Sort
        static void find(int[] nums) {
//            int i = 0;
//            while (i < nums.length) {
//                int correct = nums[i] - 1;
//
//                if (nums[i] != nums[correct]) {
//                    swap(nums, i, correct);
//                } else {
//                    i++;
//                }
//            }
           for (int i=0; i<nums.length; ){
               int correctindex=nums[i]-1;
               if(nums[i]!=nums[correctindex]){
                   swap(nums, i, correctindex);
               }
               else{
                   i++;
               }
           }
        }

        // Step 2: Find missing numbers using array
        static int[] getMissing(int[] nums) {

            // First count how many are missing
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i + 1) {
                    count++;
                }
            }

            // Create array of exact size
            int[] missing = new int[count];

            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != i + 1) {
                    missing[index] = i + 1;
                    index=index+1;
                }
            }

            return missing;
        }

        // Swap function
        static void swap(int[] nums, int first, int second) {
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
    }

