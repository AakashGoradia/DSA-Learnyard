//Power of 2

import java.util.*;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

//        Method 2: Little optimized
//        --------------------------------------
//        if(n==1){
//            return true;
//        }
//        else if(n%2==0 && n>0){
//            n=n/2;
//            int i = 1;
//            while(i<=n){
//                if(i==n){
//                    return true;
//                }
//                i=i*2;
//            }
//        }
//        return false;


//        Method-1: Brute Force
//        ------------------------------------
        if(n==0){
            System.out.println("false");
        }
        else if(n==1){
            System.out.println("true");
        }
        else if(n%2==0){
            int i = 2;
            while(i<=n){
                if(i==n){
                    System.out.println("true");
                    break;
                }
                i=i*2;
            }
        }
        else{
            System.out.println("false");
        }
    }
}
