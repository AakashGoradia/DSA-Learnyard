//count sorted rows

import java.util.*;

public class countSortedRows {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[][] a=new int[N][M];
        boolean flag_asc=true;
        boolean flag_dsc=true;
        int count=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            flag_asc=true;
            flag_dsc=true;
            for(int j=0;j<M-1;j++){
                if(a[i][j]<=a[i][j+1]){
                    continue;
                }
                else{
                    flag_asc=false;
                    break;
                }
            }
            for(int j=0;j<M-1;j++){
                if(a[i][j]>=a[i][j+1]){
                    continue;
                }
                else{
                    flag_dsc=false;
                    break;
                }
            }
            if(flag_asc==true || flag_dsc==true){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
