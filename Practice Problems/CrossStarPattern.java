//for n=5 print,
//*        *
// *      *
//  *    *
//   *  *
//    *
//   * *
//  *   *
// *     *
//*       *

import java.util.*;

public class CrossStarPattern {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=n;k>i;k--){
                System.out.print(" ");
            }
            for(int l=n;l>i+1;l--){
                System.out.print(" ");
            }
            if(i==n){
                System.out.print("\n");
            }
            else{
                System.out.println("*");
            }
        }

        for(int i=1;i<n;i++){
            for(int j=n;j>i+1;j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i-1;l++){
                System.out.print(" ");
            }
            System.out.println("*");

        }
    }
}
