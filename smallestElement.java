package arryas;

public class smallestElement {
    public static int smallest(int[] arr){
        int smallElement = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[smallElement]>arr[i]){
                smallElement = i;
            }
        }
        return arr[smallElement];
    }
    public static void main(String[] args) {
        int[] a = {2,4,5,6};
        System.out.println(smallest(a));
    }
}
