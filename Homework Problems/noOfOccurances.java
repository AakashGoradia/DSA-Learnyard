//return count of x

import java.util.*;

public class noOfOccurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr= new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==x){
                count=count+1;
            }
        }
        System.out.println(count);

    }
}
