import java.util.*;
//larger value of a number can be solved by converting it to a smaller one till the base case is reached. 
public class fibinacci_norecur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i = 2; i <= n; i++) { //STARTING FROM 2 TO PRINT FIRST 5 NUMBERS ONLY
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }

}
