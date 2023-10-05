package arryas;

public class MaximumSumSubArray {
    /*
    ******************************************************
    ****************** KADANE'S ALGORITHM ****************
    ******************************************************
     */
    public static int maxSumSubArray(int[] arr){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            curSum = curSum + arr[i];
            if(maxSum < curSum)maxSum = curSum;
            if(curSum < 0)curSum = 0;
        }
        return maxSum;
    }
    public static void main(String[] args){
        int[] a = {6,-7,4,-2,1,5,-4};
        System.out.println(maxSumSubArray(a));
    }
}
