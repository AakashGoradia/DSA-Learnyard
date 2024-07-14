//return highest sum of a row

import java.util.Scanner;

public class richestCustomerWealth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] matrix=new int[n][m];
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
                sum=sum+matrix[i][j];
            }
            if(sum>=max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
