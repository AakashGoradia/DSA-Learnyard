//return transpose of a matrix

import java.util.*;

public class transposeMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int temp=0;
        int[][] mat=new int[n][m];
        int[][] b=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int[] row: mat){
            System.out.println(Arrays.toString(row));
        }
        System.out.println('\n');
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[j][i]=mat[i][j];
            }
        }
        for(int[] row: b){
            System.out.println(Arrays.toString(row));
        }
    }
}
