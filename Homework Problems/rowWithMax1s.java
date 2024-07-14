//return 0 based index row with max no. of 1's

import java.util.*;

public class rowWithMax1s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int index=0;
        int max=0;
        int count=0;
        int[][] a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<m;j++){
                if(a[i][j]==1){
                    count=count+1;
                }
            }
            if(count>max){
                max=count;
                index=i;
            }
        }
        if(max==0){
            System.out.println(-1);;
        }
        else{
            System.out.println(index);
        }
    }
}
