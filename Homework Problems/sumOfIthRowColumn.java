//return 1 if sum of ith row and ith column matches

import java.util.*;

public class sumOfIthRowColumn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[][] matrix=new int[N][M];
        int sum_row=0;
        int sum_col=0;
        int flag=1;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            sum_row=0;
            sum_col=0;
            for(int j=0;j<M;j++){
                sum_row=sum_row+matrix[i][j];
            }
            for(int j=0;j<N;j++){
                sum_col=sum_col+matrix[j][i];
            }
            if(sum_row!=sum_col){
                flag=0;
                break;
            }
        }
        System.out.println(flag);
    }
}
