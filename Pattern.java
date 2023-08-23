package arryas;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;
//        int m = 5;

//        // solid rectangle pattern
//        //outer loop
//        for(int i = 0; i<n; i++){
//            //inner loop
//            for(int j = 0; j<m; j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }



//        // Hollow rectangle pattern
//        //outer loop
//        for(int i = 0; i<n; i++){
//            //inner loop
//            for(int j = 0; j<m; j++){
//                if(i==0 || j==0 || i==n-1 || j==m-1){
//                    System.out.print("*");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // Half pyramid
        //outer loop
//        for(int i = 1; i<=n; i++){
//            //inner loop
//            for(int j = 1; j<=i; j++){
//                    System.out.print("*"+" ");
//            }
//            System.out.println();
//        }

        // Inverted half pyramid
        //outer loop
//        for(int i = n; i>=1; i--){
//            //inner loop
//            for(int j = 1; j<=i; j++){
//                    System.out.print("*"+" ");
//            }
//            System.out.println();
//        }

        // Inverted and rotated half pyramid
        //outer loop
//        for(int i = 1; i<=n; i++){
//            //inner loop
//            for(int j = 1; j<=(n-i); j++){
//                    System.out.print(" "+" ");
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }

        // half pyramid with numbers
        //outer loop
//        for(int i = 1; i<=n; i++){
//            //inner loop
//            for(int j = 1; j<=i; j++){
//                    System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        // Inverted half pyramid with numbers
        //outer loop
//        for(int i = n; i>=1; i--){
//            //inner loop
//            for(int j = 1; j<=i; j++){
//                    System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        // Floyd's triangle
        //outer loop
//        int number = 1;
//        for(int i = n; i>=1; i--){
//            //inner loop
//            for(int j = 1; j<=i; j++){
//                    System.out.print(number+" ");
//                    number++;
//            }
//            System.out.println();
//        }

        // 0-1 triangle
//        for(int i = 1; i<=n; i++){
//            //inner loop
//            for(int j = 1; j<=i; j++){
//                    if((i+j) % 2 == 0){
//                        System.out.print(1+" ");
//                    }else{
//                        System.out.print(0+" ");
//                    }
//            }
//            System.out.println();
//        }

        // parallelogram pattern
//        for(int i = 1; i<=n; i++){
//            //inner loop
//            for(int j = 1; j<=(n-i); j++){
//                    System.out.print("  ");
//            }
//            for(int j = 1; j<=n; j++){
//                System.out.print("*"+" ");
//            }
//
//            System.out.println();
//        }

        // Butter fly pattern
//        for(int i = 1; i<=n; i++){
//            //inner loop
//            for(int j = 1; j<=i; j++){
//                    System.out.print("*"+" ");
//            }
//            for(int j = 1; j<=2*(n-i); j++){
//                System.out.print("  ");
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print("*"+" ");
//            }
//
//            System.out.println();
//        }
//        for(int i = n; i>=1; i--){
//            //inner loop
//            for(int j = 1; j<=i; j++){
//                System.out.print("*"+" ");
//            }
//            for(int j = 1; j<=2*(n-i); j++){
//                System.out.print("  ");
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print("*"+" ");
//            }
//
//            System.out.println();
//        }

        // Number pyramid
//        for(int i = 1; i<=n; i++){
//            //inner loop
//            for(int j = 1; j<=(n-i); j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

        // palindrome number pyramid
//        for(int i = 1; i<=n; i++){
//            //inner loop
//            for(int j = 1; j<=(n-i); j++){
//                System.out.print("  ");
//            }
//            for(int j = i; j>=1; j--){
//                System.out.print(j+" ");
//            }
//            for(int j = 2; j<=i; j++){
//                System.out.print(j+" ");
//            }
//
//            System.out.println();
//        }

        // diamond pattern
//        for(int i = 1; i<=n; i++){
//            //inner loop
//            for(int j = 1; j<=(n-i); j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//        for(int i = n-1; i>=1; i--){
//            //inner loop
//            for(int j = 1; j<=(n-i); j++){
//                System.out.print(" ");
//            }
//            for(int j = 1; j<=i; j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }

        // si pattern
//        for(int i = 1; i<=n; i++){
//            //inner loop
//            for(int j = n; j>=1; j--){
//                if(i==j){
//                    System.out.print("*"+" ");
//                }else{
//                    System.out.print(j+" ");
//                }
//            }
//            System.out.println();
//        }

        // Hollow butterfly pattern
        // First half pattern
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Second half pattern
        for(int i = n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
