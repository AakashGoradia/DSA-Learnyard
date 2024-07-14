//gcd of 2 numbers

import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

//        M-2: Euclidean Algorithm
//        ---------------------------------------
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
//        M-1: Brute Force
//        --------------------------------------
//        int min=0,gcd=0;
//
//        if(a<b){
//            min=a;
//        }
//        else{
//            min=b;
//        }
//        for(int i=min;i>0;i--){
//            if(a%i==0 && b%i==0){
//                gcd=i;
//                break;
//            }
//        }
//        System.out.println(gcd);
    }
}
