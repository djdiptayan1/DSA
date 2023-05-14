import java.util.Scanner;

public class add {
    public <T> void addition(T a, T b) {
        T sum;
        //sum = a + b;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        String a = sc.next();
        System.out.println("enter the second number");
        String b = sc.next();

        add obj = new add();
        obj.addition(a, b);
    }
}
