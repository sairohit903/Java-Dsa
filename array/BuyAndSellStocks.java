package arryas;

public class BuyAndSellStocks {

    static int BestTimeToBuyOrSellStocks(int arr[]){
        int maxDiff = Integer.MIN_VALUE, curDiff = 0, l = 0, r = arr.length-1 ;
        while(l<r){
            curDiff = arr[r] - arr[l];
            if(curDiff > maxDiff) maxDiff = curDiff;
            if(curDiff < 0) curDiff = 0;
            if(arr[l]>arr[r]){
                l++;
            }else{
                r--;
            }
        }
        if(maxDiff < 0) return 0;
        return maxDiff;
    }

    public static void main(String[] args){
        int a[] = {2,1,4};
        System.out.println(BestTimeToBuyOrSellStocks(a));
    }
}
