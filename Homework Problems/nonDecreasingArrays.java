import java.util.*;

public class nonDecreasingArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=0;
        }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<n;i++){
            for(int j=1;;j++){
                if(i==0){
                    if(j%a[i]==0){
                        b[i]=j;
                        break;
                    }
                }
                else if(j%a[i]==0 && j>=b[i-1]){
                    b[i]=j;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
