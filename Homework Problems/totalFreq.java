//return total frequencies of maximum frequencies elements

import java.util.*;

public class totalFreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arr2=new int[n];
        boolean flag=true;
        int times=0;
        int max=arr[0];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            arr2[i]=1;
            for(int j=0;j<i;j++){
                if(arr[j]==arr[i]){
                    arr2[i]=arr2[i]+1;
                    flag=false;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        if(flag==true){
            System.out.println(arr.length);
        }
        else{
            for(int i=0;i<n;i++){
                if (arr2[i]>max) {
                    max=arr2[i];
                }
            }
            for(int i=0;i<n;i++){
                if(arr2[i]==max){
                    times=times+1;
                }
            }
            System.out.println(max*times);
        }
    }
}

