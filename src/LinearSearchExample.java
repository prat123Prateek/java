import java.util.Arrays;

public class LinearSearchExample {
    public static void main(String[] args){

        //SEARCH IN STRING..

//        String str="prateek";;
//        char target='e';
//        boolean ans=linear(str,target);
//        System.out.println(ans);
//    }
//    static boolean linear(String str ,char target){
//        for(int i=0; i<str.length(); i++){
//           // String element=str.charAt(i);
//            if(str.charAt(i)==target){
//                return true;
//            }
//
//        }
//        return false;
//
          //FINDING MINIMUM..
//        int[] arr = {12,34,56,74,1,-3};
//        int ans=min(arr);
//        System.out.println(ans);
//
//   }
//   static int min(int[] arr){
//        int minimum=arr[0];
//        for( int i=0;i<arr.length;i++){
//           if(arr[i]<minimum){
//               minimum=arr[i];
//           }
//
//        }
//        return minimum;


        //SEARCH IN 2D....
        int[][] arr ={{12,34,56},
                {23,4,53,4,5},
                {5,6,78,9}
        };
        int target = 9;
        int[] ans=find(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] find(int[][] arr,int target){
        for(int i=0 ; i<arr.length ; i++){
            for(int j = 0; j< arr[i].length; j++){
                if(arr[i][j]==target){
                    System.out.println("number found");
                    return new int[]{i,j} ;
                }

            }
        }
        return new int[]{-1,-1};

    }


}
