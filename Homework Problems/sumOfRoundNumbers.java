//represent n as sum of round numbers

import java.util.*;

public class sumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int total=0, m=1;
        int arr[] = new int[6];

        for(int i=1; i<6;i++){
            arr[i]=n%10;
            n=n/10;
            if(arr[i]!=0){
                total=total+1;
            }
        }
        System.out.println(total);
        for(int i=1;i<6;i++){
            if(arr[i]!=0){
                System.out.print(arr[i]*m+" ");
            }
            m=m*10;
        }
    }
}
