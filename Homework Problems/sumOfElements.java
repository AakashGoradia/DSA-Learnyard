//sum of elements of a given array

import java.util.*;

public class sumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);
    }
}
