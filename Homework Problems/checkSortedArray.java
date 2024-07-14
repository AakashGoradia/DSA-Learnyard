//check if an array is sorted or not

import java.util.Scanner;

public class checkSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        boolean flag=true;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                flag=false;
                break;
            }
        }
        if(flag==false){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
