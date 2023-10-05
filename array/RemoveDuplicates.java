package arryas;

// Removing duplicate elements form a sorted array
public class  RemoveDuplicates {

    public static int duplicates(int[] arr){
        int j = 0;
            for(int i = 1; i<arr.length; i++){
                if(arr[j] != arr[i]){
                    arr[j+1] = arr[i];
                    j++;
                }
            }
            return j+1;
    }

    public static void main(String[] args){
        int[] arr = {2,2,3,3,4,4,7,7,7,7};
        duplicates(arr);

        for(int i : arr){
            System.out.print(i);
        }

    }
}
