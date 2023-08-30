package arryas;

import java.util.Arrays;

public class RotateMatrix90 {

    public static  void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int left = 0;
            int right = matrix[i].length - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args){
        int a[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

       rotate(a);

    }
}
