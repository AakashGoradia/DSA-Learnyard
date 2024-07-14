//plus or minus

import java.util.*;

public class plusOrMinus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a+b==a-b){
            System.out.println("+");
        }
        else{
            if(a+b==c){
                System.out.println("+");
            }
            if(a-b==c){
                System.out.println("-");
            }
        }
    }
}
