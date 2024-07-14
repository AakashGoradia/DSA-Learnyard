//return minimum and maximum element in an array

import java.util.*;

public class returnMinAndMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        long min,max;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        System.out.println(Arrays.toString(arr));
        min=arr[0];
        max=arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }

        System.out.println("Max is "+max+" and Min is "+min);

    }
}
