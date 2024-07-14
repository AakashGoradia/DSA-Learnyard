//return number of good pairs

import java.util.*;

public class goodPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j] && i<j){
                    c=c+1;
                }
            }
        }
        System.out.println(c);
    }
}
