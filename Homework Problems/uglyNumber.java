//ugly number: prime factors limited to 2,3 and 5

import java.util.*;

public class uglyNumber {
    //        M-2: Greatest divisible Power
//        ---------------------------------------------

    static int maxDivide(int a, int b){

        if(a==0){
            return a;
        }
        else{
            while(a%b==0){
                a=a/b;
            }
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        n = maxDivide(n,2);
        n = maxDivide(n,3);
        n = maxDivide(n,5);

        if(n==1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


//        M-1: Brute Force
//        ---------------------------------------------
//        boolean flag = true;
//        boolean prime_flag = true;
//
//        for(int i=2;i<=(n/2+1);i++){
//            if(n%i==0){
//                prime_flag=false;
//                break;
//            }
//        }
//
//        if(n==1 || n==2 || n==3 || n==5){
//            System.out.println("true");
//        }
//        else if(prime_flag==true){
//            System.out.println("false");
//        }
//        else{
//            for(int i=2;i<=n/2;i++){
//                if(i==2 || i==3 || i==5){
//                    continue;
//                }
//                if(i%2==0 || i%3==0 || i%5==0){
//                    continue;
//                }
//                if(n%i==0){
//                    flag=false;
//                    break;
//                }
//
//            }
//            if(flag==true){
//                System.out.println("true");
//            }
//            else{
//                System.out.println("false");
//            }
//        }
//        --------------------------------------------------------

    }
}
