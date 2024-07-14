//rectangle Pattern
import java.util.*;

public class rectanglePattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();

        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
