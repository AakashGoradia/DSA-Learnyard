//Print first n numbers whose sum is equal to k

import java.util.*;

public class First5NumbersEqualToK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int i=1;
        while(n>0){
            int sum=0;
            for(int j=i;j>0;j=j/10){
                sum=sum+j%10;
            }
            if(sum==k){
                System.out.println(i+" : "+k);
                n--;
            }
            i++;
        }
    }
}
