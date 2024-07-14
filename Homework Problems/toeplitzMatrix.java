//return true if toeplitz

import java.util.*;

public class toeplitzMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        boolean flag=true;
        int[][] matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n-1;i++){
            for(int j=n-2;j>=0;j--){
                if(matrix[i][j]==matrix[i+1][j+1]){
                    continue;
                }
                else{
                    flag=false;
                    break;
                }
            }
            if(flag==false){
                break;
            }
        }
        System.out.println(flag);
    }
}
