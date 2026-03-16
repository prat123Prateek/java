public class LinearSearch2 {
    public static void main(String[] args){
        int[] num= {233,45,37,69};
        int target=69;
        int ans=linearsearch(num,target);

    }

    static  int linearsearch(int[] arr , int target){
        for( int index=0; index<arr.length; index++){
            int element=arr[index];
            if(element==target) {
                System.out.println(index);
                System.out.println(arr[index]);
            }
        }

        return -1;
    }

}
