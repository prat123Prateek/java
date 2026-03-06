import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);



            //Syntax:
            //datatype[] variable name=new datatype[size];
            //OR
            // DIRECTLY==> INT[] ROLLNO=={10,20,78,90};
            // int[] size;  //declaration of an array. size is getting defined in the stack
            //size = new size[5];  //initializing the size : actually here the object is being created in the heap memory
            //initially the values in all array indices will be 0.


            String[] arr = new String[4];
            System.out.println(arr[0]);
            // output will be null

            int[] name=new int[5];
            System.out.print("enter elements of an array :");

               //taking input using for loop
            for ( int i=0;i<name.length;i++) {
                name[i] = sc.nextInt();
            }
               //printing array elements
            for(int i=0; i<name.length; i++){
                System.out.print(name[i] + " ");
            }


        }
}
