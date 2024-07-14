//return a string to lower case

import java.util.*;

public class toLowerCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1="";
        int temp1=0,temp2=0;
        char temp3='#';
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            temp1=(int)s.charAt(i);
            if(temp1>=65 && temp1<=90){
                temp2=temp1+32;
                temp3=(char) temp2;
                s1=s1+temp3;
            }
            else{
                s1=s1+s.charAt(i);
            }

        }
        System.out.println(s1);
    }
}
