//return sum of diagonals

import java.util.*;

public class matrixDiagonalSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[][] mat=new int[n][n];
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        //M1: O(N)

        //primary diagonal
        for(int i=0;i<mat.length;i++){
            sum=sum+mat[i][i];
        }
        //secondary diagonal
        for(int i=0;i<mat.length;i++){
            sum=sum+mat[i][mat.length-1-i];
        }

        if(mat.length%2==1){
            System.out.println(sum-mat[mat.length/2][mat.length/2]);
        }
        else{
            System.out.println(sum);
        }

        //M2: Brute Force
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(i==j || j==n-1-i){
        //             sum=sum+mat[i][j];
        //         }
        //     }
        // }

        // System.out.println(sum);
    }
}
