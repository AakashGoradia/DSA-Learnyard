//Print numbers from 1 to n, where if 3 or its multiple, then print fizz, if 5 or its multiple, print buzz instead of that number

import java.util.*;

public class fizzbuzz {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }

        input.close();
    }
}
