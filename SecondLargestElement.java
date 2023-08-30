package arryas;

public class SecondLargestElement {
    public static int secondLargest(int[] arr){
        int largest = 0, sl = -1;

        for(int  i = 1; i<arr.length; i++){
            if(arr[i] >arr[largest]){
                sl = largest;
                largest = i;
            }else if(arr[i]<arr[largest]){
                if(sl==-1 || arr[i]>arr[sl]){
                    sl = i;
                }
            }
        }
        return arr[sl];
    }
    public static void main(String[] args){
        int[] arr = {2,3,5,66,7,8,10};

        System.out.println(secondLargest(arr));
    }
}
