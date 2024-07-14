//Find the median of a given sorted array

import java.util.*;

public class MedianOfSortedArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        float[] arr=new float[n];
        float median=0;

        for(int i=0;i<n;i++){
            arr[i]=input.nextFloat();
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        if(n%2==1){
            median=arr[((n+1)/2)-1];
            System.out.println(median);
        }
        else if(n%2==0){
            median=(arr[(n/2)-1]+arr[((n/2)+1)-1])/2;
            System.out.println(median);
        }

        input.close();
    }
}
