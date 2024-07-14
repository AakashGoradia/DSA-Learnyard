//a+b+c+d = n, gcd(a,b) = lcm(c,d)

import java.util.*;

public class gcdVSlcm {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n,a,b=1,c=1,d=1;
        while(t>0){
            t=t-1;
            n = sc.nextInt();
            a = n-3;
            System.out.println(a+" "+b+" "+c+" "+d);
        }
    }
}