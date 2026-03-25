
    import java.util.Arrays;

    public class FindDuplicates {

        public static void main(String[] args) {
            int[] arr = {4,3,2,7,8,2,3,1};

            int[] duplicates = findDuplicates(arr);

            System.out.println("Duplicates: " + Arrays.toString(duplicates));
        }

        static int[] findDuplicates(int[] arr) {

            // Step 1: Cyclic sort
            int i = 0;
            while (i < arr.length) {
                int correct = arr[i] - 1;

                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }

            // Step 2: Count duplicates
            int count = 0;
            for (i = 0; i < arr.length; i++) {
                if (arr[i] != i + 1) {
                    count++;
                }
            }

            // Step 3: Store duplicates
            int[] duplicates = new int[count];
            int index = 0;

            for (i = 0; i < arr.length; i++) {
                if (arr[i] != i + 1) {
                    duplicates[index++] = arr[i];
                }
            }

            return duplicates;
        }

        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }


