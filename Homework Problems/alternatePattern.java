//alternate 1 and 0 pattern

import java.util.*;

public class alternatePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N=input.nextInt();
        int M=input.nextInt();

        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                if(i%2!=0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.print("\n");
        }
    }
}
