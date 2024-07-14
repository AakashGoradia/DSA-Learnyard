//given an array of digits, increment the number by 1

import java.util.*;

public class plusOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n+1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i+1]=a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        for(int i=n;i>=0;i--){
            if(b[i]!=9){
                b[i]=b[i]+1;
                break;
            }
            else{
                b[i]=0;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
