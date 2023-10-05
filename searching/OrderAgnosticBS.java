package searching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-4,-3,-2,-1,0,1,2,3,4};
        int[] arr = {43,34,33,32,31,22,21,19,17,13,10,9,6,1};
        int k = 6;

        int ans = orderAgnosticBS(arr,k);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int arr[], int key){
        int start = 0;
        int end = arr.length-1;

        // finding weather the given array is sorted in ascending and descending order
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){

            int mid = start + (end-start)/2;
            // we can take (start - end)/2,but we took start + (end-start)/2
            // because if start and end values are too big then it may exceed the int range,and we may get
            // array index out of bound exception

            if(arr[mid] == key){
                return mid;
            }

            if(isAsc){
                if(key > arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(key < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
