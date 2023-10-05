package searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n  = sc.nextInt();

        int[] arr = new int[n];


        System.out.println("enter the elements in array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("enter the element to be searched");
        int k = sc.nextInt();

        int s = search(arr, k, n);
        if(s==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at: "+(s+1));
        }


    }

    public static int search(int[] arr,int key,int n){
        for(int i=0; i<n; i++){
            if(arr[i]==key){
                return i;
            }
        }

        return -1;
    }
}
