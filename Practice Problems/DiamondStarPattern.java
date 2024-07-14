//for n=5 print,
//    *                 
//   ***                   
//  *****                  
// *******             
//*********
// *******
//  *****
//   ***
//    *

import java.util.*;

public class DiamondStarPattern {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        for(int i=1;i<=2*n;i=i+2){
            for(int j=n-1;j>=i/2;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int i=2*n-1;i>1;i=i-2){
            for(int j=n-1;j>=(i/2)-1;j--){
                System.out.print(" ");
            }
            for(int k=2;k<=i-1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
