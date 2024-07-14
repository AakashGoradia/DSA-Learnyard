//lexicographically compare 2 strings

import java.util.Scanner;

public class petyaAndStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=new String(sc.nextLine());
        String str2=new String(sc.nextLine());
        int val = str1.compareToIgnoreCase(str2);
        if(val<0){
            System.out.println(-1);
        }
        else if(val>0){
            System.out.println(1);
        }
        else if(val==0){
            System.out.println(0);
        }
    }
}
