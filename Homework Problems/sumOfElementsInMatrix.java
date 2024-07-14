//return sum of matrix in an array

import java.util.*;

public class sumOfElementsInMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[][] matrix= new int[N][M];
        int sum=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                matrix[i][j]=sc.nextInt();
                sum=sum+matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
