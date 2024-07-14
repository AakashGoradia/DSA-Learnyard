//for n=3 print,        for n=4 print,
//***                   ****
// ***                   ****
//  ***                   ****
//                         ****

import java.util.*;

public class RhombusStarPattern {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int i=0;i<n;i++){

            for(int k=0;k<i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<=n;j++){
                System.out.print("*");
            }

            System.out.print("\n");

        }
    }
}
