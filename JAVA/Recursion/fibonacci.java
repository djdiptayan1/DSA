
/*
 * N th Fibonacci number 
 */
import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = fibo(n);
        System.out.println(s);
        
    }
    static int fibo(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibo(n-1)+fibo(n-2);
    }
}
