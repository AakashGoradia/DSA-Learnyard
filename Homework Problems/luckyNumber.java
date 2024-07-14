//return list of lucky numbers

import java.util.*;

public class luckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        boolean min=true;
        boolean max=true;
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                min=true;
                max=true;
                for(int k=0;k<m;k++){
                    if(j==k){
                        continue;
                    }
                    else{
                        if(a[i][k]<a[i][j]){
                            min=false;
                            break;
                        }
                    }
                }
                for(int k=0;k<n && min==true;k++){
                    if(i==k){
                        continue;
                    }
                    else{
                        if(a[k][j]>a[i][j]){
                            max=false;
                            break;
                        }
                    }
                }
                if(max==true && min==true){
                    al.add(a[i][j]);
                }
            }
        }
        System.out.println(al);
    }
}
