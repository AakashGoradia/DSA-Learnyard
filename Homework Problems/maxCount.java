//return the number with highest frequency in an array and its count

import java.util.*;

public class maxCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arr2=new int[n];
        int max=arr[0];
        int num=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            arr2[i]=1;
            for(int j=0;j<i;j++){
                if(arr[j]==arr[i]){
                    arr2[i]=arr2[i]+1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        for(int i=0;i<n;i++){
            if (arr2[i]>max) {
                max=arr2[i];
                num=arr[i];
            }
            else if(arr2[i]==max){
                if(arr[i]<num){
                    num=arr[i];
                }
            }
        }
        System.out.println("The maximum frequency element is "+num+" with frequency "+max);
    }
}
