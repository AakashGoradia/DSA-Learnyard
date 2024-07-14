//find jewels in stones

import java.util.*;

public class jewelsAndStones {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String jewels=sc.next();
        String stones=sc.next();
        int count=0;
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                if(jewels.charAt(i)==stones.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
