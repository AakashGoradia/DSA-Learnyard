//replace elements in an array with greatest elements on their right side

import java.util.*;

public class replaceElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<n-1;i++){
            max=0;
            for(int j=i+1;j<n;j++){
                if(a[j]>max){
                    max=a[j];
                }
            }
            a[i]=max;
        }
        a[n-1]=-1;
        System.out.println(Arrays.toString(a));
    }
}
