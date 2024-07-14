//reverse an array of char

import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] s=new char[n];
        char temp=' ';
        for(int i=0;i<n;i++){
            s[i]=sc.next().charAt(0);
        }
        System.out.println(Arrays.toString(s));
        for(int i=0;i<s.length/2;i++){
            temp=s[s.length-i-1];
            s[s.length-i-1]=s[i];
            s[i]=temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
