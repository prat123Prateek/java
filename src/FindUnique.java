public class FindUnique {
    public static void main(String[] args){
        int[] arr= {1,2,3,4,3,2,1};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        int unique=0;
        for(int i=0;i<arr.length;i++){
            unique=unique^arr[i];
        }
        return unique;
    }
}
