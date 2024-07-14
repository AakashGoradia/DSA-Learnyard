//Number of common factors between 2 numbers

import java.util.*;

public class numberOfCommonFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int min,count=0;
        if(a>b){
            min=b;
        }
        else{
            min=a;
        }
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
