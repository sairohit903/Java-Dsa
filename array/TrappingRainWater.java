package arryas;

public class TrappingRainWater {
//    public int trap(int[] height) {
//        int[] l = new int[height.length];
//        int[] r = new int[height.length];
//
//        //left
//        l[0] = height[0];
//        for(int i = 1; i<height.length; i++){
//            l[i] = Math.max(height[i],l[i-1]);
//        }
//
//        //right
//        r[height.length-1] = height[height.length-1];
//        for(int i = height.length-1; i>1; i--){
//            r[i] = Math.max(height[i],r[i-1]);
//        }
//
//        int sum = 0;
//        for(int i = 0; i<height.length; i++){
//            int area = Math.min(l[i],r[i])-height[i];
//            sum = sum + area;
//        }
//        return sum;
//    }
    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] r = new int[height.length];
        //right
        r[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i>=0; i--){
            r[i] = Math.max(height[i],r[i+1]);
        }

        for(int x: r){
            System.out.println(x);
        }
    }
}
