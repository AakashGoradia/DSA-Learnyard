//return number of special positions (i,j) if (i,j)==1 and ith row elements and jth column elements=0

import java.util.*;

public class specialPositionsBinaryMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] mat=new int[n][m];
        int count=0;
        boolean flag=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            flag=true;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    for(int k=0;k<m;k++){
                        if(k==j){
                            continue;
                        }
                        else{
                            if(mat[i][k]!=0){
                                flag=false;
                                break;
                            }
                        }
                    }
                    if(flag==false){
                        break;
                    }
                    else{
                        for(int k=0;k<n;k++){
                            if(k==i){
                                continue;
                            }
                            else{
                                if(mat[k][j]!=0){
                                    flag=false;
                                    break;
                                }
                            }
                        }
                    }
                    if(flag==true){
                        count=count+1;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
