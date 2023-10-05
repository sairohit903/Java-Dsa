package arryas;

public class LeaderInArray {
    public static void leaders(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i]>largest){
                largest = arr[i];
                System.out.print(largest + " ");
            }
        }
    }
    public static void main(String[] args){
        int[] a = {2,7,6,4,1,3};
        leaders(a);
    }
}
