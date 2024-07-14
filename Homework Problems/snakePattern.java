//print numbers of matrix in snake pattern

import java.util.*;

public class snakePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[][] matrix=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i%2==0){
                    System.out.print(matrix[i][j]+" ");
                }
                else{
                    System.out.print(matrix[i][matrix.length-1-j]+" ");
                }
            }
        }
    }
}
