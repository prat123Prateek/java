import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



            //Syntax:
            //datatype[] variable name=new datatype[size];
            //OR
            // DIRECTLY==> INT[] ROLLNO=={10,20,78,90};
            // int[] size;  //declaration of an array. size is getting defined in the stack
            //size = new size[5];  //initializing the size : actually here the object is being created in the heap memory
            //initially the values in all array indices will be 0.


//            String[] arr = new String[4];
//            System.out.println(arr[0]);
//            // output will be null
//
//        int[] name= new int[5];
//        System.out.print("enter the numbers:");
//
//               //taking input using for loop
//            for ( int i=0;i<name.length;i++) {
//                name[i] = sc.nextInt();
//            }
//            System.out.println(Inputs.toString(name));
//
//               //printing array elements
////            for(int i=0; i<name.length; i++){
////                System.out.print(name[i] + " ");
//            }
                // using for each loop
//        for(int arr : name){
//            System.out.print(arr + " ");
//        }
        int[][] arr = new int[3][3];
        System.out.print("enter elements of an arrays:");

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col]=sc.nextInt();
            }
        }
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");           }
            System.out.println();
        }


     }
}
