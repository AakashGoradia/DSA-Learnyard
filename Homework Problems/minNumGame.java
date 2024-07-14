//round 1
//alice will remove min num, then bob
//but first bob will insert the removed element into another array, then alice

import java.util.*;

public class minNumGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        for(int i=0;i<n;i=i+2){
            b[i]=a[i+1];
            b[i+1]=a[i];
        }
        System.out.println(Arrays.toString(b));

        //M1-Using ArrayLists
        // int temp=0;
        // int fmin,smin;
        // int findex=0,sindex=0;
        // int n=sc.nextInt();
        // ArrayList<Integer> al = new ArrayList<Integer>();
        // ArrayList<Integer> bl = new ArrayList<Integer>();
        // for(int i=0;i<n;i++){
        //     temp=sc.nextInt();
        //     al.add(temp);
        // }
        // fmin=al.get(0);
        // smin=al.get(0);
        // System.out.println(fmin);
        // System.out.println(smin);
        // System.out.println(al);

        // while(al.size()>0){
        //     for(int j=0;j<al.size();j++){
        //         if(al.get(j)<fmin){
        //             temp=fmin;
        //             fmin=al.get(j);
        //             smin=temp;
                    
        //             temp=findex;
        //             findex=j;
        //             sindex=temp;                     
        //         }
        //     }
        //     bl.add(smin);
        //     bl.add(fmin);
        //     al.remove(findex);
        //     al.remove(sindex);
        // }
        // System.out.println(al);
        // System.out.println(bl);


    }
}
