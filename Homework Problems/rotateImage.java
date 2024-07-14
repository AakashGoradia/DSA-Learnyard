//rotate matrix in place by 90 degree

import java.util.*;

public class rotateImage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] matrix=new int[n][n];
        int[][] b=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        // Populate the rotated matrix
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                b[k][n - 1 - i] = matrix[i][k];
            }
        }

        // for(int i=0;i<n;i++){
        //     if(i==0){
        //         for(int k=0;k<n;k++){
        //             b[k][n-1]=matrix[i][k];
        //         }
        //     }
        //     else if(i!=0 && i!=n-1){
        //         for(int k=0;k<n;k++){
        //             b[k][n-i]=matrix[i][k];
        //         }
        //     }
        //     else if(i==n-1){
        //         for(int k=0;k<n;k++){
        //             b[k][0]=matrix[n-1][k];
        //         }
        //     }
        // }
        System.out.println("Rotated Matrix:");
        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(b[i]));
        }
    }
}
