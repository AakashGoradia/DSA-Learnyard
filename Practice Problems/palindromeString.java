//return true if a string is palindrome

import java.util.*;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                flag=false;
                break;
            }
        }
        System.out.println(flag);
    }
}
