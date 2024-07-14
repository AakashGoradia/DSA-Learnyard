import java.util.*;

public class SumEqualToK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();

        for(int i = 1; i<=n ; i++){
            int sum=0;
            for(int j=i;j>=1;j=j/10){
                sum = sum+j%10;
            }
            if(sum==k){
                System.out.println(i+":"+k);
            }
        }
    }
}
