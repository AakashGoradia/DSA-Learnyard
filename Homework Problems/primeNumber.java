//Prime or not

import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

//        M-1: Brute Force
//        -------------------------------------
        boolean flag = true;

        if(n==0 || n==1){
            System.out.println("Non-prime");
        }
        else{
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                System.out.println("Prime");
            }
            else{
                System.out.println("Non-prime");
            }
        }

//        M-2: Little optimized
//        ---------------------------------------------
//        if(N<=1){
//            return 0;
//        }
//        else if(N==2){
//            return 1;
//        }
//        else if(N%2==0){
//            return 0;
//        }
//        for(int i=3;i<=Math.sqrt(N);i=i+2){
//            if(N%i==0){
//                return 0;
//            }
//        }
//
//        return 1;
    }
}
