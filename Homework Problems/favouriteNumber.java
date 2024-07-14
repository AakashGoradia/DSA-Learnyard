//Alice likes even numbers which are multiples of 7
//Bob likes odd numbers which are multiples of 9
//Else charlie

import java.util.*;


public class favouriteNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();

        String home = ((A%2==0 && A%7==0) ? "Alice" : ((A%2!=0 && A%9==0) ? "Bob" : "Charlie"));

        System.out.println(home);
    }
}
