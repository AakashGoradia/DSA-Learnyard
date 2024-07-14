//return true if a phrase is a palindrome after removing non alphanumeric char

import java.util.*;

public class validPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean flag=true;
        System.out.println(s);
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                flag=false;
                break;
            }
        }
        System.out.println(flag);
    }
}
