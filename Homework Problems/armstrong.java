//armstrong number or not

import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =input.nextInt();
        int check = n;
        int sum = 0;
        int i = 0;
        while(n>0){
            i=n%10;
            n=n/10;
            sum = sum + i*i*i;
        }
        if(sum==check){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
