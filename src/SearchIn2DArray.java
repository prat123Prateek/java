import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 3, 4, 6},
                {7, 8, 9, 10},
                {11, 12, 13, 16},
                {17, 18, 19, 20}
        };
        int target = 19;
        int[] ans=search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] matrix, int target){
        int r= 0;
        int c= matrix.length - 1;

        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[] {r,c};
            }
            else if(matrix[r][c]>target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[] {-1,-1};
    }
}