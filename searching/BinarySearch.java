package searching;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {-4,-3,-2,-1,0,1,2,3,4};
        int k = 1;

        int ans = binarysearch(arr,k);
        System.out.println(ans);

    }
    static int binarysearch(int arr[],int key){
        int start = arr[0];
        int end = arr.length-1;

        while(start <= end){

            int mid = start + (end-start)/2;
            // we can take (start - end)/2,but we took start + (end-start)/2
            // because if start and end values are too big then it may exceed the int range,and we may get
            // array index out of bound exception

            if(key > arr[mid]){
                start = mid + 1;
            }else if(key < arr[mid]){
                end = mid - 1;
            }else{
                // ans found
                return mid;
            }
        }
      return -1;
    }
}
