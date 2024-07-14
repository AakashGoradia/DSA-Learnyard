//Reverse an array

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        int temp=0;

        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        for(int i=0;i<(n/2);i++){
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }

        System.out.println(Arrays.toString(arr));

        input.close();
    }
}
