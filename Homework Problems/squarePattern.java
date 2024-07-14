//Square Pattern

import java.util.*;

public class squarePattern{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}