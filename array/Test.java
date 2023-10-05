package arryas;
import java.util.*;

class Test {
    public static int search(int[] nums, int target) {
        int pivot = findingPivotElement(nums);
        if(pivot == -1){
            return binarySearch(nums, target, 0, nums.length-1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }
    // function to find the pivot element
    public static int findingPivotElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            // four cases
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
    // function for search element in range using binary search
    public static int binarySearch(int[] arr, int key, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(key > arr[mid]){
                start = mid + 1;
            }else if(key < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 1;
        int ans = search(arr,target);
        System.out.println(ans);
    }
}