//return true if palindrome after removing one char

import java.util.*;

public class validPalindrome2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String ss1,ss2,ssa,ssb,new1="",new2="";
        boolean flag1=true;
        boolean flag2=true;
        boolean flag0=true;
        System.out.println(s);
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1) && i==0){
                flag0=false;
                new1=s.substring(0, s.length()-1);
                new2=s.substring(1);
                break;
            }
            else if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                flag0=false;
                ss1=s.substring(0, s.length()-i-1);
                ss2=s.substring(s.length()-i);
                ssa=s.substring(0,i);
                ssb=s.substring(i+1);
                new1=ss1+ss2;
                new2=ssa+ssb;
                break;
            }
        }
        if(flag0==true){
            new1=s;
            new2=s;
        }
        System.out.println(s);
        for(int i=0;i<new1.length()/2;i++){
            if(new1.charAt(i)!=new1.charAt(new1.length()-i-1)){
                flag1=false;
                break;
            }
        }
        for(int i=0;i<new2.length()/2;i++){
            if(new2.charAt(i)!=new2.charAt(new2.length()-i-1)){
                flag2=false;
                break;
            }
        }
        if(flag1==true || flag2==true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
