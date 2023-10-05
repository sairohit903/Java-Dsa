package arryas;

public class ThirdLargestElement {
    public static int thirdLargestElement(int[] arr){
        if(arr.length <= 3){
            return -1;
        }

        int first = arr[0], second = Integer.MIN_VALUE,
                third = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }else if (arr[i] > second) {
                third = second;
                second = arr[i];
            }else if (arr[i] > third) {
                third = arr[i];
            }
        }

        return arr[third];
    }
    public static void main(String[] args){
        int[] a = {7,2,1,6,4};
        System.out.println(thirdLargestElement(a));
    }
}
