//whether sum of numbers from 1 to N divides Product of numbers from 1 to N

import java.util.*;

public class doesItDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        //M1-Partially Accepted
        // int n,sum,pro;
        // while(t>0){
        //     t=t-1;
        //     n=sc.nextInt();
        //     sum=0;
        //     pro=1;
        //     for(int i = 1;i<=n;i++){
        //         sum=sum+i;
        //         pro=pro*i;
        //     }
        //     if(pro%sum==0){
        //         System.out.println("YES");
        //     }
        //     else{
        //         System.out.println("NO");
        //     }

        //M2 - Partially Accepted
        while(t>0){
            t=t-1;
            int n = sc.nextInt();
            boolean isPrime = true;
            for(int i=2;i<((n+1)/2);i++){
                if((n+1)%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime==false){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

        
    }
}
