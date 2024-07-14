//Add digits
//M-1
import java.util.*;

public class addDigits {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int N = input.nextInt();
        int sum = 0;

        while(N>0){
            sum = sum + N%10;
            N = N/10;

            if(N==0){
                if(sum/10==0){
                    break;
                }
                N=sum;
                sum=0;
            }
        }

        System.out.println(sum);
    }
}

//M2
// return (N-1)%9 + 1;
