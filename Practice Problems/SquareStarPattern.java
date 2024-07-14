//for n=3 print,        for n=4 print,
//***                   ****
//***                   ****
//***                   ****
//                      ****


import java.util.*;

public class SquareStarPattern {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
