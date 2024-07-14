//one of 3 is different

import java.util.*;

public class oddOneOut {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c =input.nextInt();

        int odd = ((a==b) ? c : ((a==c) ? b : a));

        System.out.println(odd);
    }
}
