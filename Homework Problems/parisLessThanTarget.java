//return number of pairs whose sum is less than target

import java.util.*;

public class parisLessThanTarget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]<t){
                    c=c+1;
                }
            }
        }
        System.out.println(c);
    }
}
