//no of employees who worked target hours

import java.util.*;

public class targetHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] hours = new int[n];
        int c=0;
        int target = sc.nextInt();
        for(int i=0;i<n;i++){
            hours[i]=sc.nextInt();
            if(hours[i]>=target){
                c=c+1;
            }
        }
        System.out.println(c);
    }
}
