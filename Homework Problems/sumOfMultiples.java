//from range 1 to n, fund all the numbers sum divisible by 3,5, or 7.

import java.util.*;

public class sumOfMultiples {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n =input.nextInt();
        int sum = 0;

        for(int i = 1;i<=n;i++){
            if(i%3==0 || i%5==0 || i%7==0){
                sum=sum+i;
            }
        }

        System.out.println(sum);

    }
}
