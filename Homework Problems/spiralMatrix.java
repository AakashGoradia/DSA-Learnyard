//return spiral index

import java.util.*;

public class spiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] mat=new int[n][m];
        ArrayList<Integer> al=new ArrayList<Integer>();

        int rowStart=0;
        int rowIndex=0;
        int rowEnd=n-1;

        int colStart=0;
        int colIndex=0;
        int colEnd=m-1;

        int length=n*m;
        int current;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<length;i++){
            current=mat[rowIndex][colIndex];
            al.add(current);
            if(rowIndex==rowStart && colIndex<colEnd){
                colIndex++;
            }
            else if(colIndex==colEnd && rowIndex<rowEnd){
                rowIndex++;
            }
            else if(rowIndex==rowEnd && colIndex>colStart){
                colIndex--;
            }
            else if(colIndex==colStart && rowIndex==rowEnd){
                rowStart++;
                colEnd--;
                rowIndex--;
            }
            else if(colIndex==colStart && rowIndex>rowStart){
                rowIndex--;
            }
        }
        System.out.println(al);
    }
}
