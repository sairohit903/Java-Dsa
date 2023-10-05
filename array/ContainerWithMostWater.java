package arryas;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));

    }

    public static int maxArea(int[] arr) {
        int l = 0, r = arr.length-1, maxarea = 0;
        while(l<=r){
            int height = Math.min(arr[l],arr[r]);
            int distance = r-l;
            int area = distance * height;
            maxarea = Math.max(maxarea, area);
            if(arr[l] < arr[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxarea;
    }
}
