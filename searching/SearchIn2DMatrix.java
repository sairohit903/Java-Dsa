package searching;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60},
              };
        System.out.println(searchMatrix(arr, 7));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;

        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return true;
            }
            if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return false;
    }
}
