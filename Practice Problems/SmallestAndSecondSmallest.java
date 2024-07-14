//Find the smallest and second smallest number in an given array of length n.

import java.util.*;

public class SmallestAndSecondSmallest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for(int i=0;i<n;i++){
            if(arr[i]<min1){
                min2=min1;
                min1=arr[i];
            }
            else if(arr[i]!=min1 && arr[i]<min2){
                min2=arr[i];
            }
        }

        if(min2==Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(min1);
            System.out.println(min2);

        }

        input.close();
    }
}
