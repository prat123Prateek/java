public class EvenInArray {
    public static void main(String[] args){
        int[] arr={12,345,3424,486945};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        int count=0;
        for (int i=0;i<arr.length; i++){
            if(even(arr[i])){
                count++;
            }
        }
        return count;
        }

        //FUNCTION TO CHECK WHEATHER GIVEN NUMBER IS EVEN OR  NOT....
        static boolean even(int arr){
        int numberofdigits = digits(arr);
        if(numberofdigits % 2==0){
            return true;
        }
        return false;

        }

        //COUNT NO OF DIGITS....
        static int digits(int arr){
        int count=0;

        while(arr>0){
            count++ ;
            arr=arr/10;
        }
        return count;
        }



}
