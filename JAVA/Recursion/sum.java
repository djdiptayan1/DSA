/*
 * Less space and tim complexity
 */

import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sum(n);
        System.out.println(s);
    }
    public static int sum(int n){
        if(n==0)
            return 0; //BASE CONDITION FOR STACK OVERFLOW (HEAP MEMORY OVERFLOW)
        else
            return n+sum(n-1);
    }
}
