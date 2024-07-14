//return the frequent 2 gram substring

import java.util.*;

public class twoGram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String temp;
        int count=0;
        int max=0;
        String freq=" ";
        for(int i=0;i<s.length()-1;i++){
            if(i==s.length()-2){
                temp=s.substring(i);
            }
            else{
                temp=s.substring(i, i+2);
            }
            count=0;
            for(int j=i+1;j<s.length()-1;j++){
                if(j==s.length()-2 && s.substring(j).equals(temp)){
                    count++;
                }
                else if(s.substring(j,j+2).equals(temp)){
                    count++;
                }
            }
            if(count>=max){
                max=count;
                freq=temp;
            }
        }
        System.out.println(freq);
    }
}
