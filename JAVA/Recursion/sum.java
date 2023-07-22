/*
 * Less space and tim complexity
 * 
 * When any function is called from main(), the memory is allocated to it on the stack. A recursive function calls itself, the memory for the called function is allocated on top of memory allocated to the calling function and a different copy of local variables is created for each function call. When the base case is reached, the function returns its value to the function by whom it is called and memory is de-allocated and the process continues.
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
