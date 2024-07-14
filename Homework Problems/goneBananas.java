import java.util.*;

public class goneBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
        int n = sc.nextInt();
        if(n<3){
            System.out.println("No");
        }
        else{
            int flag = 0;
            for(int i = 2;flag==0 && i<n;i++){
                if(n%i==0){
                    flag = 1;
                    System.out.println("Yes");
                }
            }
            if(flag==0){
                System.out.println("No");
            }

        }
        t=t-1;
        }
    }
}
