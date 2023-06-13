//leetcode problem to find total number of even-digit number in a array

//return (int) (Math. log10 (num)) + 1;

import java.util.*;

public class evendigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER LENGTH OF ARRAY");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter elements");
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (iseven(arr[i]))
                count++;
        }
        System.out.println(count);
    }

    static boolean iseven(int n) {
        if (digits(n) % 2 == 0)
            return true;
        else
            return false;
    }

    static int digits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

}
